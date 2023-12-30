package EmployeeApp;

import java.util.Scanner;

public class emp {
	
	String ename;
	int eid;
    Department dept;
	public emp(Scanner sc) 
	{
		System.out.println("Enter Employee name");
		this.ename = sc.next();
		System.out.println("Enter Employee ID");
		this.eid = sc.nextInt();
		this.dept = new Department(sc);
	}
	@Override
	public String toString() {
		return "Employee name: "+this.ename+" Employee id: "+this.eid+" "+this.dept;
	}
	

}
