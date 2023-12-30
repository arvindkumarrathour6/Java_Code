package Basic1;
import java.util.Scanner;
public class n_p {
	public static void main(String[] arg) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a number:");
		int n=sc.nextInt();
		for (int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}

}
