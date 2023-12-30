package players;
import java.util.Scanner;

public class Game {
	public static void main(String[] arg) {
	
	Scanner sc = new Scanner(System.in); 
	
	Cricket c= new Cricket(sc,"Cricket");
	c.DisplaycricketStats();
	
	System.out.println();
	
	Football b= new Football(sc,"Football");
	b.DisplayfootballStats();
	
	}

}
