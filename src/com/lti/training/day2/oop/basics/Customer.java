package com.lti.training.day2.oop.basics;

public class Customer {
	private String name;
	private String email;
    private Address address;//has-a-relationship

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public  void display() {
		System.out.println("name is "+name);
		System.out.println("email is "+email);
		System.out.println("city is"+ address.getCity());
		System.out.println("state is"+ address.getState());
		System.out.println("pin is"+ address.getPincode());
		
	}
    
}
