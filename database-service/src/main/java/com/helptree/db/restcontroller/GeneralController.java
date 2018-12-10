package com.helptree.db.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.helptree.db.model.CityMaster;
import com.helptree.db.model.CountryMaster;
import com.helptree.db.model.StateMaster;
import com.helptree.db.repository.CityRepository;
import com.helptree.db.repository.CountryRepository;
import com.helptree.db.repository.StateRepository;

@RestController
@RequestMapping("/rest/general/db/")
public class GeneralController {

	@Autowired
	private CountryRepository countryRepository;

	@Autowired
	private StateRepository stateRepository;

	@Autowired
	private CityRepository cityRepository;

	@GetMapping("/countrys")
	public List<CountryMaster> getCountrys() {

		return countryRepository.findAll();

	}

	@GetMapping("/states")
	public List<StateMaster> getStates() {

		return stateRepository.findAll();

	}

	@GetMapping("/citys")
	public List<CityMaster> getCitys() {

		return cityRepository.findAll();

	}

}
