package com.practicaldime.travel.service;

import java.util.List;

import com.practicaldime.common.util.AppResult;
import com.practicaldime.travel.dao.entity.Airline;
import com.practicaldime.travel.dao.entity.Airplane;
import com.practicaldime.travel.dao.entity.Airport;
import com.practicaldime.travel.dao.entity.Country;
import com.practicaldime.travel.dao.entity.Flight;

public interface TravelService {
    
	AppResult<Airline> create(Airline airline);

	AppResult<List<Airline>> retrieveAirlines(int start, int size);
	
	AppResult<Airplane> create(Airplane airplane);

	AppResult<List<Airplane>> retrieveAirplanes(int start, int size);
	
	AppResult<Airport> create(Airport airport);

	AppResult<List<Airport>> retrieveAirports(int start, int size);
	
	AppResult<Country> create(Country country);

	AppResult<List<Country>> retrieveCountries(int start, int size);
	
	AppResult<Flight> create(Flight flight);

	AppResult<List<Flight>> retrieveFlights(int start, int size);
}
