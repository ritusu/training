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
	 e.displayInfo();
/*	 
	System.out.println(e.getDateOfJoining());
	System.out.println(e.getSalary());
	System.out.println(e.getEmpno());
	System.out.println(e.getName());
   	System.out.println(e.getPassport().getPassportNo());
 	System.out.println(e.getPassport().getNameOfThePerson());
 	System.out.println(e.getPassport().getExpiryDate());
   	System.out.println(e.getAadharCard(). getIssueDate()); 
   	System.out.println(a.getAadharCard().getAadharNo());
	System.out.println(a.getAadharCard().getName());
	System.out.println(a.getAadharCard().getAddress());
*/

	
}

	   
 }
 

