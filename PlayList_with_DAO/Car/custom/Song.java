package custom;

import java.util.Scanner;

public class Song 
{
	private String song_name,Artist;

	public Song()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Title of Song:");
		this.song_name = sc.nextLine();
		System.out.println("Enter the Artist of Song:");
		Artist = sc.nextLine();
		System.out.println(song_name+": Song added Succesfully");
	}
    public String getSong_name() 
	{
		return song_name;
	}
    public String getArtist() 
	{
		return Artist;
	}
}
