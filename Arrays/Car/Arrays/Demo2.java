package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class Demo2 {
	public static void main(String...A) {
		int arr[]= {1,2,3,4,5,6};
		     Arrays.sort(arr);
	        ArrayList<Integer> l = new ArrayList<Integer>(); 
	        int n=arr.length;
			for (int i=0;i<n;i++)
	        {
	            int max=n-i-1;
	            l.add(arr[max]);
	            l.add(arr[i]);
	        }
			System.out.println(l);
	        for(int i=0;i<n;i++)
	        {
	            arr[i]=l.get(i);
	        }
	        for(int i=0;i<n;i++) {
	        	System.out.print(arr[i]);
	        }
	    }
	}

