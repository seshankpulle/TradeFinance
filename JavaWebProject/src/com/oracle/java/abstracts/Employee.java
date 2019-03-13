package com.oracle.java.abstracts;

public abstract class Employee {
	
	
	public Employee() {
		System.out.println("This is abstractor Employee class constructor");
	}
	
	
	public String EmployeeId (String employeeId) {
		System.out.println("Employee Id is " + "'" + employeeId + "'");
		return employeeId;
	}
	
	public String Salary (String salary) {
		System.out.println("Salary is " + "'" + salary + "'");
		return salary;
	}
	
	public static String Age (String age,String employeeId) {
		System.out.println("Employee Id " + "'" + employeeId + "', Age is '" + age + "'");
		return age;
	}
	
	public abstract String Invoice (String employeeId,String salary);

	//abstract method or class can not be final
	//abstract method or class can not be static, you can not override static methods
	
	public static void main(String[] args) {
		
		Employee.Age("29","10001");
		
		//Employee employee = new
		//Abstract class can not be instantiate
	}
	
}
