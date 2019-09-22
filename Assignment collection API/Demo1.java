/*create a class "MyClass".
create 5 different objects of it.
add them in a ArrayList.
store ArrayList in file.
Now open a file, read ArrayList and display all objects.
*/

package Practise;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.*;

class Myclass implements Serializable
{
	private String num;
	
	public Myclass(String num)
	{
		super();
		this.num = num;
	}
	public String toString() 
	{
		return num;
	
	}	
	
}


public class Demo1 
{

	public static void main(String[] args) 
	{
		Myclass m1= new Myclass("a");
		Myclass m2 = new Myclass("b");
		Myclass m3 = new Myclass("c");
		Myclass m4 = new Myclass("d");
		Myclass m5 = new Myclass("e");
		
		List <Object> m= new ArrayList<Object>();
		m.add(m1);
		m.add(m2);
		m.add(m3);
		m.add(m4);
		m.add(m5);
		
		
		try(FileOutputStream fos = new FileOutputStream("D://aaa.txt"))
		{
			try(ObjectOutputStream oos= new ObjectOutputStream(fos))
			{
				oos.writeObject(m);
			}
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		} 
		System.out.println(m);
		List<Object> ref =null;
		try(FileInputStream fis=new FileInputStream("D://aaa.txt"))
		{

			try(ObjectInputStream ois=new ObjectInputStream(fis))
			{
			ref=(List<Object>)ois.readObject();
				
				Iterator<Object> i=ref.iterator();
				while(i.hasNext())
				{
					System.out.println(i.next());
				}
			} 
			
		}
		catch (Exception e) 
		{
			// TODO: handle exception
		}
		
	}

}
