package com.sujata.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sujata.dto.entity.CustomerShareDetails;
import com.sujata.persistence.CustomerShareDetailsDao;

@Service
public class CustomerShareDetailsServiceImpl implements CustomerShareDetailsService {

	@Autowired
	CustomerShareDetailsDao customerShareDetailsDao;
	
	@Override
	public List<CustomerShareDetails> getCustomerShareDetailsByCustomerId(String customerId) {
		return customerShareDetailsDao.getCustomerByCustomerId(customerId);
		
	}

}
