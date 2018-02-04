package com.packt.webstore.domain;

import javax.persistence.*;

public class Profiles {
	private int id;
	private String email;
	private String mobile;
	private Users user;
	public Profiles( String email, String mobile, Users user) {
		super();
		this.email = email;
		this.mobile = mobile;
		this.user = user;
	}
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	
	public void setUser(Users user) {
		this.user = user;
	}
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "users_id")
    public Users getUser() {
        return user;
    }

    
}
