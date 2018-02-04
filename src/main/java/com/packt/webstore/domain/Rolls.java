package com.packt.webstore.domain;
import java.util.Set;

import javax.persistence.*;

public class Rolls {
	
	private int id;
	private String name;
	private Set<Users> users;

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	 @ManyToMany(mappedBy = "rolls")
	    public Set<Users> getUsers() {
	        return users;
	    }

	    public void setUsers(Set<Users> users) {
	        this.users = users;
	    }

	public Rolls(String name) {
		super();
		this.name = name;
	}
}
