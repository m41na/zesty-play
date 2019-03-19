package com.practicaldime.dao.repo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.practicaldime.common.util.AppResult;
import com.practicaldime.dao.entity.Flight;
import com.practicaldime.dao.entity.FlightMapper;

@Repository
public class FlightsDaoImpl implements FlightsDao{

	private final JdbcTemplate jdbcTemplate;

    public FlightsDaoImpl(@Autowired JdbcTemplate jdbcTemplate) {
        super();
        this.jdbcTemplate = jdbcTemplate;
    }
    
	@Override
	public AppResult<Flight> create(Flight flight) {
		String sql = "insert into tbl_routes (orig, orig_code, orig_airport, dest_code, dest_airport, flight_code, flight_flag, connect, coordinates ) "
				+ "values (?,?,?,?,?,?,?,?,?)";
        int rows = jdbcTemplate.update(sql, new Object[]{flight.origin, flight.originCode, flight.originAirport, 
        		flight.destCode, flight.destAirport, flight.flightCode, flight.flightFlag, flight.connect, flight.coordinates});
        return (rows == 0)?  new AppResult<>(-1, "no record was inserted"): new AppResult<>(flight);
	}

	@Override
	public AppResult<List<Flight>> retrieve(int start, int size) {
		String sql = "select * from tbl_routes limit " + size + " offset " + start;
        List<Flight> countries = jdbcTemplate.query(sql, new FlightMapper());
        return new AppResult<>(countries);
	}
}
