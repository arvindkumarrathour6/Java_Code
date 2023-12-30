package Recursion;

import java.util.Scanner;

public class PrimeNumber3
{
	static boolean check_prime(int n,int i)
	{
		if (n==1||n==0) {
			return false;
		}
		if(n%i==0) {
			return false;
		}
		if(i*i>n) {
			return true;
		}
	       return check_prime(n,i+1);
	}
 public static void main(String[] args)
 {
 	Scanner sc = new Scanner(System.in);
     System.out.println("Enter the Number");
     int n = sc.nextInt();
     int i=2;
     if (check_prime(n,i)) {
         System.out.println("It is prime Number");
     } else {
         System.out.println("It is not prime  Number");
     }
	}
}