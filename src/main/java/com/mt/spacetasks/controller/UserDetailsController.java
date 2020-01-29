package com.mt.spacetasks.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mt.spacetasks.model.Tasks;
import com.mt.spacetasks.model.User;
import com.mt.spacetasks.service.UserDetailService;

@Controller
@RequestMapping(path = "/api" , produces = { MediaType.APPLICATION_JSON_VALUE })
public class UserDetailsController {
	
	@Autowired
	private UserDetailService userDetailService;

	@GetMapping(path = "/users")
	public ResponseEntity<List<User>>  getAllUser() {
		return new ResponseEntity<>(userDetailService.getAllUserDetails() , HttpStatus.OK) ;
	}

	@GetMapping(path = "/users{id}")
	public Tasks getUserById() {
		return null;
	}
	
	@PostMapping(path = "/users")
	public User createUser() {
		return null;
	}
	
	@PatchMapping(path = "/users")
	public User updateTask() {
		return null;
	}

	@PutMapping(path = "/users{id}")
	public Tasks updateUserByID() {
		return null;
	}
	
	@DeleteMapping(path = "/users{id}")
	public Tasks deleteTaskById() {
		return null;
	}
	
	@DeleteMapping(path = "/users")
	public Tasks deleteAllTask() {
		return null;
	}
	
	
}
