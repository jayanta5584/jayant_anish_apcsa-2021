//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.List;
import java.util.ArrayList;

public class ListDown
{
	//go() will return true if all numbers in numArray
	//are in decreasing order [31,12,6,2,1]
	public static boolean go(List<Integer> numArray)
	{
		if (numArray.size()<2)
		{
			return true;
		}
		boolean decreasing = false;
		int counter = 1;
		while ((!decreasing) && (counter<numArray.size()))
		{
			if(numArray.get(counter-1)<=numArray.get(counter))
			{
				decreasing = true;
			}
			counter++;
		}
		return !(decreasing);
	}	
}