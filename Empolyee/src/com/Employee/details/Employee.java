package com.Employee.details;
import com.Employee.details1.Employee1;
public class Employee extends Employee1 {
public Employee() {
		super();
		
	}

public static void main(String[] args) {
Employee emp=new Employee();
emp.employee_details();
Employee emp1=new Employee();
emp1.employee_details();
}

private String gender() {
	return "str";	
}

public int myId() {
	return 1;
}

public int age() {
	return 1;	
}
}

