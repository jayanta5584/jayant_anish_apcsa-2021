//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RaySumLast
{
	
	public static int go(int[] ray)
	{
		int bar = ray[ray.length-1];
		int sum = 0;
		if (ray.length == 0)
		{
			return -1;
		} 
		else 
		{
			for (int i : ray)
			{
				if (i > bar)
				{
					sum += i;
				}
			}
			if(sum == 0) 
			{
				return -1;
			}
			else
			{
				return sum;	
			}
		}
		


}
}