package Basic1;

public class car {
	String name;
	Engine e;
	public car(String name) {
		e=new Engine("Turbo1.2");
		this.name=name;
	}
	void startcar() {
		System.out.println(name+" Car get stated");
		e.startEngine();
	}
	
	public static void main(String[] arg) {
		car c= new car("Lomborgini");
		c.startcar();
	}

}
