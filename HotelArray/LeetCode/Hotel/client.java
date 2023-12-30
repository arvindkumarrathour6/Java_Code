package Hotel;

import java.util.Scanner;

public class client 
{
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("=======================Hotel=======================");
		Hotel h= new Hotel();
		HotelFactory hf= new HotelFactory();
		HotelInterface hi=hf.createInstace();

	   System.out.println("=======================Welcome=======================");
	   System.out.println("What would you like to do?");
	   System.out.println("enter the choice");
	   hi.menu(h);
	   int choice=scan.nextInt();
	   while(choice<6) {
		   
	   
	  
	   hi.orderfood(h, choice);
	   System.out.println("enter the choice");
	   hi.menu(h);
	   
	   choice=scan.nextInt();
	   }
	   hi.bill(h);
	}

}
