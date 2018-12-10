package com.helptree.customer.restcontroller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.helptree.customer.model.CustomerDto;




@RestController
@RequestMapping("rest/customer")
public class CustomerController {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/customers")
	public List<CustomerDto> getCustomer() {
		
		List<CustomerDto> customers= restTemplate.exchange("http://db-service/rest/customer/customers/", 
				HttpMethod.GET,
				null, 
				new ParameterizedTypeReference<List<CustomerDto>>() {
				}).getBody();
		List<CustomerDto> customersList= new ArrayList<CustomerDto>();
		for(CustomerDto c:customers) {
			CustomerDto cd= new CustomerDto();
			cd.setCustomerName(c.getCustomerName());
			customersList.add(cd);
		}
		return customersList;
		
	}

}
