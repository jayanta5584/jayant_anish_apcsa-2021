//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RayOddToEven
{
	public static int go(int[] ray)
	{
		int locOdd = -1;
		int locEven = -1;
		int i = 0;
		while (i < ray.length && locOdd == -1)
		{
			if (ray[i] % 2 == 1)
			{
				locOdd = i;
			}
			
			if (locOdd != -1)
			{
				break;
			}
			
			i++;
		}
		
		if (locOdd != -1) 
		{
			int j = locOdd;
			while (j < ray.length && locEven == -1)
			{
				if (ray[j] % 2 == 0)
				{
					locEven = j;
				}
				
				if (locEven != -1)
				{
					break;
				}
				j++;
			}
		}
		
		
		if ((locEven == -1) || (locOdd == -1))
		{
			return -1;
		}
		else
		{
			return locEven-locOdd;
		}
		
	}
}