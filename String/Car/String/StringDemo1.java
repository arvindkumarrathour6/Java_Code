package String;

public class StringDemo1 
{
	public static void main(String[] args) 
	{
		String s="ARv@iNd12345";
		
		int len=s.length();
		System.out.println("length of String : "+len);
		
		char [] arr=s.toCharArray();
		int c=0;
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]);
			c++;
		}
		System.out.println();
		System.out.println("length of String : "+c);
		int count=0,count1=0,count2=0,count3=0,sum=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>=65 && arr[i]<=90) {//upper case
				count++;
			}
			else if(arr[i]>=97 && arr[i]<=122) {//lower case
				count1++;
			}
		else if(arr[i]>=48 && arr[i]<=57){//numbers
			count2++;
			sum+=arr[i]-48;
		}
		else {
			count3++;
		}
	}
		System.out.println("length of uppercase in string : "+count);
		System.out.println("length of lowercase in String : "+count1);
		System.out.println("length of SpecialChar in String : "+count3);
		System.out.println("length of Number in String : "+count2+" and Sum of number : "+sum);
		
		for(int i=0;i<s.length();i++) {
			System.out.println(s.charAt(i));
		}
	}
  
}
