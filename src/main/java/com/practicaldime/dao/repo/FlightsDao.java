package com.practicaldime.dao.repo;

import java.util.List;

import com.practicaldime.common.util.AppResult;
import com.practicaldime.dao.entity.Flight;

public interface FlightsDao {

	AppResult<Flight> create(Flight flight);

	AppResult<List<Flight>> retrieve(int start, int size);
}
