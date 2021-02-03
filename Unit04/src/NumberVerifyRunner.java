//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date - 
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class NumberVerifyRunner
{
	public static void main ( String[] args )
	{
		//add in input
		int counter = 0;
		int i = 0;
		while (counter < 5)
		{
			i = (int) (1000 * Math.random()) - 500;
			System.out.println(i + " is odd :: " + NumberVerify.isOdd(i));
			System.out.println(i + " is even :: " + NumberVerify.isEven(i));
			System.out.println();
			counter++;
		}
		
	}
}