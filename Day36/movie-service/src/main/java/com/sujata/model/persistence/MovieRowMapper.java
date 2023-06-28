package com.sujata.model.persistence;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.sujata.dto.entity.Movie;

public class MovieRowMapper implements RowMapper<Movie> {

	@Override
	public Movie mapRow(ResultSet resultSet, int rowNum) throws SQLException {
		Movie movie=new Movie();
		
		movie.setMovieId(resultSet.getString("MOVIEID"));
		movie.setMovieName(resultSet.getString("MOVIENAME"));
		
		return movie;
	}

}
