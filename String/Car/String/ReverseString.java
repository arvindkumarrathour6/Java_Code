package String;

import java.util.Scanner;

public class ReverseString
{
	public static String reverse(String s)
	{
		String res="";
		for(int i=0;i<s.length();i++)
		{
			res=s.charAt(i)+res;
		}
		return res;
	}
	public static void main(String...A)
	{
		    //Scanner sc = new Scanner(System.in) ;
		   //System.out.println("Enter String");
			String s="apple";
			System.out.println("Reverse String is :"+reverse(s));
		
	}

}
