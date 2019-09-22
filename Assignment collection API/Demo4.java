/*Define a class "Employee" with following members
empid, empname, desig, basic.
Define a parameterised constructor which will take all these
 values while creating an instance.
Also define "disp()" method which will display all these details.
create 4 employees and save them in "ArrayList".
Now save this "ArrayList" in a file.
Open file , read "ArrayList" , traverse ArrayList and call "disp()" 
for all the objects.
*/

package Practise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.*;
import java.util.ArrayList;

class Employee implements Serializable

{
	private int empid;
	public String empname;
	public String desig;
	public int basic;
	
	
	
	public Employee(int empid, String empname, String desig, int basic) 
	{
		super();
		this.empid = empid;
		this.empname = empname;
		this.desig = desig;
		this.basic = basic;
	}
	public int getEmpid() 
	{
		return empid;
	}
	public void setEmpid(int empid) 
	{
		this.empid = empid;
	}
	public String getEmpname() 
	{
		return empname;
	}
	public void setEmpname(String empname) 
	{
		this.empname = empname;
	}
	public String getDesig() 
	{
		return desig;
	}
	public void setDesig(String desig) 
	{
		this.desig = desig;
	}
	public int getBasic() 
	{
		return basic;
	}
	public void setBasic(int basic) 
	{
		this.basic = basic;
	}
	
	public String toString()
	{
		return "empid=" + "" + getEmpid()+ "\t" + "empname="+""+ getEmpname() + "\t" +"designation="+""+ getDesig() + "\t" + "Basic Salary="+""+ getBasic() +"\t" ;
	}
	
	public void disp()
	{
		System.out.println("empid=" + "" + getEmpid()+ "\t" + "empname="+""+ getEmpname() + "\t" +"designation="+""+ getDesig() + "\t" + "Basic Salary="+""+ getBasic() +"\t" );
		
	}
}



public class Demo4 
{

	public static void main(String[] args) 
	{
		Employee e1 = new Employee(1,"Aniket","Analyst",30000);
		Employee e2 = new Employee(2,"Omkar","Developer",50000);
		Employee e3 = new Employee(3,"Akshay","Senior Developer",70000);
		Employee e4 = new Employee(4,"Bablu","Manager",45000);
		
		List<Employee> list= new ArrayList<Employee>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		
		System.out.println(list);
		
	    try(FileOutputStream fos= new FileOutputStream("D://Aniket.txt"))
	    {
	    	try(ObjectOutputStream oos= new ObjectOutputStream(fos))
	    	{
	    		oos.writeObject(list);
	    	} 
		
	    }  
	    catch (Exception e) 
	    {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	    List<Employee> m2 = null;
	    
	    try(FileInputStream fis = new FileInputStream("D://Aniket.txt"))
	    {
	    	try(ObjectInputStream ois = new ObjectInputStream(fis))
	    	{
	    		m2=(List<Employee>)ois.readObject();
	    		System.out.println(m2);
	    	}
	    }
	    catch (Exception e) 
	    {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    System.out.println("Enter empid");
	    Scanner sc = new Scanner(System.in);
	    int k= sc.nextInt();
	    
//		Iterator<Employee> i= m2.iterator();
//		while(i.hasNext())
//		{
//			System.out.println(i.next());
//		}
		m2.get(k).disp();

	}

}
