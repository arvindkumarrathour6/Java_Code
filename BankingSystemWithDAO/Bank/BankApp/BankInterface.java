package BankApp;

public interface BankInterface
{
	void deposite(Bankc ref);
	void withdraw(Bankc ref);
	void checkbalanace(Bankc ref);
	boolean updatepin(Bankc ref);
	boolean Validate(Bankc ref);
	void choice();
	void NewCustomer();
	void MyAccount(Bankc ref);
	Bankc ExistingCustomer();

}
