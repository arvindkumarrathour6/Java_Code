package String;

import java.util.Scanner;

public class PalindromString 
{
	public static boolean palindrom(String s)
	{
		String res="";
		for(int i=0;i<s.length();i++)
		{
			res=s.charAt(i)+res;
		}
		return res.equals(s);
	}
	public static void main(String...A)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String s=sc.next();
		boolean b= palindrom(s);
		if(b)
		{
			System.out.println("String is palindrom" );
		}
		else
		{
			System.out.println("String is not palindrom");
		}
		
	}

	

}
