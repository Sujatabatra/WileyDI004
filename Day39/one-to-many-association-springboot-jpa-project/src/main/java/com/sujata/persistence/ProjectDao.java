package com.sujata.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sujata.dto.entity.Project;

@Repository
public interface ProjectDao extends JpaRepository<Project, String> {

}
