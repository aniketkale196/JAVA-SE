/*create a multi-threaded application by using  "extends Thread " method.
create 2 threads. they should display characters from A to J.
above program  using "implements Runnable" method.*/


package Q1;

class Th2 implements Runnable
{
	public synchronized void run()
	{
		for(char i='A';i<='J';i++)
		{
			System.out.println( i +""+ Thread.currentThread() );
			
			
		}
	}
}
public class Demo2 
{

	public static void main(String[] args) 
	{
		Th2 t1= new Th2();
		//	Th1 t2= new Th1();
			Thread t3=new Thread(t1);
			Thread t2=new Thread(t1);
			t3.start();
			t2.start();
				
		

	}

}
