import static java.lang.System.*;

import javax.print.attribute.standard.MediaSize.Other; 

public class Goblin implements Monster
{
	//add instance variables	
	private String name = "";
	private int size;
	//add a constructor
	
	public Goblin() { }
	
	public Goblin(String word, int num)
	{
		name = word;
		size = num;
	}
	
	//add code to implement the Monster interface
	public int getHowBig()
	{
		return size;
	}
	
	public String getName()
	{
		return name;
	}
	
	public boolean isBigger(Monster other)	
	{
		return (this.getHowBig() > other.getHowBig());
	}
	
	public boolean isSmaller(Monster other)
	{
		return (this.getHowBig() < other.getHowBig());
	}
	
	public boolean namesTheSame(Monster other)
	{
		return (this.getName().equals(other.getName()));
	}
	
	//add a toString
	public String toString()
	{
		return this.getName() + " " + this.getHowBig();
	}
}