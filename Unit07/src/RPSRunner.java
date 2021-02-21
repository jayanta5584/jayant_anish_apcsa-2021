//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

public class RPSRunner
{
	public static void main(String args[])
	{
		Scanner keyboard = new Scanner(System.in);
		String response = "";
		
		System.out.println("Enter 'q' to exit the program");
		while (!(response.contentEquals("q")))
		{
			System.out.println("Rock-Paper-Scissors - pick your weapon[R,P,S]");
			response = keyboard.nextLine();
			if (response.contentEquals("q")) 
			{ 
				break;
			}
			else
			{
				RockPaperScissors userInput = new RockPaperScissors(response);
				System.out.println(userInput); 
			}
		}	
	}
}



