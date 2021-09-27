/*3.Create an Employee class with
1. Instance variables: empNo, name, age, location.
2. A parameterized constructor to initialize them.*/

package com.assignment.EmployeeClass;

public class Employee {

	int EmpNumber;
	String Name;
	int Age;
	String Location;

	Employee(int ECN, String name, int age, String location) {
		EmpNumber = ECN;
		Name = name;
		Age = age;
		Location = location;
	}
	void PutData() {
		
		 System.out.print("\n\tEmployee Number    : "+EmpNumber);
	        System.out.print("\n\tEmployee Name      : "+Name);
	        System.out.print("\n\tEmployee Age       : "+Age);
	        System.out.print("\n\tEmployee Location  : "+Location);
	}  
	        public static void main(String args[])
	        {

	            Employee E = new Employee(4132,"Abhinav Sharma ",22,"Delhi");
	            // Creating object and passing values to constructor.

	            E.PutData();          // Calling PutData()  to print
	}
}
