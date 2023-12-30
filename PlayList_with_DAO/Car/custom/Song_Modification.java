package custom;

import java.util.LinkedList;
import java.util.Scanner;

public class Song_Modification implements PlayList
{
	LinkedList <Song>list=new LinkedList<>();
	Scanner sc=new Scanner(System.in);
    @Override
	public void add_song(Song s)
    {
		list.add(s);
	}
    @Override
	public void remove_song()
    {
		System.out.println("Enter song to remove");
		String song1=sc.nextLine();
		for(Song s: list) 
		{
			if (s.getSong_name().equalsIgnoreCase(song1)) 
			{
				list.remove(s);
				System.out.println(song1+" Song Remove Succesfully");
				break;
			}
		}
		
	}
    @Override
	public void display_song()
    {
		if(list.size()!=0) 
		{
			System.out.println(list);
			for(Song s:list) 
			{
				System.out.println("Song name:-"+s.getSong_name());
				System.out.println("Artist name:-"+s.getArtist());
			}
		}
		else 
		{
			System.err.println("Playlist is Empty....");
		}
	}
    @Override
	public void exit()
    {
    	System.out.println("Thanks For Using Playlist Management App!");
		System.exit(0);
	}
}


