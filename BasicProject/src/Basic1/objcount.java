package Basic1;

public class objcount {
	int c;
	objcount()
	{
		c++;
	}
	public static void main(String[] arg) {
		objcount c1=new objcount();
		objcount c2=new objcount();
		objcount c3=new objcount();
		System.out.println(c1.c);
	}

}
