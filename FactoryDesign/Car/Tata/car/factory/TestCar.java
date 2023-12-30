package Tata.car.factory;

import java.util.Scanner;

public class TestCar {
	public static void main(String...A) {
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter car name");
	String type= sc.next();
	Carfunctionality c=CarFactory.getCar(type);
	if (c!=null) {
		c.Start();
		c.Drive();
		c.cOff();
	}

}}
