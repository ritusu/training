package com.lti.training.day2.oop.basics;

public class CustomerApp {

	public static void main(String[] args) {
		Customer c=new Customer();
		c.setName("ritu");
		c.setEmail("ritu.com");
		
		
		Address a=new Address();
		a.setCity("mum");
		a.setState("maharashtra");
		a.setPincode(1234);
		
		c.setAddress(a);
		c.display();
		
		
		
	}
	
}
