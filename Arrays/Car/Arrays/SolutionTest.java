package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class SolutionTest {
	public static void main(String[] args) {
    	Scanner sc= new Scanner(System.in);
    	int n=sc.nextInt();
    	int[] arr = new int[n];
    	
    	for(int i=0;i<n;i++) {
    		int k=sc.nextInt();
    		arr[i]=k;
    	}
    	System.out.println(Solution.duplicates(arr,n));
    }

}
