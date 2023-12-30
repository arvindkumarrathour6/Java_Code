package Arrays;

import java.util.Scanner;

public class Biggest_Ele 
{
	public static void main(String...A) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size of Array");
		int s=sc.nextInt();
		int[] a=new int[s];
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
			
		}
		int c=0;
		for(int i=0;i<a.length;i++) {
			//int c=0;
			for(int j=0;j<a.length;j++) {
				if(a[i]>a[j]) {
					c=a[i];
				}
			}
			
		}
		System.out.println("Biggest element in Array "+c);
		}
		
}
