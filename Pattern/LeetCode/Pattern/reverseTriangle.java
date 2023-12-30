package Pattern;

public class reverseTriangle
{
	public static void main(String[] args) 
	{
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print("  "+" ");
				}
			for(int k=n;k>n-i;k--) {
				System.out.print(k+" ");
			}
			for(int j=n-i+2;j<=n;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("  "+" ");
				}
			for(int k=n;k>=i+1;k--) {
				System.out.print(k+" ");
			}
			for(int j=i+2;j<=n;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}
