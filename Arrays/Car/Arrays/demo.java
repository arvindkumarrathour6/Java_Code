package Arrays;

import java.util.ArrayList;

public class demo {
	public static void main(String[] args) {
	int arr[]= {2,3,1,2,3};
	int n=arr.length;
	for (int i = 0; i < n; i++) {
        int rem = arr[i] % n;
        //System.out.println(rem);
        arr[rem] += n;
        
        //System.out.println(arr[rem]);
	}
	for (int i = 0; i < n; i++) {
	System.out.println(arr[i]);
	}
	ArrayList<Integer> ans = new ArrayList<>();
    for (int i = 0; i < n; i++) {
        arr[i] = arr[i] / n;
        System.out.println(arr[i]);
        if (arr[i] > 1) {
            ans.add(i);
        }
    }
    //System.out.println(ans);
	}

}
