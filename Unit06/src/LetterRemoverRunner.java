//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;
import java.util.Scanner;

public class LetterRemoverRunner
{
	public static void main( String args[] )
	{
		Scanner input = new Scanner(System.in);
		int testCounter = 0;
		while (testCounter<10)
		{
			System.out.println("Enter a sentence");
			String inputSentence = input.nextLine();
			System.out.println("Enter the character to remove");
			char inputChar = input.nextLine().charAt(0);
			LetterRemover obj = new LetterRemover(inputSentence, inputChar);
			System.out.println(obj);	
			testCounter++;
		}									
	}
}