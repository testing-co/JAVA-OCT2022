package com.heidichen.inheritance;

import java.util.ArrayList;

public class Developer {
	// 1. attributes / member variables
	private String name;
	private int yearsOfCoding;
	private ArrayList<String> languages;
	protected int braincell;
	private double salary;
	private static int devCount;
	private static int totalLanguages;

	// 2. constructor (overloaded constructor & empty argument constructor)
	public Developer() {
		this.name = "Anonymous Developer";
		this.yearsOfCoding = 5;
		this.languages = new ArrayList<String>();
		this.braincell = 30;
		devCount++;
	}
	
	public Developer(String name, int braincell) {
		this.name = name;
		this.braincell = braincell;
		this.languages = new ArrayList<String>();
		this.yearsOfCoding = 10;
		devCount++;
	}

	
	
	public Developer(String name, int yearsOfCoding, int braincell, double salary) {
		this.name = name;
		this.yearsOfCoding = yearsOfCoding;
		this.braincell = braincell;
		this.salary = salary;
		this.languages = new ArrayList<String>();
		devCount++;
	}

	// 3. getters & setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYearsOfCoding() {
		return yearsOfCoding;
	}

	public void setYearsOfCoding(int yearsOfCoding) {
		this.yearsOfCoding = yearsOfCoding;
	}

	public ArrayList<String> getLanguages() {
		return languages;
	}

	public void setLanguages(ArrayList<String> languages) {
		this.languages = languages;
	}

	public int getBraincell() {
		return braincell;
	}

	public void setBraincell(int braincell) {
		this.braincell = braincell;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public static int getDevCount() {
		return devCount;
	}

	public static void setDevCount(int devCount) {
		Developer.devCount = devCount;
	}

	public static int getTotalLanguages() {
		return totalLanguages;
	}

	public static void setTotalLanguages(int totalLanguages) {
		Developer.totalLanguages = totalLanguages;
	}

	// other methods
	public void addOneLanguage(String lang) {
		this.languages.add(lang);
		this.salary += 1000;
		this.braincell += 10;
		totalLanguages++;
	}

	public void displayInfo() {
		System.out.println("--------" + this.name + "--------");
		System.out.println("Years of coding: " + this.yearsOfCoding);
		System.out.println("Braincell: " + this.braincell);
		System.out.println("Salary: " + this.salary);
		System.out.println("Languages: " + this.languages);
	}

}
