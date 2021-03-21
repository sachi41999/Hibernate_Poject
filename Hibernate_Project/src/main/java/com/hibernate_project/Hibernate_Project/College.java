package com.hibernate_project.Hibernate_Project;

import javax.persistence.Embeddable;

@Embeddable
public class College {
	private int clg_id;
	private String clg_name;
	private String branch;
	
	
	@Override
	public String toString() {
		return "College [clg_id=" + clg_id + ", clg_name=" + clg_name + ", branch=" + branch + "]";
	}
	public College() {
		super();
		// TODO Auto-generated constructor stub
	}
	public College(int clg_id, String clg_name, String branch) {
		super();
		this.clg_id = clg_id;
		this.clg_name = clg_name;
		this.branch = branch;
	}
	public int getClg_id() {
		return clg_id;
	}
	public void setClg_id(int clg_id) {
		this.clg_id = clg_id;
	}
	public String getClg_name() {
		return clg_name;
	}
	public void setClg_name(String clg_name) {
		this.clg_name = clg_name;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	
	
}
