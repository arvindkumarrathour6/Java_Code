package Pattern;

public class Hp
{
	public static void main(String[] args) 
	{
		int n=11,m=7;
		for(int i=0;i<n;i++) 
		{
			for(int j=0;j<m;j++) 
			{
				if(((i==1||i==9) && j%3==0) ||( i-j==2) || ((i==0||i==10) && j%3!=0) || (i+j==8)) 
				{
					System.out.print("* "+" ");
				}
				else {
					System.out.print(" "+" ");
				}
			}
			System.out.println();
		}
		
	}
    
}
