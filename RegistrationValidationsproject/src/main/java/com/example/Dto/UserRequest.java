package com.example.Dto;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;


public class UserRequest {
	@NotNull(message="username must be entered")
	private String name;
	@Email(message="invalid email address")
	private String email;
	@Pattern(regexp="^\\d{10}$",message="invalid mobilenumber")
	private String mobilenumber;
	@Pattern(regexp="[1-]",message="inavalid password")
	private String password;
	public UserRequest() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserRequest(@NotNull(message = "username must be entered") String name,
			@Email(message = "invalid email address") String email,
			@Pattern(regexp = "^\\d{10}$", message = "invalid mobilenumber") String mobilenumber,
			@Pattern(regexp = "[1-]", message = "inavalid password") String password) {
		super();
		this.name = name;
		this.email = email;
		this.mobilenumber = mobilenumber;
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobilenumber() {
		return mobilenumber;
	}
	public void setMobilenumber(String mobilenumber) {
		this.mobilenumber = mobilenumber;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	

}
