/*
 * 
Define a class "base1" with only parameterized constructor.
Derive a class "sub1" from "base1". Sub1 class should have following constructors
	a) Default
	b) one parameter
	c) two parameter
Now try to instantiate "sub1" , using any of the above mentioned constructors.
*/

package Akshay;
class Base1
{
	int num1;

	public Base1(int num1) {
		System.out.println(num1);
		this.num1 = num1;
	
	}
	
}
class Sub22 extends Base1
{

	public Sub22() {
		super(10);
		System.out.println(num1);
		// TODO Auto-generated constructor stub
	}

	public Sub22(int num1) {
		super(20);
		// TODO Auto-generated constructor stub
	}

	public Sub22(int num1,int num2) 
	{
		super(num1);
		// TODO Auto-generated constructor stub
	}
	

}
public class Demo8 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Sub22 s = new Sub22();
		Sub22 s1 = new Sub22(20);
		Sub22 s2=new Sub22(10,30);
	}

}
