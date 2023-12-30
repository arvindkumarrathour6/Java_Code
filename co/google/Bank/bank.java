package Bank;


public class bank 
{
	int balance=0; 
	void deposit(int m) {
		if (m>10000||m<100) {
			throw new depositeException("Deposite Exception");
		}
		else
		{ 
			balance+=m;
			System.out.println("balance deposit"+m);
		}
		
	}
	void withdraw(int n) {
		if (balance<n)
			throw new withdrawException("Withdraw Exception");
		else {
			balance-=n;
			System.out.println("withdraw amount "+n);
		}
	}

}
