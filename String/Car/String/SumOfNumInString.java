package String;

public class SumOfNumInString
{
	public static void main(String[] args) 
	{
		String s="ARv@iNd12345";
		char [] arr=s.toCharArray();
		int sum=0;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>=48 && arr[i]<=57)
			{
			sum+=arr[i]-48;
			}
		}
		
		System.out.println("Sum Of Number present in String : "+sum);
	}
	
}
