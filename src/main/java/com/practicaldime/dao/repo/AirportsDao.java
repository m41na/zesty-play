package com.practicaldime.dao.repo;

import java.util.List;

import com.practicaldime.common.util.AppResult;
import com.practicaldime.dao.entity.Airport;

public interface AirportsDao {

	AppResult<Airport> create(Airport airport);

	AppResult<List<Airport>> retrieve(int start, int size);
}
