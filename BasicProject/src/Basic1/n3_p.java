package Basic1;

import java.util.Scanner;

public class n3_p {
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number:");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
		for(int i=n-1;i>=1;i--)
		{
			for(int j=i; j<n-1;j++) {
				System.out.print(" ");
				
			}
			for(int k=i;k>=1;k--) {
				System.out.print(" "+i);
			}
			System.out.println();
		}
	}

}
