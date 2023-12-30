package custom;

import java.util.Scanner;

public class Student 
{
	private String name;
	private int id;
	public Student() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student ID:");
		this.id=sc.nextInt();
		System.out.println("Enter Student Name:");
		this.name=sc.next();
		System.out.println("Student Details added Successfully!");
		
	}
	
	public String getname() {
		return this.name;
		
	}
	public int getid() {
		return this.id;
	}


}
