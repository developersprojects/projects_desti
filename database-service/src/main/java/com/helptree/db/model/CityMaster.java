package com.helptree.db.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "citymaster", catalog = "qb")
public class CityMaster {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "city_id")
	private Integer cityId;

	@Column(name = "city_name")
	private String cityName;

	@Column(name = "state_id")
	private Integer stateid;

	@Column(name = "country_id")
	private Integer countryId;

	public Integer getCityId() {
		return cityId;
	}

	public void setCityId(Integer cityId) {
		this.cityId = cityId;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public Integer getStateid() {
		return stateid;
	}

	public void setStateid(Integer stateid) {
		this.stateid = stateid;
	}

	public Integer getCountryId() {
		return countryId;
	}

	public void setCountryId(Integer countryId) {
		this.countryId = countryId;
	}

	public CityMaster(Integer cityId, String cityName, Integer stateid, Integer countryId) {
		super();
		this.cityId = cityId;
		this.cityName = cityName;
		this.stateid = stateid;
		this.countryId = countryId;
	}

	public CityMaster() {
		super();
		// TODO Auto-generated constructor stub
	}

}
