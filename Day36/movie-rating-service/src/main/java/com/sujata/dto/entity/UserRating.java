package com.sujata.dto.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UserRating {

	int ratingId;
	String userId;
	String movieId;
	int rating;
}
