
package Arrays;
import java.util.*;


public class duplicate 
{
	public static void main(String[] args)
	{
	int arr[]= {1,2,3,2,3};
	int n=arr.length;
	for(int i=0;i<n;i++)
	{
		int rem=arr[i]%n;
		arr[rem]+=n;
	}
	
    for(int i=0;i<n;i++)
    {
    	System.out.print(arr[i]+",");
    }
}

}
