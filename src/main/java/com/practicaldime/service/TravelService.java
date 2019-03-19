package com.practicaldime.service;

import java.util.List;

import com.practicaldime.common.util.AppResult;
import com.practicaldime.dao.entity.Airline;
import com.practicaldime.dao.entity.Airplane;
import com.practicaldime.dao.entity.Airport;
import com.practicaldime.dao.entity.Country;
import com.practicaldime.dao.entity.Flight;

public interface TravelService {
    
	AppResult<Airline> create(Airline airline);

	AppResult<List<Airline>> findAirliness(int start, int size);
	
	AppResult<Airplane> create(Airplane airplane);

	AppResult<List<Airplane>> findAirplanes(int start, int size);
	
	AppResult<Airport> create(Airport airport);

	AppResult<List<Airport>> findAirports(int start, int size);
	
	AppResult<Country> create(Country country);

	AppResult<List<Country>> retrieveCountries(int start, int size);
	
	AppResult<Flight> create(Flight cou);

	AppResult<List<Flight>> retrieveFlights(int start, int size);
}
