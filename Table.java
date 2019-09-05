/**
 * 
 */
package assign;

/**
 * @author vita1
 *
 */
public class Table {
	private int num;
	
	/**
	 * 
	 */
	public Table() 
	{
		
	}

	/**
	 * @param num
	 */
	public Table(int num) 
	{
		this.num = num;
	}
	
	public void print_table()
	{
		int a=this.num;
		for(int i=1;i<=10;i++) 
		{
			this.num=a*i;
			System.out.println(this.num);
		}
	}

	/**
	 * @return the num
	 */
	public int getNum() {
		return num;
	}

	/**
	 * @param num the num to set
	 */
	public void setNum(int num) 
	{
		this.num = num;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Table t1 = new Table();
		t1.setNum(8);
		t1.print_table();
		Table t2 = new Table(7);
		t2.print_table();
		
	}

}
