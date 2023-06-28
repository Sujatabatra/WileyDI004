package com.sujata.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sujata.dto.entity.UserRating;
import com.sujata.model.persistence.UserRatingDao;

@Service
public class UserRatingServiceImpl implements UserRatingService {

	@Autowired
	private UserRatingDao userRatingDao;
	
	@Override
	public List<UserRating> getUserRatingByUserId(String userId) {
		return userRatingDao.getRecordByUserId(userId);
	}

}
