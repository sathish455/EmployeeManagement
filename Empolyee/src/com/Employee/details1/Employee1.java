package com.Employee.details1;
import com.Employee.details.Employee;
import java.util.*;
public class Employee1{
	String id;
	public int age,myInt;
	String name,gender,address;
	 float salary;
	String Designation;
	Scanner get=new Scanner(System.in);
	 protected Employee1()
	{
		System.out.println("Enter Id:");
		 id=get.nextLine();
		System.out.println("Enter Name of the Employee:");
		 name = get.nextLine();
	    System.out.println("Enter Gender of the Employee:");
	     gender = get.nextLine();
	    System.out.println("Enter Age:");
	    double age = get.nextDouble();
	    myInt=(int)age;
	    System.out.println("Enter Address of the Employee:");
	    address = get.next();
	    Scanner getValue=new Scanner(System.in);
		System.out.println("Enter Designation:");
	    Designation = getValue.nextLine();
	    System.out.println("Enter Salary:");
	    salary = getValue.nextFloat();
	}
	 protected void employee_details()
	{
    		System.out.println("Enter Id: "+id);
		    System.out.println("Employee Name: "+name);
	        System.out.println("Gender: "+gender);
	        System.out.println("Age: "+myInt);
	        System.out.println("Address: "+address);
	        System.out.println("Employee Details"+"\n");
	 	    System.out.println("Salary: "+salary);
	 	    System.out.println("Designation: "+Designation);
}
public static class  Employees	 extends Employee1{ 
	 float salary;
	String Designation;
	protected  Employees(int a)
	{   
		Scanner getValue=new Scanner(System.in);
		System.out.println("Enter Designation:");
	    Designation = getValue.nextLine();
	    System.out.println("Enter Salary:");
	    salary = getValue.nextFloat();		
	}
	void EmployeeSalary()
	{
	    System.out.println("Employee Details"+"\n");
	   // super.employee_details();
	    System.out.println("Salary: "+salary);
	    System.out.println("Designation: "+Designation);
	}
}
}
