package Develop;


public class Account2 
{
	public int Accno;
	public String name;
	private int balance;
	
	public int getAccno() 
	{
		return Accno;
	}
	public void setAccno(int accno) 
	{
		Accno = accno;
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public int getBalance() 
	{
		return balance;
	}
	public void setBalance(int balance) 
	{
		this.balance = balance;
	}
	public Account2(int accno, String name, int balance) 
	{
		super();
		Accno = accno;
		this.name = name;
		this.balance = balance;
	}
	
	public void withdraw(int Amt) throws InsufficientBalanceException
	{
		int result=this.balance-Amt;
		if(result<1000)
		{
			throw new InsufficientBalanceException();
		}
		else
		{
			System.out.println("Your balance is ="+result);
			this.balance = result;
		}
	}
	
}
