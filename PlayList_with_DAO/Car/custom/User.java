package custom;

import java.util.Scanner;


public class User 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("    Playlist Management System");
		System.out.println("==================================");
		System.out.println("1. Add_Song\n2. Remove_Song\n3. Display_Playlist\n4. Exit");
		System.out.println("==================================");
		
		SongFactory sf=new SongFactory();
		PlayList p= sf.createInstace();
		
		while(true) 
		{
			System.out.println("Enter your choice :");
			int ch=sc.nextInt();
			if(ch==1)
			{
				p.add_song(new Song());
		    }
		    else if(ch==2) 
		    {
		    	p.remove_song();
		    }
		    else if(ch==3)
		    {
			    p.display_song();
		    }
		    else if(ch==4)
		    {
			    p.exit();
		    }
			else 
			{
			System.err.println("Invalid Input Try again....");
		    }
	    }
	}
	

}
