package com.heidichen.interfacedemo;

public class Pet {
	// 1. attributes
	protected String name;
	protected String type;
	
	// 2. constructors
	public Pet() {
		this.name = "a random pet";
	}

	public Pet(String name, String type) {
		this.name = name;
		this.type = type;
	}

	
	// 3. getters/setters
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	
	// 4. other methods
	public void displayStatus() {
		System.out.println("Name: " + this.name);
		System.out.println("Type: " + this.type);
	}
	
}
