package com.heidichen.interfacedemo;

public class Cat extends Pet implements Keepable{
	
	public Cat() {
		super("A random cat", "Cat");
	}
	
	public Cat(String name) {
		super(name, "Cat");
	}
	
	public void showAffection() {
		System.out.println(this.name + " is slapping you");
	}

	@Override
	public void begForFood() {
		System.out.println("Meowwwww");
		
	}
	
	
}
