package com.heidichen.inheritance;

public class JuniorDeveloper extends Developer{
	// 1. attributes
	private boolean isIntern;
	
	
	// 2. constructors
	public JuniorDeveloper() {
		super("A Random Junior Developer", 50);
		this.setYearsOfCoding(1);
		this.isIntern=true;
		// protected: subclass & package have access
		// private: use getters/setters
	}
	
	public JuniorDeveloper(String name) {
		super(name, 1, 60, 85000);
		this.isIntern=false;
	}
	
	// 3. getters/setters
	
	
	// 4 other methods 
	public void completeInternship() {
		this.isIntern = false;
		this.setSalary(70000);
	}
	
	public boolean isIntern() {
		return isIntern;
	}

	public void setIntern(boolean isIntern) {
		this.isIntern = isIntern;
	}

	public void completeProject() {
		this.setSalary(this.getSalary()+1000);
	}
}
