package Arrays;

public class HighestSumOf2Num 
{
	public static void main(String[] args) {
	
	int arr[]= {10,5,15,20,14,13,9};
	int sum=arr[0]+arr[1];
	
	int index=0;
	for(int i=1;i<arr.length;i++) {
		if(arr[i-1]+arr[i]>sum) {
		
			sum=arr[i-1]+arr[i];
			
			index=i;
		}
	}
	System.out.println("Highest sum of 2num is: "+sum+"  Number's are :"+arr[index-1]+" "+arr[index]);
	}

}
