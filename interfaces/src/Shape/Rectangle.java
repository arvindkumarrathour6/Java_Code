package Shape;

public class Rectangle implements Shape {
    int a,b;
    
	public Rectangle(int width,int length) {
		a=width;
		b=length;
	}
	@Override
	public void calculate_area() {
		
		int Area=a*b;
		System.out.println("Area of Rectangle "+Area );
	}

}
