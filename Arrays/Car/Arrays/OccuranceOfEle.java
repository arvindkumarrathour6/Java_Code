package Arrays;

import java.util.Scanner;

public class OccuranceOfEle{
	public static void main(String...A) {
		int arr1[]= {10,5,15,20,14,5,14,5};
		int c=0;
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr1.length;j++) {
			if(arr1[i]==arr1[j]) {
				c++;
				
			}
		 }
		System.out.println("occuranc of ele:         "+arr1[i]+"          "+c);
		c=0;
		}
	}
	
}
