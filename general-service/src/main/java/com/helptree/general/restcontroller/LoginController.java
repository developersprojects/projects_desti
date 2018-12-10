package com.helptree.general.restcontroller;

import java.util.List;

import javax.servlet.http.HttpSession;
import javax.ws.rs.POST;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.helptree.general.dto.LoginDto;
import com.helptree.general.dto.UserDto;
import com.helptree.general.dto.UserMasterDto;
import com.helptree.general.services.GeneralService;

@RestController
@RequestMapping("/rest/general")
public class LoginController {

	@GetMapping("/name")
	public String getName() {
		return "name=";
	}

	
	@Autowired
	private GeneralService generalService;
	
	
	
	@PostMapping("/register/validate")
	public UserMasterDto registerUser(@RequestBody UserMasterDto userMaster) {
		
		return generalService.registerUser(userMaster);
	}
	
	
	
	
	

	@PostMapping("/login/validate")
	public boolean login(@RequestBody LoginDto logindto, HttpSession session) {

		boolean validation = false;

		UserDto userresponse = generalService.getUserResponse(logindto);
		
		if (logindto.getUserName().equalsIgnoreCase(userresponse.getUserName())) {
			System.out.println("Valid username :"+logindto.getUserName());
			if (logindto.getPassword().equalsIgnoreCase(userresponse.getPassword())) {
				validation = true;
				System.out.println("Log in");
				session.setAttribute("userid", userresponse.getUserId());
				
				
			}
		}
		return validation;

	}

}
