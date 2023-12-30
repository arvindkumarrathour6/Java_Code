package Basic2;

public class Circle {
	double radius;
    public Circle(double radius) {
    	 this.radius=radius;
    }
	
	public Circle calculate_arec() {
		
		double Area=3.14*radius*radius;
		System.out.println("Area of a Circle "+Area);
		return this;
	}
    public Circle calculate_parimeter() {
		
		double parimeter=3.14*radius*2;
		System.out.println("Parimeter of a Circle "+parimeter);
		return this;
	}
	public static void main(String[] args) {
		new Circle(5.5).calculate_parimeter().calculate_arec();
		
	}

}


