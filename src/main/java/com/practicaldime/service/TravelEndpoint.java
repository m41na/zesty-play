package com.practicaldime.service;

import com.coxautodev.graphql.tools.SchemaParser;

import graphql.servlet.SimpleGraphQLServlet;

public class TravelEndpoint extends SimpleGraphQLServlet{

	private static final long serialVersionUID = 1L;

	public TravelEndpoint() {
        super(SchemaParser.newParser()
                .file("hello.graphqls") //parse the schema file created earlier
                .resolvers(new Query())
                .build()
                .makeExecutableSchema());
    }
}
