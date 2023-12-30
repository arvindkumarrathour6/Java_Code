package Recursion;

public class sumOfnumber {
	
	public static int printNumber(int n,int sum)
	{
		if (n==6)
		{
			return sum ;
		}
		sum+=n;
		return printNumber((n+1),sum);
		    
		
	}
     public static void main(String[] args)
     {
    	 System.out.println(printNumber(1,0));
     }
}



