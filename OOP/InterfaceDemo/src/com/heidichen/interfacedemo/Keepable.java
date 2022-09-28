package com.heidichen.interfacedemo;

public interface Keepable {
	// default: all Keepable pets can play in the same way
	public default void play() {
		System.out.println("Playing....");
	}
	
	// abstract: all Keepable pets show affection / begForFood in different ways
	abstract void showAffection();
	
	abstract void begForFood();
}
