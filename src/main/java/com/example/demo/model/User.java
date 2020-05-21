package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "USERMASTER")
public class User {
	


	public User(Integer id, String name, String mailid, String phno, String pw, String role) {
		super();
		this.id = id;
		this.name = name;
		this.mailid = mailid;
		this.phno = phno;
		this.pw = pw;
		this.role = role;
	}


	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	 @Column(name="ID")
	 private Integer id;
	//generated value annotation will automatically generated a primary key or our newly entered value/object/row.
	
	 
	 @Column(name="Name")
	 private String name;
	 
	 @Column(name="Mailid")
	 private String mailid;

	 
	 @Column(name="Phno")
	 private String phno;
	 
	 
	 @Column(name="Password")
	 private String pw;
	 
	 
	 @Column(name="Role")
	 private String role;
	 
	 
	 public User() {
			super();
			// TODO Auto-generated constructor stub
		}


	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", mailid=" + mailid + ", phno=" + phno + ", pw=" + pw + ", role="
				+ role + "]";
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getMailid() {
		return mailid;
	}


	public void setMailid(String mailid) {
		this.mailid = mailid;
	}


	public String getPhno() {
		return phno;
	}


	public void setPhno(String phno) {
		this.phno = phno;
	}


	public String getPw() {
		return pw;
	}


	public void setPw(String pw) {
		this.pw = pw;
	}


	public String getRole() {
		return role;
	}


	public void setRole(String role) {
		this.role = role;
	}
	 
	 
	 
	 
	 
	 


}
