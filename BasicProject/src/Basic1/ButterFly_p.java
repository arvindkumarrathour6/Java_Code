package Basic1;
import java.util.Scanner;
public class ButterFly_p {
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number:");
		int n=sc.nextInt();
		System.out.println();
		System.out.println();
		for (int i = 1; i <= n; i++){
			
			System.out.print("                ");

            for(int j=1 ; j<=i ; j++){

               System.out.print("*");

            }
               for (int k = 1; k <(n-i)*2 ; k++)

               System.out.print(" ");

               for(int j=1 ; j<=i ; j++){
            	   if(j==n) {
            		   continue;
            	   }

               System.out.print("*");

               }

            System.out.println();
            
        }
		for (int i = n-1; i > 0; i--){
			System.out.print("                ");

            for(int j=1 ; j<=i ; j++){

               System.out.print("*");

            }

               for (int k = 1; k < (n-i)*2 ; k++)

               System.out.print(" ");

               for(int j=1 ; j<=i ; j++){

               System.out.print("*");

               }

            System.out.println();
            
        }

    }

}