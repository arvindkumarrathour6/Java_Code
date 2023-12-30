package Basic1;

public class sd {
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

