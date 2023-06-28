package com.sujata.controller.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.sujata.dto.entity.MovieRatingList;
import com.sujata.model.service.MovieRatingService;

@RestController
public class MovieRatingResource {

	@Autowired
	private MovieRatingService movieRatingService;
	
	@GetMapping(path = "movieratings/{uid}",produces = MediaType.APPLICATION_JSON_VALUE)
	public MovieRatingList getMovieRatingByUser(@PathVariable("uid") String userId) {
		return new MovieRatingList(movieRatingService.getMovieRatingByUserId(userId));
	}
}
