/* 1)Create abstract base class "Game" with 'play()' as abstract method.
From that derive following classes.
Football,Cricket,Tennis
Create a class called as "GamesDemo" (public class)
inside a main method create an array of "Game" (3 elements)
Store objects of Football,Cricket and Tennis respectively.
Now traverse the array and call that Cricket's play() method. */

package Omkar;

abstract class Game
{
	abstract public void play();
}
class Cricket extends Game
{
	@Override
	public void play() 
	{
		// TODO Auto-generated method stub
		System.out.println("Cricket");
	}
	public String toString() 
	{ 
		 return(getClass().getName());
    } 

}
class football extends Game
{
	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Football");
	}
	 public String toString() 
	 { 
		 return(getClass().getName());
     } 

}
class Tennis extends Game
{
	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Tennis");
	}
	 public String toString() { 
		 return(getClass().getName());
        } 

}


public class Demo1 
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Game g[]=new Game[3];
		g[0]=new Cricket();
		g[1]=new Tennis();
		g[2]=new football();
	
		for (int i = 0; i < g.length; i++)
		{
			if (g[i] instanceof Cricket)
			{
				g[i].play();				
			}
			System.out.println(g[i].toString());
		}
	
	}

}
