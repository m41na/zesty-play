package com.practicaldime.service;

import com.coxautodev.graphql.tools.GraphQLRootResolver;

public class Query implements GraphQLRootResolver {

	public String hello() {
		return "Hello World!";
	}
}
