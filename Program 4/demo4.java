package Omkar;
/*4)define a class called as "Item" (Item.java)
with members
String itemid;
String name;
int cost;

parameterized constructor which will accept above details at the time
of creating object.
	member function
void display()
which will display all the details of product
create instances of this class and call the method display.*/
class Item {

	private String itemid;
	private String name;
	private int cost;
	
	public Item(String itemid, String name, int cost) {
		super();
		this.itemid = itemid;
		this.name = name;
		this.cost = cost;
	}
	public void display()
	{
		System.out.println(itemid +"\t"+ name +"\t"+ cost);
	
	}
	
	
}

public class demo4{
	public static void main(String args[]) {
		Item i=new Item("10","Akshay",5000);
		Item i1=new Item("10","Akshay",5000);
		i.display();
		i1.display();
		
	
	}
}