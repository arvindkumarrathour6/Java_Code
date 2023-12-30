package Recursion;

import java.util.Scanner;

public class EvenOdd
{
	public static void evenodd(int n) {
		for(int i=1;i<=10;i++) {
   		 if(i%2==1)
   		 System.out.print("odd number :  "+i);
   		 else {
   			 System.out.println(", even  number : "+i);
   		 }
		}
	}
     public static void main(String[] args) {
    	 Scanner sc  = new Scanner(System.in);
    	 System.out.println("Enter the number : ");
    	 int n=sc.nextInt();
    	 evenodd(n);
    	 
	}
}
