package com.sujata.controller.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.sujata.dto.entity.Movie;
import com.sujata.model.service.MovieService;

@RestController
public class MovieResource {

	@Autowired
	private MovieService movieService;
	
	@GetMapping(path = "/movies/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
	public Movie getMovieByIdResource(@PathVariable("id") String movieId) {
		return movieService.searchMovieById(movieId);
	}
}
