package com.hibernate_project.Hibernate_Project;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
public class Address {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="address_id")
	private int AddId;
	
	@Column(length=100)
	private String Street;
	
	@Column(length=50,name="City")
	private  String city;
	
	private boolean isOpen;
	
	@Transient
	private double x;
	
	@Column(name="Added_Date")
	@Temporal(TemporalType.DATE)
	private Date added_date;
	
	@Lob
	private byte[] image;

	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address(int addId, String street, String city, boolean isOpen, double x, Date added_date) {
		super();
		AddId = addId;
		Street = street;
		this.city = city;
		this.isOpen = isOpen;
		this.x = x;
		this.added_date = added_date;
	}

	public int getAddId() {
		return AddId;
	}

	public void setAddId(int addId) {
		AddId = addId;
	}

	public String getStreet() {
		return Street;
	}

	public void setStreet(String street) {
		Street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public boolean isOpen() {
		return isOpen;
	}

	public void setOpen(boolean isOpen) {
		this.isOpen = isOpen;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public Date getAdded_date() {
		return added_date;
	}

	public void setAdded_date(Date added_date) {
		this.added_date = added_date;
	}

	@Override
	public String toString() {
		return "Address [AddId=" + AddId + ", Street=" + Street + ", city=" + city + ", isOpen=" + isOpen + ", x=" + x
				+ ", added_date=" + added_date + "]";
	}
	
	
	

}
