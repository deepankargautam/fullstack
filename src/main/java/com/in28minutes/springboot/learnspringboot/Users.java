package com.in28minutes.springboot.learnspringboot;

public class Users {
	
	public long id;
	public String name;
	public String designation;
	@Override
	public String toString() {
		return "Users [id=" + id + ", name=" + name + ", designation=" + designation + "]";
	}
	public Users(long id, String name, String designation) {
		super();
		this.id = id;
		this.name = name;
		this.designation = designation;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}

}
