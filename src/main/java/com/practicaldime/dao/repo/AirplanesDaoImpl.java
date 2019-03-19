package com.practicaldime.dao.repo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.practicaldime.common.util.AppResult;
import com.practicaldime.dao.entity.Airplane;
import com.practicaldime.dao.entity.AirplaneMapper;

@Repository
public class AirplanesDaoImpl implements AirplanesDao{

	private final JdbcTemplate jdbcTemplate;

    public AirplanesDaoImpl(@Autowired JdbcTemplate jdbcTemplate) {
        super();
        this.jdbcTemplate = jdbcTemplate;
    }
    
	@Override
	public AppResult<Airplane> create(Airplane plane) {
		String sql = "insert into tbl_planes (country, pri_code, sec_code, dst) "
				+ "values (?,?,?,?)";
        int rows = jdbcTemplate.update(sql, new Object[]{plane.name, plane.priCode, plane.secCode, plane.dst});
        return (rows == 0)?  new AppResult<>(-1, "no record was inserted"): new AppResult<>(plane);
	}

	@Override
	public AppResult<List<Airplane>> retrieve(int start, int size) {
		String sql = "select * from tbl_planes limit " + size + " offset " + start;
        List<Airplane> countries = jdbcTemplate.query(sql, new AirplaneMapper());
        return new AppResult<>(countries);
	}
}
