//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import static java.lang.System.*;

import java.util.Scanner;

public class TriplesRunner
{
   public static void main(String args[])
   {
	   Scanner input = new Scanner(System.in);
	   System.out.println("Enter the maximum value");
	   int max = input.nextInt();
	   Triples obj = new Triples(max);
	   obj.check();
	}
}