package com.StreamsApi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmployeeData {
	public static void main(String[] args) {
		List<Employee> employeeList = new ArrayList<Employee>();
        
		employeeList.add(new Employee(111, "Shaik", "Akram", 25000.0, 'A','F',"Sales Department" ));
		employeeList.add(new Employee(122, "Afrin", "Shaik", 26000.0, 'A','F',"Sales Department" ));
		employeeList.add(new Employee(133, "Tabu", "haseena", 27000.0, 'A','F',"Sales Department" ));
		employeeList.add(new Employee(144,"Anushka", "Naidu", 28000.0, 'A','F',"Sales Department" ));
		employeeList.add(new Employee(155,"Sandhya", "Chowdary", 29000.0, 'A','F',"Account And Finance" ));
		employeeList.add(new Employee(166,"Ramya", "Reddy", 30000.0, 'A','F',"HR" ));
		
		Map<String, Long> noOfMaleAndFemaleEmployees=
				(Map) employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
				         
				System.out.println(noOfMaleAndFemaleEmployees);
				
				Optional<Employee> highSalary=
						employeeList.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)));
			   
				Employee highestPaidEmployee = highSalary.get();
			    System.out.println("Highest salary in sales department is :"+ highestPaidEmployee.getFirstName()+" "+highestPaidEmployee.getLastName() );
				
				
//				employeeList.stream()
//	            .map(Employee::getDepartment)
//	            .distinct()
//	            .forEach(System.out::println);
	}
}
