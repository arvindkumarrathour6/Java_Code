package Recursion;

import java.util.Scanner;

public class Factorial 
{
	public static int Factorial(int n)
	{
		if(n==0 || n==1)
		{
			return n;
		} 
		return n*Factorial(n-1);
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int n=sc.nextInt();
		System.out.println("Factorial of "+ n+" is "+Factorial(n));
	}
	

}
