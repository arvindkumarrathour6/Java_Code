package Hotel;

public class HotelFactory 
{
    public HotelInterface createInstace() {
    	return new Hotel_imp();
    }
}
