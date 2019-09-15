package Akshay;
class base
{
	public base()
	{
		System.out.println("base constructor");
	}
}
class sub1 extends base
{
	
	public sub1()
	{
		System.out.println("Sub1 constructor");
	}
}
class sub2 extends sub1
{
	public sub2()
	{	super();
		System.out.println("Sub2 constructor");
	}
}
public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sub1 s1= new sub1();
		sub2 s2 =new sub2();
		

	}

}
