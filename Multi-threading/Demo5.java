/*create 2 threads
	one thread will display 1 to 50
	second thread will display 50 to 1
both the threads should start simultaneously.
(use implements method)*/

package Q1;

class Th10 implements Runnable
{
	 public void run()
	{
		for(int i=1;i<=50;i++)
		{
			System.out.println("Exec"+i+" "+Thread.currentThread());
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
class Th11 implements Runnable
{
	 public void run()
	{
		for(int i=50;i>=0;i--)
		{
			System.out.println("Exec"+i+" "+Thread.currentThread());
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}

public class Demo5 
{

	public static void main(String[] args) 
	{
	Th10 ob=new Th10();
	Th11 ob1=new Th11();
	Thread t1= new Thread(ob);
	Thread t2= new Thread(ob1);
	
	t1.start();
	t2.start();
	
	}

}

