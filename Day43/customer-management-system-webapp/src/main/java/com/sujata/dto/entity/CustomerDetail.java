package com.sujata.dto.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerDetail {

	private String customerId;
	private String shareName;
	private String shareType;
	private int quantity;
	private double unitPrice;
	private double totalValuation;
}
