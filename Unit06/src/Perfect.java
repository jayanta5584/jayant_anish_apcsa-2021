//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class Perfect
{
   private int number;

	//add constructors
   public Perfect()
   {
	   setNum(0);
   }

   public Perfect(int a)
   {
	   setNum(a);
   }
	//add a set method
   public void setNum(int num)
   {
	   number = num;
   }

	public boolean isPerfect()
	{
		int divisorCheck = 1;
		int divisorSum = 0;
		while (divisorCheck < number/2 + 1)
		{
			if (number % divisorCheck == 0)
			{
				divisorSum += divisorCheck;
			}
			divisorCheck++;
		}
		
		if (divisorSum == number) 
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
		if (isPerfect())
		{
			return number + " is perfect.";
		}
		else 
		{
			return number + " is not perfect.";
		}
	}
	
}