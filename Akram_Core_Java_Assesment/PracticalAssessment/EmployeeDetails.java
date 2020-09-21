package com.PracticalAssessment;
//•	An EmployeeDetails class is created
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class EmployeeDetails {
	
	public static void main(String[] args) {
		HashMap<Integer, Employee> hashMap = new HashMap<>();
		
		Employee e1= new Employee(101, "Venu", 40000.00);
        Employee e2= new Employee(102, "Akram", 55000.00);
        Employee e3= new Employee(103, "krishna", 30000.00);
        
        EmployeeDetails ed = new EmployeeDetails();
        
        Map<Integer, Employee> addEmployee = ed.addEmployee(e1);
        
        ed.addEmployee(e2);
        ed.addEmployee(e3);
        
        System.out.println("add :" + hashMap);
        
        int removeEmployee = ed.removeEmployee("3");
        System.out.println("remove :" + removeEmployee);
        
        Employee findEmployee = ed.findEmployee("2");
        System.out.println("find :" + findEmployee);
        
        List employeeList = ed.getEmployeeList();
        System.out.println("list :" + employeeList);
        
	}

	 int empId = 1;
	 
	    public Map<Integer, Employee> addEmployee(Employee details) {
	 
	        if (hashMap.isEmpty()) {
	            hashMap.put(empId, details);
	            empId++;
	        } else {
	            hashMap.put(empId, details);
	            empId++;
	        }
	        return hashMap;
	 
	    }
	    
	    public int removeEmployee(String empId) {
	        int count = 0;
	        Set<Entry<Integer, Employee>> entrySet = hashMap.entrySet();
	        Set<Integer> keySet = hashMap.keySet();
	        int parseInt = Integer.parseInt(empId);
	        for (Integer entry : keySet) {
	            if (parseInt == entry) {
	                hashMap.remove(parseInt);
	                count = 0;
	                return count;
	            }
	        }
	        if (!hashMap.containsKey(empId)) {
	            count = 2;
	            return count;
	 
	        } else {
	            count = 1;
	            return count;
	        }
	 
	    }
	    
	    public Employee findEmployee(String empId) {
	    	 
	        Employee mapEmployeeDetails;
	        int parseInt = Integer.parseInt(empId);
	        if (hashMap.containsKey(Integer.parseInt(empId))) {
	            mapEmployeeDetails = hashMap.get(parseInt);
	            return mapEmployeeDetails;
	        } else {
	            return null;
	        }
	 
	    }
	 
	    public List getEmployeeList() {
	        List<Object> arrayList = new ArrayList<>();
	        Collection<Employee> values = hashMap.values();
	        arrayList.addAll(values);
	        return arrayList;
	    }
}
