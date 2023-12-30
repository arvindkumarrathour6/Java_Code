package Basic2;

public class sd1 {
	public static void main(String[] arg)
	{
		int i,j,n=6;
		for (i=1;i<=n;i++) {
			for(j=1;j<=n;j++) {
				if (i==1||i==n||i==j||(i+j)==n+1) {
					System.out.print("*");				
			}
			else {
				System.out.print(" ");
			}
			
		}
System.out.println();
	}
	}


}


