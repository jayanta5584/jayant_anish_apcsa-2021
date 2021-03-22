//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

import javax.print.attribute.standard.MediaSize.Other; 

public class Skeleton implements Monster
{
	//add instance variables	
	private String name = "";
	private int size;
	//add a constructor
	
	public Skeleton() { }
	
	public Skeleton(String word, int num)
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