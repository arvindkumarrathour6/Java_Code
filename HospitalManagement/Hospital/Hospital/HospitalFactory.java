package Hospital;

public class HospitalFactory 
{
	public HospitalInterface createinstace() {
		return new Hospital_imp();
	}

}
