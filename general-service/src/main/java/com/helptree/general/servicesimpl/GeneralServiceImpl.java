package com.helptree.general.servicesimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.helptree.general.dto.LoginDto;
import com.helptree.general.dto.UserDto;
import com.helptree.general.dto.UserMasterDto;
import com.helptree.general.services.GeneralService;


@Service
public class GeneralServiceImpl implements GeneralService{

	@Autowired
	private RestTemplate restTemplate;
	
	
	@Override
	public UserDto getUserResponse(LoginDto logindto) {
			
		UserDto udt= restTemplate.exchange("http://db-service/rest/user/singleuser/" + logindto.getUserName(), HttpMethod.GET,
				null, new ParameterizedTypeReference<UserDto>() {
				}).getBody();
		
		
		
		return udt;
	}


	@Override
	public UserMasterDto registerUser(UserMasterDto userMaster) {
		
		return restTemplate.exchange("http://db-service/rest/user/add", HttpMethod.POST, null,
				new ParameterizedTypeReference<UserMasterDto>() {
				}).getBody();
		
		
		
	}

}
