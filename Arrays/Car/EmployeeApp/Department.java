package EmployeeApp;

import java.util.Scanner;

public class Department 
{
	String Dname;
	int did;
	String designation;
	public Department(Scanner sc) {
		System.out.println("Enter department name");
		this.Dname=sc.next();
		System.out.println("Enter department ID");
		this.did = sc.nextInt();
		System.out.println("Enter designation");
		this.designation = sc.next();
	}
	@Override
	public String toString() {
		return "Department Name:"+this.Dname+" Department Id:"+this.did+" Designation: "+this.designation;
	}
	

}
