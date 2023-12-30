package Recursion;

import java.util.Scanner;

//Time Complexity O(n/2)

public class PrimeNumber1
{
	static boolean check_prime(int n)
	{
		if (n==1||n==0) {
			return false;
		}
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
 public static void main(String[] args)
 {
 	Scanner sc = new Scanner(System.in);
     System.out.println("Enter the Number");
     int n = sc.nextInt();

     if (check_prime(n)) {
         System.out.println("It is prime Number");
     } else {
         System.out.println("It is not prime  Number");
     }
	}
}