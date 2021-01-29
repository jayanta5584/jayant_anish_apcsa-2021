//© A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class StarsRunner
{
   public static void main(String args[])
   {
      //instantiate a StarsAndStripes object
	  StarsAndStripes textVar = new StarsAndStripes();
      
      //call the methods needed to make the patterns on the word document
	  textVar.printTwoBlankLines();
	  textVar.printASmallBox();
	  textVar.printTwoBlankLines();
	  textVar.printABigBox();
      
	  Scanner userAnswer = new Scanner(System.in);
	  System.out.println("Would you like to see a masterpiece? (Y/N)");
	  char response = userAnswer.next().charAt(0);
	  if (response == 'Y')
	  {
		  textVar.printUglyFace();
	  } else {  }
	  
   }
}