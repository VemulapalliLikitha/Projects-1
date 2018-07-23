package com.wallet.model;

import java.util.Date;

public class Login {

	private int custId;
	private String password;
	private String status;
	private Date lastLogin;
	private String firstName;
	private String lastName;
	private String email;
	private String mobile;
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getLastLogin() {
		return lastLogin;
	}
	public void setLastLogin(Date lastLogin) {
		this.lastLogin = lastLogin;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	@Override
	public String toString() {
		return "Login [custId=" + custId + ", password=" + password + ", status=" + status + ", lastLogin=" + lastLogin
				+ ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", mobile=" + mobile
				+ "]";
	}
	public Login(int custId, String password, String status, Date lastLogin, String firstName, String lastName,
			String email, String mobile) {
		super();
		this.custId = custId;
		this.password = password;
		this.status = status;
		this.lastLogin = lastLogin;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.mobile = mobile;
	}
	public Login() {
		
	}
	
	
}
