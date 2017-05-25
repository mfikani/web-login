package com.mybusiness.business.model;

public class Client {
	private String id;
	private String name;
	private String lastName;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String toString(){
		return this.getId() +" "+this.getName()+" "+this.getLastName();
	}
	
	
}
