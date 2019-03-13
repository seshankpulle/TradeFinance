package com.oracle.java.abstracts;

public class Details extends Employee {
	
	public Details() {
		super();
	}
	
	private void EmployeeIdDetails() {
		EmployeeId("10001");
	}
	
	@Override
	public String Invoice(String employeeId, String salary) {
		// TODO Auto-generated method stub
		System.out.println("Salary for Employee Id '" + employeeId + "' is '" + salary + "'");
		return null;
	}

	
	public static void main(String[] args) {
		//Can not initiate Abstract class
		//Employee employee = new Employee();
		System.out.println("-------------");
		System.out.println("Calling 1st constructor");
		System.out.println("-------------");
		Employee employee = new Details();
		System.out.println("\n");
		employee.EmployeeId("10002");
		
		System.out.println("-------------");
		System.out.println("Calling 2nd constructor");
		System.out.println("-------------");
		Details details = new Details();
		System.out.println("\n");

		details.EmployeeIdDetails();
		details.EmployeeId("10003");
		
		details.Invoice("10004", "100000");		
	}


}
