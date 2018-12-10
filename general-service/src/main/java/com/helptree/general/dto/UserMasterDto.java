package com.helptree.general.dto;

public class UserMasterDto {
	
	
	private String userName;
	private String password;
	private String email;
	private Integer contactNo;
	private Integer countryId;
	private Integer stateId;
	private Integer cityId;
	private Integer organizationId;
	private String govtId;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getContactNo() {
		return contactNo;
	}
	public void setContactNo(Integer contactNo) {
		this.contactNo = contactNo;
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
	public Integer getOrganizationId() {
		return organizationId;
	}
	public void setOrganizationId(Integer organizationId) {
		this.organizationId = organizationId;
	}
	public String getGovtId() {
		return govtId;
	}
	public void setGovtId(String govtId) {
		this.govtId = govtId;
	}
	public UserMasterDto(String userName, String password, String email, Integer contactNo, Integer countryId,
			Integer stateId, Integer cityId, Integer organizationId, String govtId) {
		super();
		this.userName = userName;
		this.password = password;
		this.email = email;
		this.contactNo = contactNo;
		this.countryId = countryId;
		this.stateId = stateId;
		this.cityId = cityId;
		this.organizationId = organizationId;
		this.govtId = govtId;
	}
	public UserMasterDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	

}
