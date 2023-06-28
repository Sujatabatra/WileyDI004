package com.sujata.model.persistence;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.sujata.dto.entity.UserRating;

public class UserRatingMapper implements RowMapper<UserRating> {

	@Override
	public UserRating mapRow(ResultSet resultSet, int rowNum) throws SQLException {
		UserRating userRating=new UserRating();
		
		userRating.setRatingId(resultSet.getInt("RATINGID"));
		userRating.setUserId(resultSet.getString("USERID"));
		userRating.setMovieId(resultSet.getString("MOVIEID"));
		userRating.setRating(resultSet.getInt("RATING"));
		
		return userRating;
	}

}
