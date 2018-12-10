package com.helptree.db.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="statemaster",catalog="qb")
public class StateMaster {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="state_id")
	private Integer stateId;
	
	@Column(name="state_name")
	private String stateName;
	
	@Column(name="country_id")
	private Integer countryId;

	public Integer getStateId() {
		return stateId;
	}

	public void setStateId(Integer stateId) {
		this.stateId = stateId;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public Integer getCountryId() {
		return countryId;
	}

	public void setCountryId(Integer countryId) {
		this.countryId = countryId;
	}

	public StateMaster(Integer stateId, String stateName, Integer countryId) {
		super();
		this.stateId = stateId;
		this.stateName = stateName;
		this.countryId = countryId;
	}

	public StateMaster() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	
	
	
	
}
