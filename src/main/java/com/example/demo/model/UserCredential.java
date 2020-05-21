package com.example.demo.model;

public class UserCredential {
	
	private String mailid;
	private String pw;
	public String getMailid() {
		return mailid;
	}
	public void setMailid(String mailid) {
		this.mailid = mailid;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public UserCredential() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "UserCredential [mailid=" + mailid + ", pw=" + pw + "]";
	}
	public UserCredential(String mailid, String pw) {
		super();
		this.mailid = mailid;
		this.pw = pw;
	}
	
	
	
	

}
