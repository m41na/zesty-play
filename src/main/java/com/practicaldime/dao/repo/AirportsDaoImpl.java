package com.practicaldime.dao.repo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.practicaldime.common.util.AppResult;
import com.practicaldime.dao.entity.Airport;
import com.practicaldime.dao.entity.AirportMapper;

@Repository
public class AirportsDaoImpl implements AirportsDao{

	private final JdbcTemplate jdbcTemplate;

    public AirportsDaoImpl(@Autowired JdbcTemplate jdbcTemplate) {
        super();
        this.jdbcTemplate = jdbcTemplate;
    }
    
	@Override
	public AppResult<Airport> create(Airport air) {
		String sql = "insert into tbl_airports (id, name, city, country, iata, icao, latitude, longitude, altitude, timezone, dst, dbtz, type, source) "
				+ "values (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        int rows = jdbcTemplate.update(sql, new Object[]{air.id, air.name, air.country, air.iata, air.icao, air.latitude, air.longitude, air.altitude,
        		air.timezone, air.dst, air.dbtz, air.type, air.source});
        return (rows == 0)?  new AppResult<>(-1, "no record was inserted"): new AppResult<>(air);
	}

	@Override
	public AppResult<List<Airport>> retrieve(int start, int size) {
		String sql = "select * from tbl_airports limit " + size + " offset " + start;
        List<Airport> airports = jdbcTemplate.query(sql, new AirportMapper());
        return new AppResult<>(airports);
	}
}
