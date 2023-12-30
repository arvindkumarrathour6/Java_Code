package players;

public class GfHome {
	private String gf_name="Bhavna";
	private String shreya;
	
	public void setMessage(String message) 
	{
		shreya=message;
		System.out.println(shreya+" "+gf_name);
	}
	public String getmessage()
	{
		return "Ok! i love you...miss you";
	}
	public static void main(String[] arg) {
		GfHome h=new GfHome();
		h.setMessage("I want to meet you");
		System.out.println(h.getmessage());
		
	}

}
