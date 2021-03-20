package com.hibernate_project.Hibernate_Project;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class Student_data {
	@Id
	private int id;
	
	private String city;
	private String name;
	
	
	public Student_data(int id, String city, String name) {
		super();
		this.id = id;
		this.city = city;
		this.name = name;
	}


	public Student_data() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "Student_data [id=" + id + ", city=" + city + ", name=" + name + "]";
	}
	
	
	
	

}
