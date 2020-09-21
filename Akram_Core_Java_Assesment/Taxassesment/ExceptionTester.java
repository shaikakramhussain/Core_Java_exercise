package com.assesment;


import java.util.Scanner;

public class ExceptionTester {

	public static void main(String[] args) {
		TaxSimulator taxSimulator=new TaxSimulator();
		TaxCalculator taxCalculator=new TaxCalculator();
		//Scanner scanner=new Scanner(System.in);
		//System.out.println("Enter the Em");
		
		Employee employee=new Employee();
		employee.setName("VenuGopal");
		employee.setNationality("Indian");
		employee.setSalary(50000);
		taxSimulator.findTaxOutput(employee);
		double tax=taxCalculator.calculateTax(employee);
		String output=String.valueOf(tax);
		System.out.println("tax value is "+output);

	}

}