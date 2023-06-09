package com.sujata.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sujata.dto.entity.User;
import com.sujata.model.persistence.UserDao;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;
	
	@Override
	public User login(User user) {
		return userDao.getUserByUserNameAndPassword(user.getUserName(), user.getPassword());
	}

}
