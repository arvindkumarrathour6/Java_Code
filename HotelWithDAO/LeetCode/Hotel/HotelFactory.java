package Hotel;

public class HotelFactory 
{
	public HotelInterface creatInstace()
	{
		return new Hotel_imp_cls();
	}

}