package Empmanagement;

public class Employee {
	private String name;
	private double salary;
	private int Emp;
	static int count=1;
	private int age;
	
	public Employee(String name) {
		this.name=name;
		Emp=this.count++;
	}
	public void setsalary(double salary) {
		
		this.salary=salary;
	}
	
	public void setage(int age) {
		if(age>0 && age<120) {
		this.age=age;
		}
		else {
			System.out.println("Emp_name"+" "+this.name+" you are expired");
		}
	}
	
	void display() {
		
		System.out.println("Employee "+this.Emp+" "+"Details:-");
		System.out.println("Emp_id:- "+this.Emp);
		System.out.println("Emp_name:- "+this.name);
		System.out.println("Emp_salary:- "+this.salary+" "+"Per Annum");
		System.out.println("Emp_age:- "+this.age);
		System.out.println();
	}
	

}
