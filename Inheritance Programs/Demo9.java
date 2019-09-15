/* create interface "Game" , have an abstract method "play()". from this interface implements classes like "Cricket" , 
 * "FootBall" and "Tennis".
Now Define one more class 
public class Demo with main function.
In this class have a static method "perform" which will take interface reference as parameter.
inside "perform()" see to it that any child object passed ,its "play()" method should be invoked. 
Call "perform()" method from main function.
*/
package Akshay;

interface Game
{
	void play();
}
class Cricket implements Game
{
	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Cricket");
	}

}
class football implements Game
{
	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Football");
	}
}
class Tennis implements Game
{
	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Tennis");
	}

}


public class Demo9 
{
	public static void perform(Game ref)
	{
		ref.play();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		perform(new Cricket());
		perform(new Tennis());
		perform(new football());

	}

}
