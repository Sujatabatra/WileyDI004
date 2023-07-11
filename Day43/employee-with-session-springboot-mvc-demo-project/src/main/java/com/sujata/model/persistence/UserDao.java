package com.sujata.model.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.sujata.dto.entity.User;

@Repository
public interface UserDao extends JpaRepository<User, String> {
	
	@Query("from User where userName=:un and password=:pwd")
	public User getUserByUserNameAndPassword(@Param("un") String userName,@Param("pwd") String password);

}
