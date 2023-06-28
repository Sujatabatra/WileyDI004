package com.sujata.model.persistence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.sujata.dto.entity.Movie;

@Repository
public class MovieDaoImpl implements MovieDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public Movie getRecordById(String id) {
		try {
			return jdbcTemplate.queryForObject("SELECT * FROM MOVIE WHERE MOVIEID=?", new MovieRowMapper(), id);
		}
		catch(EmptyResultDataAccessException ex) {
			return null;
		}
		
	}

}
