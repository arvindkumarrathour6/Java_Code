package Recursion;

import java.util.Scanner;

public class fibonacy 
{
    public static int fibonacci(int n)
    {
    	if(n<0)
    	{
    		System.out.print("Invalid input");
    		return n;
    	}
    	else if(n==0)
    	{
    		return 0;
    	}
    	else if(n==1 || n==2)
    	{
    		return 1;
    	}
    	else
    	{
    		return fibonacci(n-1)+fibonacci(n-2);
    	}
    }
    public static void main(String...a)
    {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter number ");
    	int n=sc.nextInt();
    	for(int i=0;i<=n;i++)
    		System.out.print(" "+fibonacci(i));
    }
}
