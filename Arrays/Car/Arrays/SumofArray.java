package Arrays;

import java.util.Scanner;

public class SumofArray {
	public static void main(String...A) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size of Array");
		int s=sc.nextInt();
		int[] a=new int[s];
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
			
		}
		int sum=0;
		
		for(int j=0;j<a.length;j++){
			sum+=a[j];
		}
		System.out.println("Sum of Array element "+sum);
		System.out.println("Array of Array element "+sum/s);
	}

}
