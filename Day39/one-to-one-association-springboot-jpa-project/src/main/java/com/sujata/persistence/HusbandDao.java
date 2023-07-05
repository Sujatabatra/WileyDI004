package com.sujata.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sujata.dto.entity.Husband;

@Repository
public interface HusbandDao extends JpaRepository<Husband, Integer> {

}
