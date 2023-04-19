package com.code;

public class Employee implements Iprintable {

	//it forces to override only the abstract methods
	//it gives two ways--either override the methods or change employee to abstract class ..it means
	///it allows for chained abstract class
	
	@Override
	public void print() {
		System.out.println("print Employee");
		
	}

	@Override
	public void noprint() {
		
		System.out.println("no print employee");
		
	}

	
}
