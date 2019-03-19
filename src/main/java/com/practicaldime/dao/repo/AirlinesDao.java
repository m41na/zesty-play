package com.practicaldime.dao.repo;

import java.util.List;

import com.practicaldime.common.util.AppResult;
import com.practicaldime.dao.entity.Airline;

public interface AirlinesDao {

	AppResult<Airline> create(Airline airline);

	AppResult<List<Airline>> retrieve(int start, int size);
}
