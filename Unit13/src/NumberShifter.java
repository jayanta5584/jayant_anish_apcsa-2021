//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberShifter
{
	public static int[] makeLucky7Array( int size)
	{
		int[] randArr = new int[size];
		for (int i = 0; i<size; i++)
		{
			randArr[i] = (int) (10 * Math.random()) + 1;
		}
		printArr(randArr);
		return randArr; //unshifted array
	}
	
	public static void shiftEm(int[] array)
	{
		int index7 = 0;
		for (int i = 0; i<array.length; i++)
		{
			if (array[i] == 7)
			{
				array[i] = array[index7];
				array[index7] = 7;
				index7++;
			}
		}
		printArr(array); //shifted array
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