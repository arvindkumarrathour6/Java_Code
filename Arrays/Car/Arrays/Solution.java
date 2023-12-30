package Arrays;

import java.util.*;

public class Solution {
    public static ArrayList<Integer> duplicates(int [] arr, int n) {
        // code here
        ArrayList<Integer> c = new ArrayList<Integer>();
        ArrayList<Integer> v = new ArrayList<Integer>();
        for(int i=0;i<n-1;i++){
            c.add(arr[i]);
        }
        Arrays.sort(arr);
        int l=0,a=0;
        for(int j=0;j<arr.length;j++){
            l=0;
            for(int k=j+1;k<c.size();k++){
            	if(arr[j]==arr[k] && j!=k && j<k && l<=1){
                	l++;
                	a++;
                	
                    v.add(arr[j]);
                	
                    
                }
            }
        }
        if(a==0){
        	v.add(-1);
            return v;
        }
        else{
            return v;
        }
        
    }
    
}