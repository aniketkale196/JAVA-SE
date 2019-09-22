package Client;

import Develop.Account2;

public class Clientside 
{

	public static void main(String[] args) 
	{
	Account2 ac=new Account2(420, "Omkar", 2000);
	try
	{
		ac.withdraw(1500);
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	}

}
