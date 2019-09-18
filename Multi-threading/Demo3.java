/*create 3 threads in such a way that while one thread is executing, 
 * 2 threads cannot interfere. they should display output "Exec  0" to "Exec 5".
 * 
 */


package Q1;

class Th3 implements Runnable
{
	synchronized public void run()
	{
		for(int i=0;i<6;i++)
		{
			System.out.println("Exec"+i+" "+Thread.currentThread());
		}
	
	}
}

public class Demo3 
{

	public static void main(String[] args) 
	{
	Th3 ob=new Th3();
	Thread t1= new Thread(ob);
	Thread t2= new Thread(ob);
	Thread t3= new Thread(ob);
	t1.start();
	t2.start();
	t3.start();
	
	

	}

}
