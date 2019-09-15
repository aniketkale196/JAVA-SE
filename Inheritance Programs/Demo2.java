package Akshay;

class Vehicle
{
	public void start()
	{
		System.out.println("Vehical Start");
	}
}

class FourWheeler extends Vehicle
{
	
	public void start()
	{
		System.out.println("Start from FourWheeler");
	}
}
public class Demo2 {

	public static void main(String[] args) 
	{
		Vehicle v= new FourWheeler();
		v.start();
		FourWheeler ref= (FourWheeler)v;
		ref.start();
		Vehicle a= new Vehicle();
		a.start();
	}

}
