package com.sujata.model.persistence;

import java.util.List;

import com.sujata.dto.entity.UserRating;

public interface UserRatingDao {

	List<UserRating> getRecordByUserId(String uId);
}
