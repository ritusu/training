package com.lti.training.day2.oop.basics;
//java bean /POJO-plane old java objects
public class App {
    public static void main(String[] args) {
		//creating object
          int x=10;
    	Student student1=new Student();
    	student1.name="ritu";
    	student1.college="abc";
    	student1.doj="21st may";
    	System.out.println(student1.name);
    	System.out.println(student1.college);
    	System.out.println(student1.doj);
    	//System.out.println(student1);
    	
    	//creating object of password class
    	Passport passport1=new Passport();
    	passport1.setPassportNo("abc123");
    	passport1.setNameOfThePerson("ritu");
    	passport1.setIssueDate("2010");
    	passport1.setExpiryDate("2020");
      	System.out.println(passport1.getPassportNo());
    	System.out.println(passport1.getNameOfThePerson());
    	System.out.println(passport1.getExpiryDate());
      	System.out.println(passport1.getIssueDate());
    
    	//this helps us in logging since the function is called.
      	//this logging code can be written in getters and setters.
    	
      	//aadahar card objects
      	AadharCard ac= new AadharCard(123,"ritu","mumbai");
      	System.out.println(ac.getAadharNo());
    	System.out.println(ac.getName());
    	System.out.println(ac.getAddress());
    
	}
}
