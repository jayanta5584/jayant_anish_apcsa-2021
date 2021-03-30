//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class TriangleWordRunner
{
	public static void main( String args[] )
	{
		char userContinue = 'y';
		while (userContinue == 'y')
		{
			Scanner input = new Scanner(System.in);
			System.out.println("Enter a word :: ");
			String userWord = input.nextLine();
			TriangleWord w = new TriangleWord(userWord); //initializing for fun
			TriangleWord.printTriangle(userWord);
			System.out.println();
			System.out.println("Do you want to enter more sample input? ");
			userContinue = input.nextLine().charAt(0);
			System.out.println();
		}
	}
}