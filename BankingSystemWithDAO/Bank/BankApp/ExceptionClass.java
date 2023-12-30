package BankApp;


public class ExceptionClass extends Exception
{
	
}
class MaxdepositeException extends RuntimeException
{
	public String getMessage()
	{
		return "Deposite Amount can't be more than 10000";
	}
}

class MindepositeException extends Exception
{
	public String getMessage()
	{
		return "Deposite Amount can't be Less than 100";
	}
}
class MaxWithdrawException extends Exception
{
	public String getMessage()
	{
		return "Insufficient Fund";
	}
}
class MinWithdrawException extends Exception
{
	public String getMessage() 
	{
		return "Withdraw Amount can't be Less than 100";
	}
	
}
class InvalidAccountException extends Exception
{
	public String getMessage() 
	{
		return "Wrong Account Number";
	}
	
}
class InvalidOldPinException extends Exception
{
	public String getMessage() 
	{
		return "Wrong old Pin ";
	}
	
}
class InvalidPinException extends Exception
{
	public String getMessage() 
	{
		return "Wrong Pin re-try...";
	}
	
}
class AccountNotFoundException extends Exception
{
	public String getMessage() 
	{
		return "Account is not Found...";
	}
	
}


