package com.heidichen.interfacedemo;

public class Dog extends Pet implements Keepable {

	
	public Dog() {
		super("A random dog", "Dog");
	}
	
	public Dog(String name) {
		super(name, "Dog");
	}
	
	
	@Override
	public void showAffection() {
		System.out.println("Asking for belly rub");

	}

	@Override
	public void begForFood() {
		System.out.println("barkkkkk");

	}

}
