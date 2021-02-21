//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

import java.util.Scanner;

public class TriangleFiveRunner
{
   public static void main(String args[])
   {
	   Scanner input = new Scanner(System.in);
	   char charVar = 'z';
	   int intVar = 0;
	   String emptyLine = "";
	   while (intVar != -1)
	   {
		   System.out.println("Enter a letter");
		   charVar = input.nextLine().charAt(0);
		   System.out.println("Enter an integer. (Enter -1 to quit)");
		   intVar = input.nextInt();
		   emptyLine = input.nextLine();
		   if (intVar == -1) 
		   {
			   break;
		   }
		   TriangleFive letters = new TriangleFive(charVar, intVar);
		   letters.printTriangleII();
		   
	   }
   }
}