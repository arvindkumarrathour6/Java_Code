package Basic1;

import java.util.Scanner;

public class Butterfly2{
	public static void main(String[] arg) {
	Scanner sc =new Scanner(System.in);
	System.out.print("Enter a number:");
	int n=sc.nextInt();
	int nor=n, noc=n;
	for(int i=1;i<=(n*2)-1;i++) {
		for(int j=1;j<=(n*2)-1;j++) {
			if (j==nor||j==noc) {
				System.out.print("*");
				
			}
			else {
				System.out.print(" ");
			}
		}
		System.out.println();
			if(i<n) {
				noc--;
				nor++;
			}
			else {
				noc++;
				nor--;
			}
		}
	}
	

}