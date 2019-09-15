package Akshay;

class Top1
{
	void disp1()
	{
		System.out.println("Top1");
	}
}

class Bottom1 extends Top1
{
	void disp1()
	{
		System.out.println("Bottom1");
	}
}

class Bottom2 extends Top1
{
	void disp1()
	{
		System.out.println("Bottom2");
	}
}

class Bottom3 extends Top1
{
	void disp1()
	{
		System.out.println("Bottom3");
	}
}

public class Demo4 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Top1 t = new Bottom3();
		t.disp1();
		
		
		
		
		
	}

}
