package com.qa.main;

import com.qa.datatype.domain.Customer;

public class Runner {
	public static void main(String[] args) {
		
	Customer cust = new Customer("Anthony", "Papasavva", "anthonypapasavva@gmail.com", 26);
	Customer ed = new Customer("Ed", "Reynolds", "E.Reynolds@qa.com", 26);
	Customer alex = new Customer("Alex", "Papasavva", "alexpapasavva@gmail.com", 31);
	
	cust.setFirstName("Anthony");
	cust.setSurname("Papasavva");
	cust.setEmail("anthonypapasavva@gmail.com");
	
	ed.setFirstName("Ed");
	ed.setSurname("Reynolds");
	ed.setEmail("E.reynolds@qa.com");
	ed.setAge(26);
	
	System.out.println(cust.getFirstName() + " " + cust.getSurname() + " " + cust.getEmail() + " " + cust.getAge());
	System.out.println(ed.toString());
	System.out.println(alex.toString());
	}
}
