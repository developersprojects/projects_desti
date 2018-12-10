package com.helptree.db.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.helptree.db.model.UserMaster;


public interface UserRepository extends JpaRepository<UserMaster, Integer> {
	
	

}
