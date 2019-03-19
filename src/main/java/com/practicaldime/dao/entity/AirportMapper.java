package com.practicaldime.dao.entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class AirportMapper implements RowMapper<Airport> {

    @Override
    public Airport mapRow(ResultSet rs, int i) throws SQLException {
    	Airport airport = new Airport();
    	//populate bean
		return airport;
    	
    }
}
