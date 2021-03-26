//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.ArrayList;
import java.util.List;

public class ListOddToEven
{
	public static int go( List<Integer> ray )
	{
		boolean oddCheck = false;
		int oddPos = -1;
		int evenPos = -1;
		for (int i = 0; i<ray.size() && (!oddCheck); i++)
		{
			if (ray.get(i) % 2 == 1) {
				oddPos = i;
				oddCheck = true;
			}
			for (int j = oddPos; j<ray.size() && oddCheck; j++)
			{
				if (ray.get(j) % 2 == 0)
				{
					evenPos = j;
				}
			}
		}
		if ((oddPos == -1) || (evenPos == -1))
		{
			return -1;
		}
		else
		{
			return evenPos - oddPos;
		}
		
	}
}