package com.practicaldime.travel.dao.repo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.practicaldime.common.util.AppResult;
import com.practicaldime.travel.dao.entity.Airline;
import com.practicaldime.travel.dao.entity.AirlineMapper;

@Repository
public class AirlinesDaoImpl implements AirlinesDao{

	private final JdbcTemplate jdbcTemplate;

    public AirlinesDaoImpl(@Autowired JdbcTemplate jdbcTemplate) {
        super();
        this.jdbcTemplate = jdbcTemplate;
    }
    
	@Override
	public AppResult<Airline> create(Airline air) {
		String sql = "insert into tbl_airlines (id, name, alias, iata, icao, service, country, active) "
				+ "values (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        int rows = jdbcTemplate.update(sql, new Object[]{air.id, air.name, air.alias, air.iata, air.icao, air.service, air.country, air.active});
        return (rows == 0)?  new AppResult<>(-1, "no record was inserted"): new AppResult<>(air);
	}

	@Override
	public AppResult<List<Airline>> retrieve(int start, int size) {
		String sql = "select * from tbl_airlines limit " + size + " offset " + start;
        List<Airline> airports = jdbcTemplate.query(sql, new AirlineMapper());
        return new AppResult<>(airports);
	}
}
