package com.sujata.model.service;

import java.util.List;

import com.sujata.dto.entity.UserRating;

public interface UserRatingService {

	List<UserRating> getUserRatingByUserId(String userId);
}
