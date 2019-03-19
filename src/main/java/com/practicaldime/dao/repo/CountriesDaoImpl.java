package com.practicaldime.dao.repo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.practicaldime.common.util.AppResult;
import com.practicaldime.dao.entity.Country;
import com.practicaldime.dao.entity.CountryMapper;

@Repository
public class CountriesDaoImpl implements CountriesDao{

	private final JdbcTemplate jdbcTemplate;

    public CountriesDaoImpl(@Autowired JdbcTemplate jdbcTemplate) {
        super();
        this.jdbcTemplate = jdbcTemplate;
    }
    
	@Override
	public AppResult<Country> create(Country country) {
		String sql = "insert into tbl_countries (country, pri_code, sec_code, dst) "
				+ "values (?,?,?,?)";
        int rows = jdbcTemplate.update(sql, new Object[]{country.name, country.priCode, country.secCode, country.dst});
        return (rows == 0)?  new AppResult<>(-1, "no record was inserted"): new AppResult<>(country);
	}

	@Override
	public AppResult<List<Country>> retrieve(int start, int size) {
		String sql = "select * from tbl_countries limit " + size + " offset " + start;
        List<Country> countries = jdbcTemplate.query(sql, new CountryMapper());
        return new AppResult<>(countries);
	}
}
