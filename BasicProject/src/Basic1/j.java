package Basic1;

public class j {
	public static void main(String[] arg)
	{
		int n=5;
		int a=n;
		for (int i=1;i<=(n*2)-1;i++) {
			for(int j=1;j<=(n*2)-1;j++) {
				if(j>=a) {
					System.out.print("* ");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
			if(i<n) {
				a++;
			}
			else {
				a--;
			}
		}
	}

}
