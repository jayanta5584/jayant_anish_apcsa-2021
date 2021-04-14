//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class GridRunner
{
	
	public static String[] rvalGenerator(int num)
	{
		String[] symbols = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9",
				"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n",
				"o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
		
		String[] values = new String[num];
		for (int i = 0; i<num; i++)
		{
			int value = (int) (36*Math.random());
			values[i] = symbols[value];
		}
		return values;
	}
	public static void main( String args[] ) throws IOException
	{
		Scanner userInput = new Scanner(System.in);
		System.out.println("How many rows? ::");
		int rows = userInput.nextInt();
		System.out.println("How many columns? ::");
		int columns = userInput.nextInt();
		String[] userVals = rvalGenerator(rows*columns);
		Grid userGrid = new Grid(rows, columns, userVals);
		System.out.println("\n" + userGrid);
		System.out.println(userGrid.findMax(userVals) + " occurs the most, " + 
				userGrid.countVals(userGrid.findMax(userVals)) + " times");
	}
}