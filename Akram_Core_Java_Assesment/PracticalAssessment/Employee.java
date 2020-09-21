package com.PracticalAssessment;
//•	An Employee class is created
public class Employee {
	
	private int empId;
	private String eName;
	private double salary;
	
	Employee(){
		
	}
	
	Employee(int empId, String eName, double salary){
		this.empId = empId;
		this.eName = eName;
		this.salary = salary;
		
	}

	public int getEmpId() {
		return empId;
	}

	public String geteName() {
		return eName;
	}

	public double getSalary() {
		return salary;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", eName=" + eName + ", salary=" + salary + "]";
	}
}