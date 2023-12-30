package Sorting;

public class Palindrom 
{
	static boolean Palindrom(int []a) {
		int low=0;
	    int high=a.length-1;
	    
	    while(low<high) {
	    	if(a[low]!=a[high]) {
	    		return false;
	    	}
	    	else {
	    		low++;
	    		high--;
	    	}
	    }
	    return true;
	}
	public static void main(String[] args) {
		
    int a[]= {1,2,4,5,2,1};
    
    boolean check=Palindrom(a);
    if(check) {
    	System.out.println("It is");
    }
    else {
    	System.out.println("It's not");
    }
    }
}

