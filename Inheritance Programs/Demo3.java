package Akshay;
class base11
{	private int num;
	void invoke()
	{
		sub11 aa =new sub11();
	}
	public base11(int num)
	{
		System.out.println("base11 constructor");
		System.out.println(num);
	}
}
class sub11 extends base11
{
	
	public sub11()
	{
		super(10);
		System.out.println("Sub111 constructor");
	}
}
class sub22 extends base11
{
	public sub22()
	{	
		super(20);
		System.out.println("Sub22 constructor");
	}
}

class sub3 extends base11
{
	public sub3()
	{	
		super(10);
		System.out.println("Sub3 constructor");
	}
}

public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sub11 s1= new sub11();
		sub22 s2 =new sub22();
		base11 bb=new base11(30);
		bb.invoke();

	}

}
