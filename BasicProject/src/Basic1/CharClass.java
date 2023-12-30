package Basic1;

public class CharClass {
	public static void main(String[] arg)
	{
		int n=5,a=0;
		String s="Arvind";
		for (int i = 0; i <= n; i++ ) 
		{
			for (int j = 0 ; j <= n; j++ ) 
			{
				if (i == 0 || i == n - 1 ) 
				{
					System.out.print(s.charAt(j));
				}
				else if( j == 0 || j == n - 1){
					System.out.print(s.charAt(j));
				}
				else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
	}

}
