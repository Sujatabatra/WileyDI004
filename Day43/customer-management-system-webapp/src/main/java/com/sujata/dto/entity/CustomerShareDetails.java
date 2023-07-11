package com.sujata.dto.entity;




import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class CustomerShareDetails {

	
	private int detailId;
	private String customerId;
	private String shareId;
	private String shareType;
	private int quantity;
}
