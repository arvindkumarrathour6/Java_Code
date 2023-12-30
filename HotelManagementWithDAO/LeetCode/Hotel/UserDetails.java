package Hotel;

public class UserDetails 
{
	private String name;
	private long contact;
	public UserDetails(String name, long contact) {
		
		this.name = name;
		this.contact = contact;
	}
	public String getName()
	{
		return name;
	}
	public long getContact() {
		return contact;
		
	}
}