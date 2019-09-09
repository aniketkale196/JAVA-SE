/**
 * 
 */
package Devpack;

/**
 * @author vita1
 *
 */
public class Myclass1 {
	private int num;
	
	/**
	 * 
	 */
	public Myclass1() 
	{
	
	}

	/**
	 * @param num
	 */
	public Myclass1(int num) 
	{
		this.num = num;
	}

	/**
	 * @return the num
	 */
	public int getNum() 
	{
		return num;
	}

	/**
	 * @param num the num to set
	 */
	public void setNum(int num) 
	{
		this.num = num;
		for(int i=1;i<=10;i++)
		{
			this.num=num*i;
			System.out.println(this.num);
		}
		
	}

	/**
	 * @param args
	 */
	
	public static void main(String[] args) 
	{  
		Myclass1 m1 = new Myclass1();
		m1.setNum(8);
		
		
	}

}
