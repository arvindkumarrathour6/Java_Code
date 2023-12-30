package Tata.car.factory;

public class CarFactory {
	public static Carfunctionality getCar(String type)
	{
		if (type.equalsIgnoreCase("nexon"))
		{
			return new Nexon();
		}
		else if (type.equalsIgnoreCase("safari"))
		{
			return new Safari();
		}
		else {
			System.out.println("Car not Found");
			return null;
		}
	}

}
