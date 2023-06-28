package com.sujata.model.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.sujata.dto.entity.Movie;
import com.sujata.dto.entity.MovieRating;
import com.sujata.dto.entity.UserRating;
import com.sujata.dto.entity.UserRatingList;

@Service
public class MovieRatingServiceImpl implements MovieRatingService {

	@Autowired
	private RestTemplate restTemplate;
	
	@Override
	public List<MovieRating> getMovieRatingByUserId(String userId) {
		//give call to user rating and get the list
		//traverse over user rating and pick every movie id
		//call movie service to get movie details
		/*
		 * any rest api can be called with RestTemplate
		 */
		List<MovieRating> movieRatings=new ArrayList<MovieRating>();
		
		//Call USer Rating and get the List of : RatingId,UserId,MovieId,Rating 
		UserRatingList userRatingList= restTemplate.getForObject("http://localhost:8084/userratings/"+userId, UserRatingList.class);
		//Traverse over User Rating
		for(UserRating userRating:userRatingList.getUserRatings()) {
			//For each movie id call movie service, which will return movie id and moviename
			Movie movie=restTemplate.getForObject("http://localhost:8082/movies/"+userRating.getMovieId(), Movie.class);
			
			//pick userid and rating from userrating service and moviename from movie service
			MovieRating movieRating=new MovieRating(userRating.getUserId(), movie.getMovieName(), userRating.getRating());
			
			movieRatings.add(movieRating);
		}
		
		return movieRatings;
	}

}
