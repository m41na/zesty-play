package com.practicaldime.travel.service;

import java.util.List;

import com.coxautodev.graphql.tools.GraphQLRootResolver;
import com.practicaldime.travel.dao.entity.Airline;
import com.practicaldime.travel.dao.entity.Airplane;
import com.practicaldime.travel.dao.entity.Airport;
import com.practicaldime.travel.dao.entity.Country;
import com.practicaldime.travel.dao.entity.Flight;

public class Query implements GraphQLRootResolver {

	private final TravelService service;
	
	public Query(TravelService service) {
		super();
		this.service = service;
	}

	public List<Country> countries() {
		return service.retrieveCountries(0, 100).getEntity();
	}
	
	public List<Airplane> airplanes(){
		return service.retrieveAirplanes(0, 100).getEntity();
	}
	
	public List<Airline> airlines(){
		return service.retrieveAirlines(0, 100).getEntity();
	}
	
	public List<Airport> airports(){
		return service.retrieveAirports(0, 100).getEntity();
	}
	
	public List<Flight> flights(){
		return service.retrieveFlights(0, 100).getEntity();
	}
}
