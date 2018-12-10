package com.helptree.db.servicesimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.helptree.db.model.UserMaster;
import com.helptree.db.repository.UserRepository;
import com.helptree.db.service.UserService;


@Service
public class UserServicesImpl   implements UserService {
 
	
	@Autowired
	private RestTemplate restTemplate;
	
	
	@Autowired
	private UserRepository userRepository;


	@Override
	public UserMaster userDetailsByBusername(String userName) {

		List<UserMaster> umlist = userRepository.findAll();

		for (UserMaster u : umlist) {
			if (u.getUserName().equalsIgnoreCase(userName))
				return u;

		}

		return null;
	}


	@Override
	public UserMaster userDetailsByUserId(Integer userId) {

		List<UserMaster> umlist = userRepository.findAll();

		for (UserMaster u : umlist) {
			if (u.getUserId()==(userId))return u;

		}

		return null;
	}
	
	
	
	
	
	
		
	
	
	
}
