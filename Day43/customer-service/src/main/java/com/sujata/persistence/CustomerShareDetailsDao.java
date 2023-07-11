package com.sujata.persistence;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.sujata.dto.entity.CustomerShareDetails;

@Repository
public interface CustomerShareDetailsDao extends JpaRepository<CustomerShareDetails, Integer> {

	@Query("from CustomerShareDetails where customerId=:cid")
	List<CustomerShareDetails> getCustomerByCustomerId(@Param("cid") String customerId);
}
