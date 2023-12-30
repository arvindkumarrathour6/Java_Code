package EmployeeApp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class EmpApp 
{
	public static void main(String...A)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of employee:");
		int n= sc.nextInt();
		ArrayList c= new ArrayList();
		for (int i=0;i<n;i++)
		{
			c.add(new emp(sc));
		}
		
		for(int i=0;i<c.size();i++) {
			System.out.println(c.get(i));
		}
	}

}
