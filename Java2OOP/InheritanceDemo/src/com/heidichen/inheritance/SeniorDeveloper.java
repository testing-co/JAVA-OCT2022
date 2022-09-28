package com.heidichen.inheritance;

public class SeniorDeveloper extends Developer {
	
	public SeniorDeveloper() {
		super("A Random Senior Developer", 10, 40, 150000);
	}
	
	public void yellAtJunDev(JuniorDeveloper junDev) {
		this.braincell -= 1;
		junDev.braincell += 1;
//		
//		this.setBraincell(getBraincell()-1);
//		junDev.setBraincell(junDev.getBraincell()+1);
		System.out.println("Yelling " + junDev.getName()+ " in progress");
	}
}
