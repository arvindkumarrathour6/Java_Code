package Frequency;

public class MethodsOfString {
	public static void main(String...A)
	{
		String s1="Arvind";
		String s2="Kumar";
		
		System.out.println(s1.equals(s2)); // return true/false value
		
		System.out.println(s1.length());//return the length of String
		
		System.out.println(s1.charAt(1));//return the char value at the given index of String
		
		System.out.println(s1.compareTo(s2));//compares the given string with the current string lexicographically. 
		                                     //It returns a positive number, negative number, or 0.
		
		System.out.println(s1.codePointAt(0));//return the ASCII value at the given index of String
		
		System.out.println(s1.isEmpty());//return true/false based on string empty or present.
		
		System.out.println(s1.compareToIgnoreCase(s2));//compares the given string with the current string and ignore the case. 
                                                      //It returns a positive number, negative number, or 0.
		
		System.out.println(s1.concat(s2));//it return the combined String.
		
		System.out.println(s1.codePointCount(1, 5));
		
		System.out.println(s1.trim());//remove the whitespace
		
		System.out.println(s1.equalsIgnoreCase(s2));//return true or false
		
		System.out.println(s1.indexOf(s2));
		
		System.out.println(s1.indexOf('d'));
		
		System.out.println(s1.strip());
		
		System.out.println(s1.toLowerCase());//convert the string into lower case
		
		System.out.println(s1.toCharArray());
		
		System.out.println(s1.toUpperCase());//convert
	}

}
