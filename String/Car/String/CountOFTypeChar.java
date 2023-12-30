package String;

public class CountOFTypeChar 
{
     public static void main(String[] args)
     {
		String s="PE123nt@#g  NG";
		
		int c1=0,c2=0,c3=0,c4=0,c5=0;
		
		for(int i=0;i<s.length();i++) 
		{
			if(s.charAt(i)>=65 && s.charAt(i)<=90) //Upper Case
			{
				c1++;
			}
			else if(s.charAt(i)>=97 && s.charAt(i)<=122) //Lower Case
			{
				c2++;
			}
			else if(s.charAt(i)==32) //Space
			{
				c3++;
			}
			else if(s.charAt(i)>=48 && s.charAt(i)<=57) //Numbers
			{
				c4++;
			}
			else 
			{
				c5++;
			}
		}
		System.out.println("Upper case: "+c1);
		System.out.println("Lower case: "+c2);
		System.out.println("Space         : "+c3);
		System.out.println("Numbers   : "+c4);
		System.out.println("Special char: "+c5);
		System.out.println("Length Of Str: "+s.length());
	}
}
