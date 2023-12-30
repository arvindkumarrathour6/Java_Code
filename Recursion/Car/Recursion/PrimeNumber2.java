package Recursion;

import java.util.Scanner;

//Time Complexity O(sqrt(n))
public class PrimeNumber2
{
	static boolean check_prime(int n)
	{
		if (n==1||n==0) {
			return false;
		}
		for(int i=2;i<=Math.sqrt(n);i++) {
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

    for(int i=0;i<=n;i++) {
     if (check_prime(i)) {
         System.out.println("prime Number: "+i);
     
     }
	}
 }
}