package PlayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Song_Manipulation implements Playlist
{
	LinkedList <Song>list=new LinkedList<>();
	Scanner sc=new Scanner(System.in);
    @Override
	public void add_song()
    {
		list.add(new Song());
	}
    @Override
	public void remove_song()
    {
		System.out.println("Enter song to remove");
		String song1=sc.nextLine();
		for(Song s: list) 
		{
			if (s.Song.equalsIgnoreCase(song1)) 
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
				System.out.println("Song name:-"+s.Song);
				System.out.println("Artist name:-"+s.Artist);
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
class Song {
	String Artist,Song;

	public Song() 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Title of song");
		Song=sc.nextLine();
		System.out.println("Enter Artist of song");
		Artist=sc.nextLine();
		System.out.println(Song+" Song added Succesfully");
	}
}
    
	
