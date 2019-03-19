#!node

function processFile(table, inputFile, outFile){
	const fs = require('fs'), 
		readline = require('readline'),
		instream = fs.createReadStream(inputFile),
		outstream = new (require('stream'))(),
		rl = readline.createInterface(instream, outstream);
	
	rl.on('line', line => {
		let params = line.split(/,/).map(sanitize);
		//let params = line.split(/(?<=[\"\dN]),/).map(sanitize);
		let query = `insert into ${table} values (${params.join(",")});\n`;
		fs.appendFile(outFile, query, function(err){
			if(err){console.log(err)}
		});
	});

	rl.on('close', function (line) {
        console.log(line);
        console.log('done reading file.');
    });
   
}

function sanitize(input) {
	const value = input.replace(/^(\"(.*)\")$/, "$2").trim();
	//return value.length == 0? "''" : (/false/.test(value) || /true/.test(value) || !isNaN(value))?
	//value : value.replace(/\'/g, "''").replace(/^(.+)$/, "'$1'");
	return value.length === 0? "''" : value.replace(/\'/g, "''").replace(/^(.+)$/, "'$1'");
}

function processFiles(path){
	const fs = require('fs');
	fs.readdir(path, function(err, items) {
		for(let i = 0; i < items.length; i++){
			let file = path + '/' + items[i];
			fs.stat(file, fileStats(fs, file));
		}
	});
}

function fileStats(fs, file){
	return function(err, stats){
		if(/\.dat/.test(file)){
			console.log(stats['size']);
			let table = file.replace(/\.\/(.+)\.dat.+$/, 'tbl_$1'); 
			let output = file.replace(/(.+)\.dat.+$/, '$1.sql');
			console.log(table, file, output);
			fs.access(output, fs.constants.F_OK, (err) => {
				if(!err) fs.unlinkSync(output);		
				processFile(table, file, output);
			});
		}
	}
}

if(process.argv[2] === '.'){
	processFiles(process.argv[2]);
}
else if(process.argv.length == 5){
	processFile(process.argv[2], process.argv[3], process.argv[4]);
}
else{
	console.log('usage -> ./gen-insert-sql.sh <table_name> <source_file> <dest_file>');
	process.exit(-1);
}
