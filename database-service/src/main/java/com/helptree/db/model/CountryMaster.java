package com.helptree.db.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="countrymaster",catalog="qb")
public class CountryMaster {
	
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="country_id")
	private Integer countryId;
	@Column(name="country_name")
	private String countryName;
	public Integer getCountryId() {
		return countryId;
	}
	public void setCountryId(Integer countryId) {
		this.countryId = countryId;
	}
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public CountryMaster(Integer countryId, String countryName) {
		super();
		this.countryId = countryId;
		this.countryName = countryName;
	}
	public CountryMaster() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	

}
