package com.StreamsApi;

public class  Employee{
    int eId; 
    String firstName;
    String lastName;
    double salary;
    char grade; 
    char gender; 
    String department;     
   
     public Employee(){
    	 
     }
    public Employee(int eId, String firstName, String lastName, double salary, char grade, char gender, String department) 
    {
        this.eId = eId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.grade = grade;
        this.gender = gender;
        this.department = department;
    }
         
    public int geteId() {
		return eId;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public double getSalary() {
		return salary;
	}

	public char getGrade() {
		return grade;
	}
	public char getGender() {
		return gender;
	}
	public String getDepartment() {
		return department;
	}

	@Override
	public String toString() {
		return "Employee [eId=" + eId + ", firstName=" + firstName + ", lastName=" + lastName + ", salary=" + salary
				+ ", grade=" + grade + ", gender=" + gender + ", department=" + department + "]";
	}	
}