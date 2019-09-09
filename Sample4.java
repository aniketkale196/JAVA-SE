package Devpack;

public class Sample4 {
	
private int var4,var5;

public Sample4()
{
	
}
public Sample4(int var4,int var5){
	
	this.var4=var4;
	this.var5=var5;
}
public void disp()
{
	System.out.println(var4);
	System.out.println(var5);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample4 s = new Sample4();
		Sample4 s1= new Sample4(10,20);
		s.disp();
		s1.disp();

	}

}
