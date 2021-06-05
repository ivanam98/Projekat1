package com.example.demo.entity.dto.request;

import lombok.Data;

@Data
public class RegisterUserDTO {
	
	private String username;
	private String password;
	private String firstName;
	private String lastName;
	private String contact;
	private String emailAddress;
	private String dateOfBirth;
	private String role;
	private String active;

}
