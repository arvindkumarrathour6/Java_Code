package Recursion;

import java.util.Scanner;

public class ArmstrongNumber1
{
	static int armstrong(int n) {
		int res=0,temp=n;
		int c=power(n);
		while(n>0) {
		   int rem=n%10;
		   res=(int) (Math.pow( rem,c)+res);
		   n/=10;
		}
		return res;
	}
	static int power(int n) {
		int c=0;
		while(n>0) {
			n/=10;
			c++;
		}
		return c;
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int n= sc.nextInt();
		for(int i=1;i<=n;i++) {
		if(i==armstrong(i)) 
		   System.out.println("ArmStrong Number is :"+i);
		else 
			continue;
		}
	}
}
