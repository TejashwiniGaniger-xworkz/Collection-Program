package com.xworkz.collectionconcept.person;

import java.io.Serializable;

public class PersonDTO implements Serializable{
	private String name;
	private int age;
	private String designation;
	private String location;
	
	PersonDTO(){
		System.out.println("default const");
		
	}

	public PersonDTO(String name, int age, String designation, String location) {
		super();
		this.name = name;
		this.age = age;
		this.designation = designation;
		this.location = location;
	}

	@Override
	public String toString() {
		return "PersonDTO [name=" + name + ", age=" + age + ", designation=" + designation + ", location=" + location
				+ "]";
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

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	
}
