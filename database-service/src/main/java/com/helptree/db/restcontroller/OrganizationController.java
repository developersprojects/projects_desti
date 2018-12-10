package com.helptree.db.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.helptree.db.model.OrganizationMaster;
import com.helptree.db.repository.OrganizationRepository;


@RestController
@RequestMapping("/rest/organization")
public class OrganizationController {
	
	
	
	@Autowired
	private OrganizationRepository organizationRepository;
	
	
	@GetMapping("/organizations")
	public List<OrganizationMaster> getOrganizations(){
		
		return organizationRepository.findAll();
	}
	
	
	
	
	
	
	

}
