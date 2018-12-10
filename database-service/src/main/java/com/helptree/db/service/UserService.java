package com.helptree.db.service;


import com.helptree.db.model.UserMaster;


public interface UserService {
	
	
	
	
	
	public UserMaster userDetailsByBusername(String userName);
	public UserMaster userDetailsByUserId(Integer userId);

}
