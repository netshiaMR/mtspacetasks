package com.mt.spacetasks.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mt.spacetasks.model.User;

public interface TasksDetailsRepository extends JpaRepository<User, Integer> {
	
	public Optional<User> findUserByUsername();

}
