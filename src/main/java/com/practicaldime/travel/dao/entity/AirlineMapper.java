package com.practicaldime.travel.dao.entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class AirlineMapper implements RowMapper<Airline> {

    @Override
    public Airline mapRow(ResultSet rs, int i) throws SQLException {
    	Airline airline = new Airline();
    	//populate bean
    	airline.id = rs.getLong("id");
    	airline.name = rs.getString("name");
    	airline.alias = rs.getString("alias");
    	airline.iata = rs.getString("iata");
    	airline.icao = rs.getString("icao");
    	airline.service = rs.getString("service");
    	airline.country = rs.getString("country");
    	airline.active = rs.getString("active");
		return airline;    	
    }
}
