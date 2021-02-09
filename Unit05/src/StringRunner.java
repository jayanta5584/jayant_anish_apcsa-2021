//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date - 
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class StringRunner
{
	public static void main ( String[] args )
	{
		String word = "";
		System.out.println("Type 'quit' to exit this program.");
		Scanner userResponse = new Scanner(System.in);
		while (!(word.contentEquals("quit")))
		{
			out.print("Enter a word :: ");
			word = userResponse.nextLine();
			if (word.contentEquals("quit")) {
				System.out.println("Program exited successfully.");
			}
			
			else {
				StringOddOrEven userObj = new StringOddOrEven(word);
				System.out.println(word + " is " + userObj.toString() + "."); 
			}
			
		}
		
	}
}