package Basic1;

public class BankingSystem {
	private String name;
	private long Ac_no;
	private double  total_amt;
	private double withdraw_amt;
	
	public BankingSystem(String name, long ac_no, double total_amt, double withdraw_amt) {
		this.name = name;
		Ac_no = ac_no;
		this.total_amt = total_amt;
		this.withdraw_amt = withdraw_amt;
	}
	public String toString() {
		 return name+" Account number: "+Ac_no+" withdraw_amt: "+withdraw_amt;
		
	}
	 
		

}
