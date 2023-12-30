package players;

import java.util.Scanner;

public class Football extends player {
	int goal;
	String position;
	public Football(Scanner sc1,String message) {
		super(sc1,message);
		//Scanner sc1= new Scanner(System.in);
		
		System.out.println("Enter player total goal: ");
		this.goal=sc1.nextInt();
		System.out.println("Enter player position: ");
		this.position=sc1.next();
	}
	void DisplayfootballStats() {
		super.displayinfo();
		System.out.println("Total Goal:"+" "+this.goal);
		System.out.println("Player Position:"+" "+this.position);
	}

}
