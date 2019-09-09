package Devpack;

public class Sample1 {
private int var1;

public int getVar1(int var1)
{
	 this.var1=var1;
	 return var1;
}
	public static void main(String[] args) {
		Sample1 s= new Sample1();
		System.out.println(s.getVar1(10));
	}

}
