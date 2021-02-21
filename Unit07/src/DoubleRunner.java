//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import static java.lang.System.*;

import java.util.Scanner;

public class DoubleRunner
{
	public static void main(String[] args)
	{
		
		while (1 > 0)
		{
			Scanner input = new Scanner(System.in);
			double a, b, c, d;
			System.out.println("Enter 4 doubles to find biggest (seperated by space)");
			a = input.nextDouble(); b = input.nextDouble(); c = input.nextDouble();
					d = input.nextDouble();
			BiggestDouble run = new BiggestDouble(a,b,c,d);
			System.out.println(run);
			System.out.println("biggest = " + run.getBiggest() + "\n");
		}
		//add more test cases
				
	}
}