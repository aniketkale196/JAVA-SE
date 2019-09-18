/*create 2 threads. Write a program which displays number 1 to 10
 *  using class lock. 
[hint:- use "implements Runnable" and synchronized block]*/




package Q1;



class Th4 implements Runnable
{
	static Th4 cs= new Th4();
	static public void printt()
	{
	synchronized(cs)
	{
		for (int i=1;i<11;i++)
		{
			System.out.println(i+" "+Thread.currentThread());
		}
	}
	}
	@Override
	public void run() 
	{
      printt();
		
	}
	
	
	
	


}
public class Demo4 
{

	public static void main(String[] args) 
	{
	
	Th4 ob1= new Th4();
	Thread t1=new Thread(ob1);
	Thread t2=new Thread(ob1);
	
	
	
	t1.start();
	t2.start();
	}

}
