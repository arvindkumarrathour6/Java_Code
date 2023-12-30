package custom;

import java.util.ArrayList;
import java.util.Scanner;

public class Client
{
	public static void main(String[] args) 
	{

	StudentFactory sf = new StudentFactory();
	
	StudentInterface si = sf.createInstance();
	
	Scanner sc = new Scanner(System.in);
	System.out.println("    Student Management System");
	System.out.println("==================================");
	while(true) 
		{
		System.out.println("1. Add_Student\n2. Search_Student\n3. Display_stu_detaials\n4. Remove_Student\n5. Exit");
		System.out.println("==================================");
		System.out.println("Enter your choice :");
		int ch=sc.nextInt();
		if(ch==1)
		{
			si.adding_stu(new Student());
	    }
	    else if(ch==2) 
	    {
	    	System.out.println("Enter Student Id");
	    	int id = sc.nextInt();
	    	Student s=si.serachId(id);
	    	if(s==null)
	    	{
	    		System.err.println("Id not Found");
	    	}
	    	else
	    	{
	    		System.err.println("Id Found");
	    	}
	    	
	    	
	    }
	    else if(ch==3)
	    {
	    	ArrayList<Student> s = si.all_stu();
	    	if(s.size()>0) 
	    	{
			for(Student s4:s)
			{
			    System.out.println("Student_id "+s4.getid()+"\nStudent_name "+s4.getname());
			}
	    	}
	    	else {
	    		System.err.println("Student details are Not present! ");
	    	}
	    }
	    else if(ch==4)
	    {
	    	System.out.println("Enter Student Id for Remove details:");
	    	int id =sc.nextInt();
		    si.Remove(id);
	    }
	    else if(ch==5)
	    {
            System.out.println("Thank you for using Student Management System");
		    System.exit(0);
	    }
		else 
		{
		System.err.println("Invalid Input Try again....");
	    }
    }
}
}
