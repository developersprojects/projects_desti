package com.helptree.product.model;

public class UserDetailsDto {
	private Integer userId;
	private String userName;
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public UserDetailsDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserDetailsDto(Integer userId, String userName) {
		super();
		this.userId = userId;
		this.userName = userName;
	}
	
	
	
	
	
	
	

}
