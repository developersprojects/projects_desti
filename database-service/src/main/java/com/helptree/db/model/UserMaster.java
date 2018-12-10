package com.helptree.db.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "usermaster", catalog = "qb")
public class UserMaster {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "userid")
	private int userId;

	@Column(name = "user_name")
	private String userName;
	@Column(name = "password")
	private String password;

	@Column(name = "email")
	private String email;
	@Column(name = "contact_no")
	private Integer contactNo;

	@Column(name = "country_id")
	private Integer countryId;

	@Column(name = "state_id")
	private Integer stateId;

	@Column(name = "city_id")
	private Integer cityId;

	@Column(name = "org_id")
	private Integer organizationId;
	@Column(name = "govt_id")
	private String govtId;
	
	
	
	
	//Getter And Setter  
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
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
	public UserMaster(int userId, String userName, String password, String email, Integer contactNo, Integer countryId,
			Integer stateId, Integer cityId, Integer organizationId, String govtId) {
		super();
		this.userId = userId;
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
	public UserMaster() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	
	
	
	
	
	
	
	
	
	
	
	
	
}