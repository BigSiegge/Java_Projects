package com.vogella.eclipse.ide.first;


import java.util.Scanner; 

public class MyFirstClass { 
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); 
		
		
		int workersProcessed = 0; 
		double totalSalary = 0; 
		double totalTax = 0; 
		int id = 1; 						// so loop will process
		double salaryTax; 
		
		
		double percentX = .03; // tax for salary below $300
		double percentY = .04; // tax for salary between $300 and $350 inclusive
		double percentZ = .05; // tax for salary for anything above 
		
		
		while (id > 0) {					// start of loop
		System.out.println("\nEnter ID: ");		
		id = input.nextInt(); 
			
		
		 
		if (id <= 0) { 
		System.out.println("No records entered");
		break; 
		}
		
		System.out.println("Enter hours worked: ");
		double hourWork = input.nextDouble(); 
		
		System.out.println("Enter hourly rate: ");
		double hourPay = input.nextDouble(); 
		
		
		double salary = hourWork * hourPay; 
		
		if (salary < 300) {					//tax deduction based on salary
			
			salaryTax = salary * percentX; 
		
		} else if (salary > 300 && salary < 350) {
		
			salaryTax = salary * percentY; 
		
		} else {
			
			salaryTax = salary * percentZ;  
		}
		
		System.out.printf("%d %20.2f %20.2f %20.2f\n", id, hourWork, salary, salaryTax); 		//display for each employee
		
		workersProcessed++; 
		totalSalary += salary; 
		totalTax += salaryTax; 
		
		
		}			//end of loop
		double averageSalary = totalSalary / workersProcessed;
		double averageTax = totalTax / workersProcessed; 
	System.out.println("Number of employees: " + workersProcessed); 															  // display for total employees
	System.out.printf("Total salary is %.2f\t\t",  totalSalary);  System.out.printf("Average salary is %.2f\n",  averageSalary);  //display for total and average salary
	System.out.printf("Total tax is %.2f\t\t",  totalTax);  System.out.printf("Average tax is %.2f",  averageTax); 				  // display for total and average tax
	
	}
	
} 




