package course;
/*3)create a package called "course"
In this package create three classes
a) Dac    with methods  term1()  and term2()
b) PreDac with  method  cet()
c) Basic   with method  finalTest()

Now write application called  "VitaApp" in which call 
all the methods  of the above mentioned classes.*/

public class VitaApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Basic b = new Basic();
		Dac d = new Dac();
		Predac p=new Predac();
		b.finalTest();
		d.term1();
		d.term2();
		p.cet();
		

	}

}
