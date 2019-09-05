/**
 * 
 */
package assign;

/**
 * @author vita1
 *
 */
public class Switch {

  private char ch ;

  
	/**
 * @param ch
 */
public Switch(char ch) {
	
	this.ch = ch;
}


	/**
	 * 
	 */
	public Switch() {
		
		
	}


	/**
 * @return the ch
 */
public char getCh() {
	return ch;
}


/**
 * @param ch the ch to set
 */
public void setCh(char ch) {
	this.ch = ch;
}

public void Check()

{ 
	switch(ch)
	{
	case 'a': 
		System.out.println("Vowel");
		break;
	case 'e': 
		System.out.println("Vowel");
		break;
	case 'i': 
		System.out.println("Vowel");
		break;
	case 'o': 
		System.out.println("Vowel");
		break;
	case 'u': 
		System.out.println("Vowel");
		break;
	default :
		System.out.println("NOT Vowelllll");
	}
}

	public static void main(String[] args) {
		Switch s1 =new Switch();
		s1.setCh('a');
		s1.Check();
		Switch s3= s1;
		s3.Check();
		Switch s2 =new Switch('q');
		s2.Check();
		
	}

}


