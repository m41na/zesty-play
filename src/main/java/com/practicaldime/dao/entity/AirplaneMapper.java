package com.practicaldime.dao.entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class AirplaneMapper implements RowMapper<Airplane> {

    @Override
    public Airplane mapRow(ResultSet rs, int i) throws SQLException {
    	Airplane plane = new Airplane();
    	//populate bean
		return plane;
    	
    }
}
