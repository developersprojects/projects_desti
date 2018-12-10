package com.helptree.product.restcontroller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.helptree.product.model.UserDetailsDto;

@RestController
@RequestMapping("/rest/user")
public class UserController {

	@Autowired
	private RestTemplate restTemplate;

	@GetMapping("/exp")
	public String getname() {

		return restTemplate.getForObject("http://pandey-service/rest/pandey/name/", String.class);
	}

	@GetMapping("/test")
	public String executeTest() {
		return "test-data";
	}

	@GetMapping("/users")
	public List<Object> getUser() {

		ResponseEntity<List<Object>> users = restTemplate.exchange("http://db-service/rest/user/users/", HttpMethod.GET,
				null, new ParameterizedTypeReference<List<Object>>() {
				});

		List<Object> body = users.getBody();
		return body;

	}

	@GetMapping("/users/data")
	public List<UserDetailsDto> getUserDetails() {
		List<UserDetailsDto> udd = new ArrayList<UserDetailsDto>();

		ResponseEntity<List<UserDetailsDto>> users = restTemplate.exchange("http://db-service/rest/user/users/",
				HttpMethod.GET, null, new ParameterizedTypeReference<List<UserDetailsDto>>() {
				});

		List<UserDetailsDto> udetails = users.getBody();

		for (UserDetailsDto u : udetails) {
			UserDetailsDto ud = new UserDetailsDto();
			ud.setUserId(u.getUserId());
			ud.setUserName(u.getUserName());
			udd.add(ud);

		}

		return udd;
	}
	//
	// @GetMapping("/arkas")
	// public String getName() {
	//
	// System.out.println("araka called ");
	// String name =
	// restTemplate.getForObject("http://arka-service/arka/rest/name/",
	// String.class);
	//
	// return name;
	// }

}
