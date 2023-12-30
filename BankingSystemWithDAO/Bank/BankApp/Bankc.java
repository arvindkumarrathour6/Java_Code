package BankApp;

import java.util.Scanner;

public class Bankc 
{
	private long accnum;
	private String accname;
	private int pin;
	private int bal=0;
	Scanner sc=new Scanner(System.in);
	public Bankc(long accnum, String accname, int pin)
	{
	    this.accnum = accnum;
		this.accname = accname;
		this.pin = pin;
	}
	public long getaccnum() 
	{
		return accnum;
	}
	public String getaccname() 
	{
		return accname;
	}
	public void setpin(int p)
	{
		pin=p;
	}
	public int getPin()
	{
		return pin;
	}
	public void setBal(int b)
	{
		bal=b;
	}
	public int getBal()
	{
		return bal;
	}
	
	

}
