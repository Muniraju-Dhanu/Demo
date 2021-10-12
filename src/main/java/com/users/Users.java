package com.users;

//pojo - plain old Java Object
public class Users {
	String name;
	String job;
	
	public Users() {
		
	}
	
	public Users(String name, String Job) {
		this.name = name;
		this.job = job;
	}
	//getters and setters

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}	
}
