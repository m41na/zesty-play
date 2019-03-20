package com.practicaldime.travel.dao.entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class FlightMapper implements RowMapper<Flight> {

    @Override
    public Flight mapRow(ResultSet rs, int i) throws SQLException {
    	Flight flight = new Flight();
    	//populate bean
    	flight.origin = rs.getString("orig");
    	flight.originCode = rs.getString("orig_code");
    	flight.originAirport = rs.getString("orig_airport");
    	flight.destCode = rs.getString("dest_code");
    	flight.destAirport = rs.getString("dest_airport");
    	flight.flightCode = rs.getString("flight_code");
    	flight.flightFlag = rs.getString("flight_flag");
    	flight.connect = rs.getString("connect");
        flight.coordinates = rs.getString("coordinates");
		return flight;    	
    }
}
