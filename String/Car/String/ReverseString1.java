package String;

public class ReverseString1
{
	public static String reverse(String s)
	{
		String res="";
		for(int i=s.length()-1;i>=0;i--)
		{
			res+=s.charAt(i);
		}
		return res;
	}
	public static void main(String...A)
	{
			String s="apple is red";
			System.out.println("Reverse String is :"+reverse(s));
		
	}

}
