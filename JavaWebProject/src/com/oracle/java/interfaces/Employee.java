package com.oracle.java.interfaces;

interface Employee extends Company {
	
	public String EmployeeId (String employeeId);
	
	public String Salary (String salary);
	
	public String Invoice (String employeeId,String salary);
	//abstract method or class can not be final
	//abstract method or class can not be static, you can not override static methods

	
	public static String Age (String age,String employeeId) {
		System.out.println("Employee Id " + "'" + employeeId + "', Age is '" + age + "'");
		return age;
	}
	
	public static void main(String[] args) {
		
		Employee.Age("29","10001");
		
		//Employee employee = new
		//Abstract class can not be instantiate
	}
	
}
