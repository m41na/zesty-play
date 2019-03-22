package com.practicaldime.travel.service;

import com.coxautodev.graphql.tools.SchemaParser;

import graphql.schema.GraphQLSchema;
import graphql.servlet.SimpleGraphQLServlet;

public class TravelEndpoint{

	private static TravelAppContext ctx;

	public static SimpleGraphQLServlet create() {
		return SimpleGraphQLServlet.create(buildSchema());
	}
	
	public static GraphQLSchema buildSchema() {
		ctx = new TravelAppContext();
		ctx.init();
		//get service bean
		TravelService service = ctx.getBean("", TravelService.class);
		return SchemaParser.newParser()
        .file("travel.graphqls") //parse the schema file created earlier
        .resolvers(new TravelQueries(service))
        .build()
        .makeExecutableSchema();
	}
}
