//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import static java.lang.System.*;

public class Triples
{
   private int num;

	public Triples()
	{
		this(0);
	}

	public Triples(int num)
	{
		this.num = num;
	}
	
	public void check()
	{
		for(int x = 1; x <= num-2; x++)
		{
			for(int y = x; y <= num-1; y++)
			{
				for(int z = y; z <= num; z++)
				{
					if((Math.pow(x, 2) + Math.pow(y, 2) == Math.pow(z, 2))
							&& greatestCommonFactor(x,y,z)==1)
					{
						if((x%2 == 1 && y%2 == 0 && z%2 == 1) || (x%2 == 0 && y%2 == 1 && z%2 == 1)) 
						{
							System.out.println(x + " " + y + " " + z);
						}
					}
				}
			}
		}
		
	}

	public void setNum(int num)
	{
		this.num = num;
	}
	
	private int greatestCommonFactor(int a, int b, int c)
	{
		int max = a;
		int factor = 0;
		int[] arr = {a, b, c};
		for (int i = 0; i<3; i++)
		{
			if (arr[i]>max)
			{
				max = arr[i];
			}
		}
		
		for(int i = 1; i<max; i++)
		{
			if((a%i == 0) && (b%i == 0) && (c%i == 0))
			{
				factor = i;
			}
		}
		
		return factor;
	}

	public String toString()
	{
		String output="";






		return output+"\n";
	}
}