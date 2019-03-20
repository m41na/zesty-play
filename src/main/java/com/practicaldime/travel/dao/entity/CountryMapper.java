package com.practicaldime.travel.dao.entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class CountryMapper implements RowMapper<Country> {

    @Override
    public Country mapRow(ResultSet rs, int i) throws SQLException {
    	Country country = new Country();
    	//populate bean
    	country.name = rs.getString("name");
    	country.priCode = rs.getString("pri_code");
    	country.secCode = rs.getString("sec_code");
    	country.dst = rs.getString("dst");
		return country;
    	
    }
}
