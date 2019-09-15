package Akshay;

class Parent1
{

		void disp()
		{
			System.out.println("parent1");
		}
	
}
interface Parent2 // markerInteracae
{
	
}
class child extends Parent1 implements Parent2 
{
	void disp1()
	{
		System.out.println("parent2");
	}
}
public class Demo7  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		child c= new child();
		c.disp();
		c.disp1();

	}

}
