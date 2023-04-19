package com.code;

public interface Iprintable {

	//all data members are final and public

	int myPrint= 100;
	String output="printed";
	
	 // methods are abstract and public so write return type only
	//abstract is empty and return type is void only
	
	void print();
	void noprint();
	
	//we can give more than 1 methods in interface
	default String messsage() {   //gives error if default is removed..it needs default or static
		return this.output; 
	}
}
