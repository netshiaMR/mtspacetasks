package com.mt.spacetasks.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mt.spacetasks.model.User;

public interface UserDetailRepository extends JpaRepository<User, Integer> {
	

}
