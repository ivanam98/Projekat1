package com.projekat.Projekat1.entity.dto;

public class UseraDTO {
	
	private long id;
	private String username;
	private String emailAddress;
	private String role;
	
	 public UseraDTO(Long id, String username, String emailAddress, String role) {
	        this.id = id;
	        this.setUsername(username);
	        this.setEmailAddress(emailAddress);
	        this.setRole(role);
	    }
	 public Long getId() {
	        return id;
	    }

	    public void setId(Long id) {
	        this.id = id;
	    }
		public String getUsername() {
			return username;
		}
		public void setUsername(String username) {
			this.username = username;
		}
		public String getEmailAddress() {
			return emailAddress;
		}
		public void setEmailAddress(String emailAddress) {
			this.emailAddress = emailAddress;
		}
		public String getRole() {
			return role;
		}
		public void setRole(String role) {
			this.role = role;
		}
}
