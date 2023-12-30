package Basic;

class a{
	static int c=10;
	static void m() {
		System.out.println("hi");
	}
}
class b extends a
{
	static int c=20;
}
public class Ex2{
	public static void main(String[] args) {
		a e = new b();
		System.out.println(e.c);
		System.out.println(e.m());
	}

}
