package Basic1;

import java.util.Scanner;

public class p3 {
	public static void main(String[] arg) {
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter a number:");
		int n=sc.nextInt();
		for (int i=1;i<=n;i++) {
			for (int k=1;k<=n-i;k++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
				}
			System.out.println();
		}
		for (int i=1;i<=n-1;i++) {
			for (int k=1;k<i;k++) {
				System.out.print(" ");
			}
			for(int j=n-1;j>=i;j--) {
				System.out.print(" *");
				}
			System.out.println();
		}
	}


}
