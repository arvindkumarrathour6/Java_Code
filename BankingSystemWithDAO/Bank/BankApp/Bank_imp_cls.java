package BankApp;

import java.util.*;

public class Bank_imp_cls implements BankInterface
{
	Scanner sc=new Scanner(System.in);
	
    ArrayList<Bankc> bank = new ArrayList<>();
	

	public void MyAccount(Bankc ref)
	{
		System.out.println("Account number is: "+ref.getaccnum());
		System.out.println("Account Holder name: "+ref.getaccname());
		System.out.println("your Account Current Balance is : "+ref.getBal());

	}
		public void deposite(Bankc ref) 
	   {
		System.out.println("Enter Amount to deposite");
		int bal=sc.nextInt();
			try {
                   if(bal>10000)
					{
						throw new MaxdepositeException();
					}
					else if(bal<100)
					{
						throw new MindepositeException();
					}
					else {
						System.out.println(bal+" Amount deposite Succesfully...");
						bal+=ref.getBal();
						ref.setBal(bal);
						}
			}
			catch(MaxdepositeException e)
		    {
			System.err.println(e.getMessage());
		    }
		    catch(MindepositeException e)
		    {
			System.err.println(e.getMessage());
		    }
		}
	  public void withdraw(Bankc ref) 
	   {
		System.out.println("Enter Amount to Withdraw");
		int bal=sc.nextInt();
		try 
		   {	
			if(bal>ref.getBal())
			{
				throw new MaxWithdrawException();
			}
			else if(bal<100)
			{
				throw new MinWithdrawException();
			}
			else {
				System.out.println(bal+" Amount Withdraw Succesfully...");
				int bal1=ref.getBal();
				bal1-=bal;
				ref.setBal(bal1);
			}
		   }
		   catch(MaxWithdrawException e)
		  {
			System.err.println(e.getMessage());
		  }
		  catch(MinWithdrawException e)
		  {
			System.err.println(e.getMessage());
		  }
	 }
     public void checkbalanace(Bankc ref)
	{
        System.out.println("your Account Current Balance is : "+ref.getBal());
	}

    public boolean updatepin(Bankc ref)
	{
		System.out.println("Enter Account Number:");
		long Accno=sc.nextLong();
		boolean b=false;
		
			try
		    {
			if(Accno==ref.getaccnum())
			{
				b=true;
				System.out.println("Enter old pin:");
				int p=sc.nextInt();
				if(p==ref.getPin())
				{
					System.out.println("Enter New pin:");
					int np=sc.nextInt();
					ref.setpin(np);
					System.out.println("Pin Update Succesfullly");
					return Validate(ref);
				}
				else
				{
					throw new InvalidOldPinException();
				}
			}
			if(!b) 
			{
				throw new InvalidAccountException();
			}
		}
		catch(InvalidOldPinException e) 
		{
			System.err.println(e.getMessage());
		}
		catch(InvalidAccountException e) 
		{
			System.err.println(e.getMessage());
		}
		
		return b;
		
		
	}
  
    public boolean Validate(Bankc ref) 
	{
    	boolean b=false;
		int count=3;
	    
		while(count>0)
		    {
			System.out.println("Enter the Pin:");
			int pin=sc.nextInt();
			
			if(pin==ref.getPin())
			{
				b=true;
				break;
			}
			else
			{
				try
				{
				count--;
				throw new InvalidPinException();
				}
				catch(InvalidPinException e)
				{
					System.err.println(e.getMessage());
		        } 
			}
		}
		
		return b;
	}

	public void choice()
	{
		System.out.println("Welcome To SBI: ");
		System.out.println("================");
		System.out.println("1. Deposit");
		System.out.println("2. Withdaw");
		System.out.println("3. CheckBalance");
		System.out.println("4. MyAccountDetails");
		System.out.println("5. UpdatePin");
		System.out.println("6. Exit");
		System.out.println("================");
	}
	
	public void NewCustomer() 
	{
		System.out.println("Enter Customer details For Registration:-");
    	System.out.println("============================================");
		System.out.println("Enter Account Number:");
		long num=sc.nextLong();
		System.out.println("Enter Holder Name:");
		String name=sc.next();
		System.out.println("Enter the Pin:");
		int pin=sc.nextInt();
        bank.add(new Bankc(num,name,pin));
        System.out.println("Account Created Succesfully...");
		
	}
	public Bankc ExistingCustomer() 
	{
		System.out.println("=====Log In======");
		System.out.println("Enter Account Number:");
		long accnum=sc.nextLong();
		boolean p=false,b=false;
		try {
			for(Bankc bc:bank) {
				if(bc.getaccnum()==accnum) 
				{
					b=true;
					System.out.println("Enter the Pin:");
					int pin=sc.nextInt();
					if(pin==bc.getPin())
					{
						p=true;
						
						return bc;
					}
					
				}
			}
			if(!b)
			{
				throw new InvalidAccountException();
			}
			if(!p){
				throw new InvalidPinException();
			}
		}
		catch(InvalidPinException e) 
		{
			System.err.println(e.getMessage());
		}
		catch(InvalidAccountException e) 
		{
			System.err.println(e.getMessage());
		}
		return null;
	}
	}
