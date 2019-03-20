DROP TABLE IF EXISTS tbl_airports;
CREATE TABLE tbl_airports (
    airport_id VARCHAR(5) NOT NULL,
    name CHAR(100) NULL,
    city CHAR(45) NOT NULL,
    country CHAR(45) NULL,
    iata VARCHAR(4),
    icao VARCHAR(4),
    latitude VARCHAR(30),
    longitude VARCHAR(30),
    altitude VARCHAR(5),
    timezone VARCHAR(10),
    dst CHAR(2),
    dbtz VARCHAR(45),
    type VARCHAR(45),
    source VARCHAR(45),
    PRIMARY KEY(airport_id)
);

DROP TABLE IF EXISTS tbl_countries;
CREATE TABLE tbl_countries (
    name VARCHAR(45) NOT NULL,
    pri_code CHAR(2) NULL,
    sec_code CHAR(2) NOT NULL,
    dst CHAR(2) NULL,
    PRIMARY KEY(name)
);

DROP TABLE IF EXISTS tbl_planes;
CREATE TABLE tbl_planes (
    make VARCHAR(50) NOT NULL,
    model VARCHAR(10) NULL,
    name VARCHAR(10) NOT NULL,
    PRIMARY KEY(model)
);

DROP TABLE IF EXISTS tbl_airlines;
CREATE TABLE tbl_airlines (
	id VARCHAR(5) NOT NULL,
    name VARCHAR(100) NOT NULL,
    alias CHAR(30) NOT NULL,
    iata CHAR(5) NULL,
    icao CHAR(5) NULL,
    service CHAR(60) NULL,
    country CHAR(45) NULL,
    active CHAR(1) NULL,
    PRIMARY KEY(id)
);

DROP TABLE IF EXISTS tbl_routes;
CREATE TABLE tbl_routes (
    orig VARCHAR(5) NOT NULL,
    orig_code VARCHAR(5) NOT NULL,
    orig_airport CHAR(5) NULL,
    dest_code CHAR(5) NOT NULL,
    dest_airport CHAR(5) NULL,
    flight_code CHAR(5) NULL,
    flight_flag CHAR(1) NULL,
    connect CHAR(5) NULL,
    coordinates CHAR(40) NULL
);
