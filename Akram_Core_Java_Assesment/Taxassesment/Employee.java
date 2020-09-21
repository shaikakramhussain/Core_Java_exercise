package com.assesment;
public class Employee {
	private String name;
	private String nationality;
	private double salary;
	public Employee()
	{
		
	}
	public Employee(String name, String nationality, double salary) {
		super();
		this.name = name;
		this.nationality = nationality;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
}
