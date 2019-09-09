package Devpack;

public class Sample5 {
private int var6;
public void disp()
{
	System.out.println(var6);
}
public Sample5(int var6)
{
	this.var6=var6;
}
	public static void main(String[] args) {
	Sample5 s= new Sample5(100);
	Sample5 s1=s;
	s1.disp();
	}

}
