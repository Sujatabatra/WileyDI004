package com.sujata.service;

import java.util.List;

import com.sujata.dto.entity.CustomerDetail;

public interface CustomerDetailsService {

	List<CustomerDetail> getDetailsByCustomerId(String customerId);
}
