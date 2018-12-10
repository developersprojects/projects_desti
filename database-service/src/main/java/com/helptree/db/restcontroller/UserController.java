package com.helptree.db.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.helptree.db.model.UserMaster;
import com.helptree.db.repository.UserRepository;
import com.helptree.db.service.UserService;

@RestController
@RequestMapping("/rest/user")
public class UserController {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private RestTemplate restTemplate;

	@Autowired
	private UserService userService;

	@GetMapping("/exp")
	public String getExpData() {
		return restTemplate.getForObject("http://product-service/rest/user/test", String.class);

	}

	@GetMapping("/exp/list")
	public List<Object> getObjectdata() {

		return restTemplate.exchange("http://product-service/rest/user/users/data/", HttpMethod.GET, null,
				new ParameterizedTypeReference<List<Object>>() {
				}).getBody();
	}

	@GetMapping("/users")
	public List<UserMaster> getUserData() {
		return userRepository.findAll();
	}

	@GetMapping("/users/{userid}")
	public UserMaster getUserById(@PathVariable("userid") final Integer userId) {

		for (UserMaster u : userRepository.findAll()) {
			if (u.getUserId() == userId)
				return u;
		}
		return null;

	}

	@PostMapping("/add")
	public UserMaster addUser(@RequestBody UserMaster user) {
		UserMaster users = userRepository.save(user);
		if (users != null) {
			return user;
		}

		return null;
	}

	@GetMapping("/singleuser/{username}")
	public UserMaster getUserbyUsername(@PathVariable("username") final String userName) {

		return userService.userDetailsByBusername(userName);

	}

}
