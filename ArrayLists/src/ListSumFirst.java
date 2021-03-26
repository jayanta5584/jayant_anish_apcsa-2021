//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.List;
import java.util.ArrayList;

public class ListSumFirst
{
	
	public static int go(List<Integer> ray)
	{
		int val = ray.get(0);
		int sum = 0;
		if (ray.size() == 0) return -1;
		boolean valLargest = true;
		for (int i = 1; i<ray.size(); i++)
		{
			if (ray.get(i)>val)
			{
				sum += ray.get(i);
				valLargest = false;
			}
				
		}
		if (valLargest) return -1;
		else return sum;
	}
}