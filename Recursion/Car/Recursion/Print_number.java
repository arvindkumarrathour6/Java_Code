package Recursion;

import java.util.Scanner;

public class Print_number 

{
	public static void printNumber(int n)
	{
		if (n==11)
		{
			return ;
		}
		System.out.print(n+" ");
		printNumber(n+1);
	}
     public static void main(String[] args)
     {
    	 Scanner sc = new Scanner(System.in);
    	 System.out.println("Enter the number : ");
    	 int n=sc.nextInt();
    	 printNumber(n);
    	 System.out.println("\nEnter the number : ");
    	 int n1=sc.nextInt();
    	 for(int i=1;i<=10;i++) {
    		 System.out.print(i+" ");
    	 }
     }
}
