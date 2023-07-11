package com.sujata.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.sujata.dto.entity.CustomerShareDetailsList;
import com.sujata.service.CustomerShareDetailsService;

@RestController
public class CustomerShareDetailsResource {

	@Autowired
	private CustomerShareDetailsService customerShareDetailsService;
	
	@GetMapping(path = "/customers/{cId}",produces = MediaType.APPLICATION_JSON_VALUE)
	CustomerShareDetailsList getCustomerByCustomerIdResource(@PathVariable("cId") String cutomerId) {
		return new CustomerShareDetailsList(customerShareDetailsService.getCustomerShareDetailsByCustomerId(cutomerId));
	}
}
