package com.greatlearning.main;
 import java.util.Scanner;
 
 //import com.greatlearning.model;
import com.greatlearning.model.Employee;
import com.greatlearning.service.CredentialService;

public class DriverClass {
	public String department;
	
	public static void main(String[] args) {
		
		int option;
		
		 Scanner sc = new Scanner(System.in);
		
		Employee E1 = new Employee("Harshit","Chaudary");
		
		CredentialService c1= new CredentialService();
		
		System.out.println(" Please Enter the Department from the following ");
		System.out.println(" 1: Technical");
		System.out.println(" 2: Admin ");
		System.out.println(" 3: Human Resources");
		System.out.println(" 4: Legal");
		
		System.out.println(" Please select your option ");
		
		 option =  sc.nextInt();
		sc.close();
		 String Dept;
		switch(option) {
		
		case 1: System.out.println("Dear "+ E1.getFirstname() +" your generated credentials are as follows");
		           Dept="@tech.";
		        c1.showCredentials(c1.GeneratePassword(),c1.generateEmailAddress(E1.getFirstname(), E1.getLastname(),Dept));
		        
		    break;
		
		case 2: System.out.println("Dear "+ E1.getFirstname() +" your generated credentials are as follows");
		Dept="@admin.";
        c1.showCredentials(c1.GeneratePassword(),c1.generateEmailAddress(E1.getFirstname(), E1.getLastname(),Dept));
        
	    break;  
	    
		
		case 3: System.out.println("Dear "+ E1.getFirstname() +" your generated credentials are as follows");
		Dept="@hr.";
        c1.showCredentials(c1.GeneratePassword(),c1.generateEmailAddress(E1.getFirstname(), E1.getLastname(),Dept));
	    break;   
		
		case 4: System.out.println("Dear "+ E1.getFirstname() +" your generated credentials are as follows");
		Dept="@legal.";
        c1.showCredentials(c1.GeneratePassword(),c1.generateEmailAddress(E1.getFirstname(), E1.getLastname(),Dept));
	    break;
		 
		default : System.out.println(" Please enter a valid Option");
		 break;
		 

	
		
		}
		
		
		
	}
	
	

}
