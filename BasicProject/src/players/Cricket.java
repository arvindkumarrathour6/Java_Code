package players;

import java.util.Scanner;

public class Cricket extends player {
	int wicket;
	int run;
	public Cricket(Scanner sc1,String message) {
		super(sc1,message);
		
		//Scanner sc1= new Scanner(System.in);
		
		System.out.println("Enter player Wicket: ");
		this.wicket=sc1.nextInt();
		System.out.println("Enter player run: ");
		this.run=sc1.nextInt();
		
	}
	 void DisplaycricketStats() {
		super.displayinfo();
		System.out.println("Wicket Taken:"+" "+this.wicket);
		System.out.println("Total run:"+" "+this.run);
	}

}
