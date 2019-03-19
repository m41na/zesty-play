package com.practicaldime.dao.repo;

import java.util.List;

import com.practicaldime.common.util.AppResult;
import com.practicaldime.dao.entity.Airplane;

public interface AirplanesDao {

	AppResult<Airplane> create(Airplane airplane);

	AppResult<List<Airplane>> retrieve(int start, int size);
}
