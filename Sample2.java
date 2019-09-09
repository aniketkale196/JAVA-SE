package Devpack;

public class Sample2 {
	int var2;

	public int getVar2() {
		return var2;
	}

	public void setVar2(int var2) {
		this.var2 = var2;
		System.out.println(this.var2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample2 s = new Sample2();
		s.setVar2(10);
		s.getVar2();
		
	}

}
