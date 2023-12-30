package Recursion;

import java.util.Scanner;

public class ReverseNumber
{
	static int reverse(int n,int res) {
			int rem=n%10;
		     res=res*10+rem;
			 n/=10;
			 if (n<=0) {
				return res;
			}
		
		return reverse(n,res);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int res=0;
		int result=reverse(n,res);
		System.out.println("Reverse Number\n"+result);
		if (n==result) {
			System.out.println("It's Palindrom");
		}
		else {
			System.out.println("It's not");
		}
	}

}
