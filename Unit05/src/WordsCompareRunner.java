//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

import java.util.Scanner;

public class WordsCompareRunner
{
   public static void main( String args[] )
   {
		String first = ""; String second = "";
		Scanner response = new Scanner(System.in);
		System.out.println("Respond quit to exit program");
		
		while (!first.contentEquals("quit") && !second.contentEquals("quit")) {
			
			out.println("Enter the first word: ");
			first = response.nextLine();
			
			if (first.contentEquals("quit") || second.contentEquals("quit")) {
				out.println("You have exited the loop.");
				break;
			}
			
			out.println("Enter the second word: ");
			second = response.nextLine();
			
			if (first.contentEquals("quit") || second.contentEquals("quit")) {
				out.println("You have exited the loop.");
				break;
			}
			
			//create and object and interpret
			WordsCompare order = new WordsCompare(first, second);
			out.println(order);
		}

	}
}