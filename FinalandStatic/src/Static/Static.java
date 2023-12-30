package Static;

public class Static {
	static void PrintName() {
      System.out.println("Arvind");
	}

}

class Static1 extends Static{
	//@Override  WE CAN'T INHERITE STATIC METHOD and NOT OVERRIDE!!!!!
	static void PrintName() {
	System.out.println("Bhawna");
	}
}
