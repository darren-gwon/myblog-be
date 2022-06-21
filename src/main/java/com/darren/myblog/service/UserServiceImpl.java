package com.darren.myblog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.darren.myblog.dto.UserDto;
import com.darren.myblog.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserRepository userRepository;
	
	public boolean checkUser(String user_id) {
		UserDto user = userRepository.selectUser(user_id);
		if(user!=null) {
			return true;
		} else {
			return false;
		}
	}
	
	
}
