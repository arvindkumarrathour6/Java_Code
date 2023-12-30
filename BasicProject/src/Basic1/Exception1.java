package Basic1;

public class Exception1 
{
	public static void main(String[] args) {
		try {
			int a=100/0;
		}
		catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("run rest of the code");
	}

}
