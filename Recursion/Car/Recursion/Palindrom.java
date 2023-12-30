package Recursion;

import java.util.Scanner;

public class Palindrom 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int res=0,rem=0;
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int temp=n;
		while(n>0){
			rem=n%10;
			res=res*10+rem;
			n/=10;
		}
		if (temp==res)
		System.out.println(" Number is palindrom");
		else {
			System.out.println("Nunber is not Palindrom");
		}
	}

}
