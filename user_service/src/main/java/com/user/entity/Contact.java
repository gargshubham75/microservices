package com.user.entity;

public class Contact {
	
	private Long cId;
	private String email;
	private String contactNAme;
	private Long userId;
	public Contact(Long cId, String email, String contactNAme, Long userId) {
		super();
		this.cId = cId;
		this.email = email;
		this.contactNAme = contactNAme;
		this.userId = userId;
	}
	public Contact() {
		
	}
	public Long getcId() {
		return cId;
	}
	public void setcId(Long cId) {
		this.cId = cId;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContactNAme() {
		return contactNAme;
	}
	public void setContactNAme(String contactNAme) {
		this.contactNAme = contactNAme;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	

}
