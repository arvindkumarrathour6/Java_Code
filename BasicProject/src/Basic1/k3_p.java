package Basic1;
import java.util.Scanner;
public class k3_p {
	public static void main(String[] arg)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number:");
		int n=sc.nextInt();
		for (int i=1;i<=n;i++) {
			for (int k=1;k<i;k++) {
				System.out.print(" ");
			}
			for(int j=n;j>=i;j--) {
				System.out.print(j);
				}
			System.out.println();
		}
		
		for (int i=2;i<=n;i++) {
			int a=n;
			for (int k=1;k<=n-i;k++) {
				System.out.print(" ");
			}
			for(int j=i;j>=1;j--) {
				System.out.print(a--);
				}
			System.out.println();
		}
		}

}