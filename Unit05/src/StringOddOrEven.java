//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date - 
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class StringOddOrEven
{
	private String word;
	public int length;

	public StringOddOrEven()
	{
	}

	public StringOddOrEven(String s)
	{
		length = s.length();
	}

	public void setString(String s)
	{
		word = s;
	}

 	public boolean isEven()
 	{
		if(length % 2 ==0)
		{
			return true;
		}
		else 
		{
			return false;
		}
	}

 	public String toString()
 	{
 		String output;
 		if (isEven())
 		{
 			output = "even";
 		}
 		else 
 		{
 			output = "odd";
 		}
 		return output;
	}
}