package Arrays;

public class CommonEle {
	public static void main(String[] args) {
		int arr1[]= {10,5,15,20,14,13,9};
		
		int arr2[]= {5,9,15,22,24,48};
		
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr2.length;j++) {
				if(arr1[i]==arr2[j])
				System.out.println("Common element: "+arr1[i]);
			}
		}
	}

}
