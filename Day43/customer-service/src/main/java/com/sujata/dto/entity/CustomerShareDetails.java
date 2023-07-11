package com.sujata.dto.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class CustomerShareDetails {

	@Id
	private int detailId;
	private String customerId;
	private String shareId;
	private String shareType;
	private int quantity;
}
