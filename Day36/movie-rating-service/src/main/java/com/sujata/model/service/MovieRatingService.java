package com.sujata.model.service;

import java.util.List;

import com.sujata.dto.entity.MovieRating;

public interface MovieRatingService {

	List<MovieRating> getMovieRatingByUserId(String userId);
}
