package Pattern;

import java.util.Scanner;

public class pattern 
{
	public static void main(String[] args) {
		
		int b=1;
		for(int i=1;i<=5;i++)
		{
			int a=1;
			for (int j=1;j<=5-i;j++) {
				System.out.print(" "+" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print(k+" ");
			}
			for(int j=i-1;j>=1;j--) {
				System.out.print(j+" ");
			
			}
			System.out.println();
		}
		System.out.println();
		for(int i=1;i<=5;i++)
		{
			int a=5;
			for (int j=1;j<=5-i;j++) {
				System.out.print(" "+" ");
			}
			for(int k=5-i+1;k<=5;k++) {
				System.out.print(a+" ");
				a--;
			}
			for(int j=i-1;j>=1;j--) {
				System.out.print(a+2+" ");
			    a++;
			}
			System.out.println();
		}
		System.out.println();
		for(int i=1;i<=5;i++)
		{
			for (int j=1;j<=5-i;j++) {
				System.out.print(" "+" ");
			}
			for(int k=5;k>5-i;k--) {
				System.out.print(k+" ");
				
			}
			for(int j=5-i+2;j<=5;j++) {
				System.out.print(j+" ");
			    
			}
			System.out.println();
		}
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter a number:");
		int n=sc.nextInt();
		for (int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
				}
			System.out.println();
		}
	
	for (int i=1;i<=n;i++) {
		for(int j=n-1;j>=i;j--) {
			System.out.print("* ");
			}
		System.out.println();
	}
	System.out.println("ButterFly:");
	int nor=n, noc=n;
	for(int i=1;i<=(n*2)-1;i++) {
		for(int j=1;j<=(n*2)-1;j++) {
			if (j==nor||j==noc) {
				System.out.print("*");
				
			}
			else {
				System.out.print(" ");
			}
		}
		System.out.println();
			if(i<n) {
				noc--;
				nor++;
			}
			else {
				noc++;
				nor--;
			}
		}

	}

}
