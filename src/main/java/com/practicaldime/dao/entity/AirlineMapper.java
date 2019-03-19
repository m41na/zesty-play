package com.practicaldime.dao.entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class AirlineMapper implements RowMapper<Airline> {

    @Override
    public Airline mapRow(ResultSet rs, int i) throws SQLException {
    	Airline airport = new Airline();
    	//populate bean
		return airport;    	
    }
}
