package Recursion;

import java.util.Scanner;

public class ArmStrongwithoutInbuiltMethod
{
	static int digitOfnumber(int n) {
		int c=0;
		while(n>0) {
			n/=10;
			c++;
		}
		return c;
	}
	static int power(int rem,int digit) {
		int res=1;
		while(digit>0) {
			res=res*rem;
			digit-=1;
		}
		return res;
	}
	static int armstrong(int n) {
		int digit=digitOfnumber( n);
		int res=0;
		while(n>0) {
			int rem=n%10;
			res=power(rem,digit)+res;
			n/=10;
		}
		return res;
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int n= sc.nextInt();
		int arm=armstrong(n);
		System.out.println(arm);
		if(n==arm) {
		System.out.println("It is ArmStrong Number");
	}
		else {
			System.out.println("It is not ArmStrong Number");
		}
	}

}
