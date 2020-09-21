package com.assesment;

public class TaxSimulator {
	 
	public void findTaxOutput(Employee emp)
	{
	 if(emp.getNationality()!="Indian")
	 {
		 try {
			throw new CountryNotValidException(Message.countryNotValidException);
		} catch (CountryNotValidException e) {
			System.out.println(e.getMessage());
			
		}
	 } 
	 if(emp.getName()==null)
	 {
		 try
		 {
			 throw new NameNotValidException(Message.nameNotValidException);
		 }
		 catch(NameNotValidException e)
		 {
			 System.out.println(e.getMessage());
		 }
	 }
	 if(emp.getSalary()<10000)
	 {
		 try
		 {
			 throw new NotEligibleForTaxException(Message.notEligibleForTaxException);
		 }
		 catch(NotEligibleForTaxException e)
		 {
			 System.out.println(e.getMessage());
		 }
	 }
	}
}