package Basic1;

public class Trip{
	void travel(String place, int kilometer) {
		System.out.println("The 1st place is "+ place+" of "+ kilometer+"Km");
	}
	void travel(String place, int kilometer,String resort) {
		System.out.println("The 2nd place is "+ place+" of "+ kilometer+"Km "+" Stayed in "+resort+" resort");
	}
	void travel(String place) {
		System.out.println("The last place is "+ place);
	}
	public static void main(String[] args) {
		Trip t1=new Trip();
	
		t1.travel("Mysore",50);
		t1.travel("Mengaluru", 30, "Taj");
		t1.travel("Bengaluru");
		
	}

}
