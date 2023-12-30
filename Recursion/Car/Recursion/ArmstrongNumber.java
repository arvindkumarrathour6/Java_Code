package Recursion;

public class ArmstrongNumber
{
	static int armstrong(int n) {
		int res=0;
		int c=power(n);
		while(n>0) {
		   int rem=n%10;
		   res=(int) (Math.pow( rem,c)+res);
		   n/=10;
		}
		return res;
	}
	static int power(int n) {
		int c=0;
		while(n>0) {
			n/=10;
			c++;
		}
		return c;
	}
	public static void main(String[] args)
	{
		int n=1634;
		int arm=armstrong(n);
		System.out.println(arm);
		if(n==arm) {
		System.out.println("It is ArmStrong Number");
	}
		else {
			System.out.println("It is not ArmStrong Number");
		}
	}
}
