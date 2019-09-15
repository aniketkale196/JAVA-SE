package Akshay;
abstract class Shape
{
	abstract void Draw();
}
class Triangle extends Shape
{

	@Override
	void Draw() {
		// TODO Auto-generated method stub
		System.out.println("Triangle");
		
	}
	
}
class Circle extends Shape
{

	@Override
	void Draw() {
		// TODO Auto-generated method stub
		System.out.println("Circle");
	}
	
}
class Polygon extends Shape
{

	@Override
	void Draw() {
		// TODO Auto-generated method stub
		System.out.println("Polygon");
		
	}
	
}
public class Demo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s[] = new Shape[3];
		s[0]=new Triangle();
		s[1]=new Circle();
		s[2]=new Polygon();
		for(int i=0;i< s.length;i++)
		{
			s[i].Draw();
			System.out.println("Elements in array"+i+"is"+s[i].getClass().getName());
		}
		

	}

}
