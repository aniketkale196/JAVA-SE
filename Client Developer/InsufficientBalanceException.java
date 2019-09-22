package Develop;


public class InsufficientBalanceException extends Exception
{
public String toString()
{
	return "Minimum balance Rs 1000 should be maintained";
}
}
