package com.example.demo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Customer {
	@JsonProperty
	private String name;
	@JsonProperty
	private int age;
	@JsonProperty
	private String email;
	
	
	public Customer() {
		System.out.println("Zero Param Constructor is called");
	}
	
	public Customer(String name, int age, String email) {
		System.out.println(" 3 param constructor called");
		this.name = name;
		this.age = age;
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

}
