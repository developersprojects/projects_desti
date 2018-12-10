package com.helptree.db.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.helptree.db.model.CustomerMaster;
import com.helptree.db.repository.CustomerRepository;

@RestController
@RequestMapping("rest/customer")
public class CustomerController {
	
	@Autowired
	private CustomerRepository customerRepository;
	
	@GetMapping("/customers")
	public List<CustomerMaster> getCustomers(){
		
		
		return customerRepository.findAll();
		
		
	}
}
