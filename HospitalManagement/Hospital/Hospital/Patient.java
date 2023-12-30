package Hospital;

import java.util.Scanner;

public class Patient
{
	private int id;
	private String name;
	private long contact;
	private String medical;
	private String dname;
	private double amount;
	
	Scanner sc = new Scanner(System.in);

	public Patient(int id, String name, long contact,String medical,double amount,String dname) {
		this.id = id;
		this.name = name;
		this.contact = contact;
		this.medical=medical;
		this.dname=dname;
	}
	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public long getContact() {
		return contact;
	}
	public String getMedical() {
		return medical;
	}
	public double getAmount() {
		return amount;
	}
	
	
}
