package com.boco.xdpp.hs.domain;

import java.io.Serializable;

public class Account implements Serializable {

	private static final long serialVersionUID = -533698031946372178L;

	private int id;

	private String username;
	private String password;
	private String phone;
	private String email;

	public Account(String username, String password) {
		this.username = username;
		this.password = password;
	}

	public Account() {
	}

	public Account(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return this.id;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}