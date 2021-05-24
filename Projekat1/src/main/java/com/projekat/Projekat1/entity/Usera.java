package com.projekat.Projekat1.entity;


import java.io.Serializable;

import javax.persistence.*;

@Entity
public class Usera implements Serializable {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column
	private String username;
	
	@Column
	private String password;
	
	@Column(name = "First name")
	private String firstName;
	
	@Column
	private String lastName;
	
	@Column
	private String phoneNumber;
	
	@Column
	private String emailAddress;
	
	@Column
	private String dateOfBirth;
	
	@Column 
	private String role;
	
	public Long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
	
	
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    
    public String getpassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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
    
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
    
    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
	
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

}

