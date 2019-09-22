/*2) create a HashMap.
store  porn no. and students name of 10 students inside the HashMap.
display it using iterator.*/
package Practise;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectInputStream.GetField;
import java.io.ObjectOutputStream;
import java.util.*;
import java.util.Map.Entry;
class Stud
{
	private long prnNo;
	public String name;
	
	
	public Stud(long prnNo, String name) 
	{
		super();
		this.prnNo = prnNo;
		this.name = name;
	}
	public long getPrnNo() 
	{
		return prnNo;
	}
	public void setPrnNo(int prnNo) 
	{
		this.prnNo = prnNo;
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}

}
public class Demo2 
{

	public static void main(String[] args) 
	{
		Map <Long,String> m1= new HashMap<Long,String>();
		Stud s1=new Stud(1,"Ak");
		Stud s2 = new Stud(2,"me");
		m1.put(1l, "a");
		m1.put(2l, "b");
		m1.put(3l, "c");
		m1.put(4l, "d");
		m1.put(5l, "e");
		m1.put(6l, "f");
		m1.put(7l, "g");
		m1.put(8l, "h");
		m1.put(9l, "i");
		m1.put(10l, "j");
		System.out.println(m1);
		
		
		// writing hashmap inside file
		
		try(FileOutputStream fos = new FileOutputStream("D://aaa.txt"))
		{
			try(ObjectOutputStream oos= new ObjectOutputStream(fos))
			{
				oos.writeObject(m1);
			}
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		} 
		
		
		//reading hashmap from file
		
		Map <Long,String> m2 =null;
		try(FileInputStream fis=new FileInputStream("D://aaa.txt"))
		{

			try(ObjectInputStream ois=new ObjectInputStream(fis))
			{
				m2=(Map <Long,String>)ois.readObject();
						
			} 
			
		}
		catch (Exception e) 
		{
			// TODO: handle exception
		}
		
		
		//iterating hashmap using set
		Set<Entry<Long,String>> set=m2.entrySet();
		// get an iterator
		Iterator<Entry<Long,String>> i=set.iterator();
		// display elements
		while(i.hasNext())
		{
			Map.Entry<Long,String> me=(Entry<Long,String>)i.next();
			System.out.print(me.getKey()+ ":");
			System.out.println(me.getValue());
		}

		
		
		
		
	

	}

}
