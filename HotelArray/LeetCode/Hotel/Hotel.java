package Hotel;

import java.util.Scanner;

public class Hotel 
{
	private String name;
	private long contact;
	private int menu[][]=new int[5][2];
	String name1[]= {"Idly","Dosa","Rice","Gobi","Puri"};
	public int[][] getMenu() {
		return menu;
	}
	public void setMenu(int[][] menu) {
		this.menu = menu;
	}
	Scanner sc=new Scanner(System.in);
	public Hotel(){
		System.out.println("Enter Your Name:");
		this.name = sc.nextLine();
		System.out.println("Enter Your Contact:");
		this.contact = sc.nextLong();
        this.isOccupied = false;
	}
	public String getName()
	{
		return name;
	}
	public long getContact() {
		return contact;
		
	}
	void setQuantity(int row,int val) {
		menu[row][1]=val;
		}
	int getPrice(int i) {
		return menu[i][0];
		}
	int getQuantity(int row) {
		return menu[row][1];

	}
	private int roomNumber;
    private boolean isOccupied;

    public int getRoomNumber() {
        return roomNumber;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public void setOccupied(boolean occupied) {
        isOccupied = occupied;
    }
}
