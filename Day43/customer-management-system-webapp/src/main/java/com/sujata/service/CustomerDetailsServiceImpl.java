package com.sujata.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.sujata.dto.entity.CustomerDetail;
import com.sujata.dto.entity.CustomerShareDetails;
import com.sujata.dto.entity.CustomerShareDetailsList;
import com.sujata.dto.entity.Share;

@Service
public class CustomerDetailsServiceImpl implements CustomerDetailsService {

	@Autowired
	private RestTemplate restTemplate;
	
	@Override
	public List<CustomerDetail> getDetailsByCustomerId(String customerId) {
		
		List<CustomerDetail> customerDetailList=new ArrayList<CustomerDetail>();
		CustomerShareDetailsList customerShareDetailsList= restTemplate.getForObject("http://localhost:8084/customers/"+customerId, CustomerShareDetailsList.class);
		for(CustomerShareDetails customerShareDetails:customerShareDetailsList.getCustomerShareDetails()) {
			
			Share share=restTemplate.getForObject("http://localhost:8082/shares/"+customerShareDetails.getShareId(), Share.class);
			
			CustomerDetail customerDetail=new CustomerDetail(customerId, share.getShareName(), 
					customerShareDetails.getShareType(), customerShareDetails.getQuantity(), 
					share.getMarketValue(),customerShareDetails.getQuantity()*share.getMarketValue() );
			
			customerDetailList.add(customerDetail);
		}
		
		return customerDetailList;
	}

}
