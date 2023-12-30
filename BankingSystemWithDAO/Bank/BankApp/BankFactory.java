package BankApp;

public class BankFactory 
{
	public BankInterface createInstace()
	{
		return new Bank_imp_cls();
	}

}
