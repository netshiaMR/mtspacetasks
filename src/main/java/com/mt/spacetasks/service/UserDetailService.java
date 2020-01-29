package com.mt.spacetasks.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Component;

import com.mt.spacetasks.model.User;
import com.mt.spacetasks.repository.UserDetailRepository;

@Component
public class UserDetailService {
	
	private UserDetailRepository repository;
	
	public List<User> getAllUserDetails() {
		List<User> userList = repository.findAll();
		if(userList.size() > 0) {
			return userList;
		} else {
			return new ArrayList<User>();
		}
	}
	
}
