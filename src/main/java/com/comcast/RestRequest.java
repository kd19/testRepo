package com.comcast;

import org.springframework.data.annotation.Id;

public class RestRequest {

	@Id
	String id;
	
	String firstname;
	String lastname;
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

}
