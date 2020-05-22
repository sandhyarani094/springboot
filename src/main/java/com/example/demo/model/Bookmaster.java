package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="BOOKMASTER")
public class Bookmaster {
 
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	 @Column(name="ID")
     private Integer id;
	
	 @Column(name="NAME")
	 private String name;
	 
	 @Column(name="AUTHOR")
	 private String author;
	 
	 @Column(name="GST")
	 private String gst;
	 
	 @Column(name="PRICE")
	 private Integer price;
	 
	 @Column(name="BATCHCODE")
	 private String batchcode; 
	
	 @Column(name="PUBLICATION")
	 private String publication;
	 
	 @Column(name="BOOKTYPE")
	 private String booktype;
	 
	 @Column(name="AGEGROUP")
	 private String agegroup;
	 
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
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getGst() {
		return gst;
	}
	public void setGst(String gst) {
		this.gst = gst;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public String getBatchcode() {
		return batchcode;
	}
	public void setBatchcode(String batchcode) {
		this.batchcode = batchcode;
	}
	public String getPublication() {
		return publication;
	}
	public void setPublication(String publication) {
		this.publication = publication;
	}
	
	public String getBooktype() {
		return booktype;
	}
	public void setBooktype(String booktype) {
		this.booktype = booktype;
	}
	public String getAgegroup() {
		return agegroup;
	}
	public void setAgegroup(String agegroup) {
		this.agegroup = agegroup;
	}
	public Bookmaster() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Bookmaster [id=" + id + ", name=" + name + ", author=" + author + ", gst=" + gst + ", price=" + price
				+ ", batchcode=" + batchcode + ", publication=" + publication + ", booktype=" + booktype + ", agegroup="
				+ agegroup + "]";
	}
	public Bookmaster(Integer id, String name, String author, String gst, Integer price, String batchcode,
			String publication, String booktype, String agegroup) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
		this.gst = gst;
		this.price = price;
		this.batchcode = batchcode;
		this.publication = publication;
		this.booktype = booktype;
		this.agegroup = agegroup;
	}
	
		
}
