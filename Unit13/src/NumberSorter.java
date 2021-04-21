//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays; 
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberSorter
{
	//instance variables and other methods not shown

	private static int getNumDigits(int number)
	{
		int exp = 0;
		int tempNum = number;
		while(tempNum > 0)
		{
			exp++;
			tempNum /= 10;
		}
		return exp;
	}

	public static int[] getSortedDigitArray(int number)
	{
		int[] digits = new int[getNumDigits(number)];
		int index = 0;
		while (number > 0)
		{
			int dig = number % 10;
			digits[index] = dig;
			number /= 10;
			index++;
		}
		return orderedArray(digits);
	}
	
	public static int[] orderedArray(int[] arr)
	{
		for (int i = 0; i<arr.length; i++)
		{
			for (int j = 0; j<arr.length; j++)
			{
				if(arr[i] < arr[j]) 
				{
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}			
		}
		return arr;
	}
	
	public static void printArr(int[] arr)
	{
		System.out.print("[" + arr[0] + ", ");
		for (int i = 1; i<arr.length-1; i++)
		{
			System.out.print(arr[i] + ", ");
		}
		System.out.println(arr[arr.length-1] + "]");
	}
}