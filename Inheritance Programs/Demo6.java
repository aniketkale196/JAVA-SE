package Akshay;

interface A
{
	public int num =5;
	void disp1();
}

interface B extends A
{
	void disp2();
}

class C implements B
{
	
	@Override
	public void disp1() {
		// TODO Auto-generated method stub
		System.out.println("disp1");
	}
	@Override
	public void disp2() {
		// TODO Auto-generated method stub
		System.out.println("disp2");
	}
	
	public void disp3()
	{
		System.out.println(num);
	}
}
public class Demo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C c1 = new C();
		c1.disp1();
		c1.disp3();
	}

}
