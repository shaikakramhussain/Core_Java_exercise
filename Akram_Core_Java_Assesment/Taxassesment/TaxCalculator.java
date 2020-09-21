package com.assesment;
public class TaxCalculator {
    public double calculateTax(Employee emp)
    {
   	double salary=emp.getSalary();
   	 if(salary>100000)
   	 {
   		 return (salary*8)/100;
   	 }
   	 else if(salary>50000)
   	 {
   		 return (salary*5)/100;
   	 }
   	 else if(salary>30000)
   	 {
   		 return (salary*3)/100;
   	 }
   	 else if(salary>10000)
   	 {
   		 return (salary*1)/100;
   	 }
		return salary;
    }
}