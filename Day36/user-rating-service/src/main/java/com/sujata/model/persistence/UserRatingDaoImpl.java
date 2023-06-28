package com.sujata.model.persistence;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.sujata.dto.entity.UserRating;

@Repository
public class UserRatingDaoImpl implements UserRatingDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public List<UserRating> getRecordByUserId(String uId) {
		
		return jdbcTemplate.query("SELECT * FROM USERRATING WHERE USERID=?", new UserRatingMapper(), uId);
		
	}

}
