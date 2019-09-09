package Devpack;

public class Sample6 {
private int var7;

public void disp()
{
	System.out.println(var7);
}
void fun(Sample6 ref)
{
	ref.var7=100;
}

public Sample6(int var7)
{
	this.var7=var7;
}
	public static void main(String[] args) {
	Sample6 s= new Sample6(200);
	
	s.disp();
	s.fun(s);
	s.disp();
	}

}
