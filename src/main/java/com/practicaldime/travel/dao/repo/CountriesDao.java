package com.practicaldime.travel.dao.repo;

import java.util.List;

import com.practicaldime.common.util.AppResult;
import com.practicaldime.travel.dao.entity.Country;

public interface CountriesDao {

	AppResult<Country> create(Country country);

	AppResult<List<Country>> retrieve(int start, int size);
}
