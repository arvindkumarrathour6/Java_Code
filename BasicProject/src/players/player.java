package players;
import java.util.Scanner;
public class player {
	private String name;
	private int age;
	private double h;
	private String country;
	
	public player(Scanner sc1,String message) {
		
		System.out.println("Enter "+message+" player details.....");
		System.out.println("Enter player name: ");
		this.name=sc1.next();
		System.out.println("Enter player age: ");
		this.age= sc1.nextInt();
		System.out.println("Enter player height: ");
		this.h=sc1.nextDouble();
		System.out.println("Enter player country: ");
		this.country=sc1.next();
	}
	
	void displayinfo() {
		//System.out.println();
		System.out.println("Player name is:"+" "+this.name);
		System.out.println("Player age is:"+" "+this.age);
		System.out.println("Player height is:"+" "+this.h);
		System.out.println("Player country is:"+" "+this.country);
	}

}
