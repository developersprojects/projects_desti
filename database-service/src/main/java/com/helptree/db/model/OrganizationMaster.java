package com.helptree.db.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "organizationmaster", catalog = "qb")
public class OrganizationMaster {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "org_id")
	private Integer organizationId;

	@Column(name = "org_name")
	private String organizationName;

	@Column(name = "org_logo")
	private String organizationLogo;

	@Column(name = "banner")
	private String banner;

	@Column(name = "country_id")
	private Integer countryId;

	@Column(name = "state_id")
	private Integer stateId;

	@Column(name = "city_id")
	private Integer cityId;

	@Column(name = "gst_in_number")
	private String gstInNumber;

	public Integer getOrganizationId() {
		return organizationId;
	}

	public void setOrganizationId(Integer organizationId) {
		this.organizationId = organizationId;
	}

	public String getOrganizationName() {
		return organizationName;
	}

	public void setOrganizationName(String organizationName) {
		this.organizationName = organizationName;
	}

	public String getOrganizationLogo() {
		return organizationLogo;
	}

	public void setOrganizationLogo(String organizationLogo) {
		this.organizationLogo = organizationLogo;
	}

	public String getBanner() {
		return banner;
	}

	public void setBanner(String banner) {
		this.banner = banner;
	}

	public Integer getCountryId() {
		return countryId;
	}

	public void setCountryId(Integer countryId) {
		this.countryId = countryId;
	}

	public Integer getStateId() {
		return stateId;
	}

	public void setStateId(Integer stateId) {
		this.stateId = stateId;
	}

	public Integer getCityId() {
		return cityId;
	}

	public void setCityId(Integer cityId) {
		this.cityId = cityId;
	}

	public String getGstInNumber() {
		return gstInNumber;
	}

	public void setGstInNumber(String gstInNumber) {
		this.gstInNumber = gstInNumber;
	}

	public OrganizationMaster(Integer organizationId, String organizationName, String organizationLogo, String banner,
			Integer countryId, Integer stateId, Integer cityId, String gstInNumber) {
		super();
		this.organizationId = organizationId;
		this.organizationName = organizationName;
		this.organizationLogo = organizationLogo;
		this.banner = banner;
		this.countryId = countryId;
		this.stateId = stateId;
		this.cityId = cityId;
		this.gstInNumber = gstInNumber;
	}

	public OrganizationMaster() {
		super();
		// TODO Auto-generated constructor stub
	}

}
