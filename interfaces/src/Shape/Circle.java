package Shape;

public class Circle implements Shape{
	double r;
    public Circle(double radius) {
    	 r=radius;
    }
	@Override
	public void calculate_area() {
		
		double Area=3.14*r*r;
		System.out.println("Area of a Circle "+Area);
	}

}
