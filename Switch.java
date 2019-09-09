/**
 * 
 */
package Devpack;

/**
 * @author vita1
 *
 */
public class Switch {
	
	char ch;
	public char getCh() {
		return ch;
	}

	public void setCh(char ch) {
		this.ch = ch;
		
	}
	public void check()
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
			System.out.println("Not Vowel");
			
		}
			
		}
	

	public static void main(String[] args) {
		Switch s = new Switch();
		Switch s1 = new Switch();
		s.setCh('a');
		s.check();
		s1.check();
	}

}
