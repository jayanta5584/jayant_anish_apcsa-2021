//(c) A+ Computer Science
//www.apluscompsci.com

//Name - 
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class DiscountRunner
{
	public static void main( String args[] )
	{
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Respond 'quit' to exit");
		String amt = "";
		double discounted;
		while (!(amt.contentEquals("quit")))
		{
			out.print("Enter the original bill amount :: ");
			amt = keyboard.nextLine();
			if (amt.contentEquals("quit"))
			{
				System.out.println("You have exited.");
				break;
			}
			else
			{
				discounted = Discount.getDiscountedBill(Double.parseDouble(amt));
				System.out.println("Bill after discount :: " + discounted);
			}
			
		}
	}
}