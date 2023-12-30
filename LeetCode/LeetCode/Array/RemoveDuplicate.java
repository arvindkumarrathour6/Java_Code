package Array;

public class RemoveDuplicate 
{
	public static void main(String[] args) {
		int nums[]= {1,2,3,1,4};
		int arr[] = null;
		int k=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=nums[k-1]){
                arr[k]=nums[i];
                k++;
            }
        }
		System.out.println(arr.toString());
	}

}
