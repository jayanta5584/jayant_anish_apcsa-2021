//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 
import java.util.Scanner;

public class PerfectRunner
{
	public static void main( String args[] )
	{
		Scanner input = new Scanner(System.in);
		int testNumber = 0;
		System.out.println("Enter '-1' to exit");
		while (testNumber != -1)
		{
			System.out.println("Enter a number: ");
			testNumber = input.nextInt();
			if (testNumber == -1 ) 
			{
				break;
			}
			Perfect testCase = new Perfect(testNumber);
			System.out.println(testCase);
		}
																
	}
}