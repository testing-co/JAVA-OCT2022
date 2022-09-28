package com.heidichen.interfacedemo;

public class PetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat pepper = new Cat("Pepper");
		pepper.displayStatus();
		pepper.play();
		
		pepper.showAffection();
		pepper.begForFood();
		
		Dog dog = new Dog();
		dog.displayStatus();
		dog.play();
		dog.showAffection();
		dog.begForFood();
	}

}
