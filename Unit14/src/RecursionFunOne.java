//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class RecursionFunOne
{
	public static int countOddDigits(int num)
	{
		int counter = 0;
		
		while (num > 0) 
		{
			int dig = num % 10;
			if (dig % 2 == 1)
			{
				counter++;
			}
			else { }
			num = num/10;
			countOddDigits(num);
		}
		return counter;
	}
}