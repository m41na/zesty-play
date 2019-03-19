package com.practicaldime.dao.entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class FlightMapper implements RowMapper<Flight> {

    @Override
    public Flight mapRow(ResultSet rs, int i) throws SQLException {
    	Flight flight = new Flight();
    	//populate bean
		return flight;
    	
    }
}
