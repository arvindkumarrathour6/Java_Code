package Hospital;

public class Doctor
{
	private String dname;
	private int Did;
	private String Specialization;
	public Doctor(int did,String dname, String specialization) {
		this.dname = dname;
		this.Did = did;
		this.Specialization = specialization;
	}
	public String getSpecialization() {
		return Specialization;
	}
	public int getDid() {
		return Did;
	}
	public String getDname() {
		return dname;
	}
}
