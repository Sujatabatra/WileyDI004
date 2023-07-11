package com.sujata.service;

import java.util.List;

import com.sujata.dto.entity.CustomerShareDetails;

public interface CustomerShareDetailsService {

	List<CustomerShareDetails> getCustomerShareDetailsByCustomerId(String customerId);
}
