
/*create a multi-threaded application by using  "extends Thread " method.create 2 threads.
they should display characters from A to J.*/





package Q1;


class Th1 extends Thread
{
	public synchronized void run()
	{
		for(char i='A';i<='J';i++)
		{
			System.out.println( i +""+ Thread.currentThread() );
			
			
		}
	}

	
}

public class Demo1 
{

	public static void main(String[] args) 
	{
		Th1 t1= new Th1();
		Th1 t2= new Th1();
		t1.start();
		t2.start();
			
	}

}
