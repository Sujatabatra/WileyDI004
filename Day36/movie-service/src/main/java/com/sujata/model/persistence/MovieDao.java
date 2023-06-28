package com.sujata.model.persistence;

import com.sujata.dto.entity.Movie;

public interface MovieDao {

	Movie getRecordById(String id);
}
