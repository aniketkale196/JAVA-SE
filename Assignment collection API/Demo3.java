package Practise;
/*  create a hierarchy as follows
	interface Game- play() method
	Derive at least 3 classes from it.
Now Create generic class which can take Game type 
(i.e. any sub type of Game) as parameter.
In this class try to call the play() method of the class which is passed to it.
*/


abstract class Game
{
	abstract void play();
}

class Tennis extends Game
{

	@Override
	public void play() 
	{
		System.out.println("Play TTennis");
		
	}
	
}
class Cricket extends Game
{

	@Override
	public void play() 
	{
	System.out.println("Play Cricket");
		
	}
	
}

class Gotya extends Game
{

	@Override
	public void play() 
	{
	System.out.println("Play Gotya");
		
	}
	
}
/*Now Create generic class which can take Game type 
(i.e. any sub type of Game) as parameter.
In this class try to call the play() method of the class which is passed to it.*/
class SportClub
{
	public void play(Game game)
	{
		Game [] arr = new Gotya[3] ;
		
		arr[0] = new Gotya() ;
		arr[1] = new Gotya() ;		
		arr[2] = new Tennis() ;
		
		game.play();
	}
	
}


public class Demo3 
{
	public static void main(String[] args)
	{
		SportClub club = new SportClub() ;
		
		club.play(new Gotya());
	}
}
