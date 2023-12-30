package players;

public class testfood {
	public static void main(String[] arg) {
		dosa d=new mdosa();
		food f=d;
		Object ob = f;
		if (f instanceof mdosa) {
			mdosa md=(mdosa)f;
			System.out.println("down to mdosa");
			
		}
		else if (f instanceof biryani) {
			biryani md=(biryani)f;
			System.out.println("down to mdosa");
			
		}
	}

}
