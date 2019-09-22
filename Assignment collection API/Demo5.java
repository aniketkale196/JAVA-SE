/*maintain ICC ranking of at least 5 batsmen in 
 * the "HashMap".
list should be maintain as "rank" "name"
e.g. "1" "Sachin Tendulkar".
Now ask any rank bet'n 1 to 5 from user. 
( user input).
if user asks for a particular rank , 
retrieve batsman name for that rank from 
the HashMap.
*/



package Practise;
import java.util.*;




public class Demo5 
{

	public static void main(String[] args) 
	{
		Map<Integer,String> m1= new HashMap<Integer,String>();
		m1.put(1, "Sachin Tendulkar");
		m1.put(2, "Virat Kohli");
		m1.put(3, "Rohit Sharma");
		m1.put(4, "Ross Taylor");
		m1.put(5, "Kane Williamson");
	    
		System.out.println(m1);
	
		
		
		
		System.out.println("Enter rank");
		
		
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		
		System.out.println(m1.get(k));
	
		
		
		
		
		
		
	
	
	}

}
