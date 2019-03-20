package com.practicaldime.travel.dao.entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class AirportMapper implements RowMapper<Airport> {

    @Override
    public Airport mapRow(ResultSet rs, int i) throws SQLException {
    	Airport airport = new Airport();
    	//populate bean
    	airport.id = rs.getLong("airport_id");
    	airport.name = rs.getString("name");
    	airport.country = rs.getString("country");
    	airport.city = rs.getString("city");
    	airport.iata = rs.getString("iata");
    	airport.icao = rs.getString("icao");
    	airport.latitude = rs.getFloat("latitude");
    	airport.longitude = rs.getFloat("longitude");
    	airport.altitude = rs.getFloat("altitude");
    	airport.timezone = rs.getString("timezone");
    	airport.dst = rs.getString("dst");
    	airport.dbtz = rs.getString("dbtz");
    	airport.type = rs.getString("type");
    	airport.source = rs.getString("source");
		return airport;
    	
    }
}
