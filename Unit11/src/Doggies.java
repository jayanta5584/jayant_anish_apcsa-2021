//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;

public class Doggies
{
	private Dog[] pups;

	public Doggies(int size)
	{
		//point pups at a new arry of Dog
		pups = new Dog[size];
	}
	
	public void set(int spot, int age, String name)
	{
		//put a new Dog in the array at spot 
		//make sure spot is in bounds	
		if (spot > pups.length)
		{
			System.out.println("Position is beyond the bounds of the array");
		}
		else
		{
			pups[spot] = new Dog(age, name);
		}
	}

	public String getNameOfOldest()
	{
		int bigPos = 0;
		for (int i = 1; i<pups.length; i++)
		{
			if (pups[i].getAge()>pups[bigPos].getAge())
			{
				bigPos = i;
			}
		}
		return pups[bigPos].getName();
	}

	public String getNameOfYoungest()
	{
		int smallPos = 0;
		for (int i = 1; i<pups.length; i++)
		{
			if (pups[i].getAge()<pups[smallPos].getAge())
			{
				smallPos = i;
			}
		}
		return pups[smallPos].getName();
	}

	public String toString()
	{
		return ""+Arrays.toString(pups);
	}
}