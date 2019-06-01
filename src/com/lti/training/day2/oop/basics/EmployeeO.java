package com.lti.training.day2.oop.basics;

public class EmployeeO {
public static void main(String[] args) {
	 Employee e =new Employee();
	 e.setEmpno(1001);
	 e.setDateOfJoining("10/10/19");
	 e.setSalary(10000);
	 
	 Passport p =new Passport();
	 p.setPassportNo("123");
	 p.setNameOfThePerson("ritu");
	 p.setExpiryDate("2030");
	 p.setIssueDate("2010");
	 
	 e.setPassport(p);
	 
	 AadharCard a=new  AadharCard();
	 a.setAadharNo(1234);
     a.setName("ritu");
     a.setAddress("mumbai");
	 
	 e.setAadharCard(a);
	 
   	System.out.println("passport no is:" +p.getPassportNo());
 	System.out.println(p.getNameOfThePerson());
 	System.out.println(p.getExpiryDate());
   	System.out.println(p.getIssueDate()); 
   	System.out.println(a.getAadharNo());
	System.out.println(a.getName());
	System.out.println(a.getAddress());
  	System.out.println(e.getEmpno());
	System.out.println(e.getName());
	System.out.println(e.getDateOfJoining());
	System.out.println(e.getSalary());
	
}

	   
 }
 

