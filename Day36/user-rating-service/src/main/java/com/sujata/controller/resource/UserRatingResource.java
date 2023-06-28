package com.sujata.controller.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.sujata.dto.entity.UserRatingList;
import com.sujata.model.service.UserRatingService;

@RestController
public class UserRatingResource {

	@Autowired
	private UserRatingService userRatingService;
	
	@GetMapping(path = "/userratings/{uid}",produces = MediaType.APPLICATION_JSON_VALUE)
	public UserRatingList getUserRatingsById(@PathVariable("uid") String userId) {
		return new UserRatingList(userRatingService.getUserRatingByUserId(userId));
	}
}
