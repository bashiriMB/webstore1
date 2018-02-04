package com.packt.webstore.domain;

import java.util.Set;

import javax.persistence.*;

@Entity
public class Users {

	private int id;
	private String name;
	private String lName;
	private String userName;
	private String password;
	private Set<Rolls> rolls;
	private Profiles profile;

	public Users()
	{}
	public Users(String name, String lname, String userName, String password, Set<Rolls> rolls) {
		super();
		this.name = name;
		this.lName = lname;
		this.userName = userName;
		this.password = password;
		this.rolls = rolls;
	}
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "user_roll", joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "roll_id", referencedColumnName = "id"))
    public Set<Rolls> getRolls() {
        return rolls;
    }

    public void setrolls(Set<Rolls> rolls) {
        this.rolls = rolls;
    }
    
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getlName() {
		return lName;
	}
	public void setLname(String lname) {
		lName = lname;
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
	@OneToOne(mappedBy = "users")
    public Profiles getProfile() {
        return profile;
    }

    public void setProfile(Profiles profile) {
        this.profile = profile;
    }
}
