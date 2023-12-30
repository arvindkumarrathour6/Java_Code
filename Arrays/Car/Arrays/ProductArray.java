package Arrays;

import java.util.Scanner;

public class ProductArray 
{
    String pname;
    int pId;
    double price;
	public ProductArray(Scanner sc,int a) {
		System.out.println("Enter product : "+a+" Details");
		System.out.println("Enter product name:");
		this.pname = sc.next();
		System.out.println("Enter product id:");
		this.pId = sc.nextInt();
	    System.out.println("Enter product price:");
		this.price = sc.nextDouble();
	}
	@Override
	public String toString() {
		return this.pname+" "+this.pId+" "+this.price;
	}
    
}
