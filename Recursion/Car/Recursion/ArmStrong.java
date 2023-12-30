package Recursion;

public class ArmStrong 
{
	public static void main(String[] args) 
	{
		int n=153;
		int temp=n;
		int r=n;
		int c=0,res=0;
		while(temp>0) 
		{
			temp/=10;
			c++;
		}
		while(n>0) {
			 int rem=n%10;
			   res=(int) (Math.pow( rem,c)+res);
			   n/=10;
		}
		
		System.out.println(res);
		if(r==res) {
		System.out.println("It is");
	}
		else {
			System.out.println("It is not");
		}

	}

}
