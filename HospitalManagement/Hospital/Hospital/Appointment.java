package Hospital;

public class Appointment 
{
	private int aid;
	private String time;
	private String date;
	private String pname,dname;
	private double amount;
	public Appointment(int aid, String time, String date,double amount, String pname, String dname) {
		this.aid = aid;
		this.time = time;
		this.date = date;
		this.amount=amount;
		this.pname=pname;
		this.dname=dname;
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public double getAmount() {
		return amount;
	}
	public String getDname() {
		return dname;
	}
	public String getPname() {
		return pname;
	}
}
