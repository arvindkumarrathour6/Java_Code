package Basic1;

public class j4 {
	public static void main(String[] arg)
	{
		int n=5;
		int a=n;
		for (int i=1;i<=(n*2)-1;i++) {
			for (int j=n;j>=i;j++) {
				if(j>=a) {
					System.out.print("* ");
					
				}
				
			}
				System.out.println();
				if (i<n) {
					a++;
				}
				else {
					a--;
				}
		}
	}
}




