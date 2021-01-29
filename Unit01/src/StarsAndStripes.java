//© A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class StarsAndStripes
{
   public StarsAndStripes()
   {
      out.println("StarsAndStripes");
      printTwoBlankLines();
   }

   public void printTwentyStars()
   {
	   out.println("********************");
   }

   public void printTwentyDashes()
   {
	   out.println("--------------------");
   }

   public void printTwoBlankLines()
   {
	   out.println();
	   out.println();   
   }
   
   public void printASmallBox()
   {
	   printTwentyDashes();
	   printTwentyStars();
	   printTwentyDashes();
	   printTwentyStars();
	   printTwentyDashes();
	   printTwentyStars();
	   printTwentyDashes();
   }
 
   public void printABigBox()
   { 	
	   for(int i = 0; i<2; i++)
	   {
		   printASmallBox();
	   }
   }  
   
   public void printUglyFace()
   {
	   System.out.println("ooo        ooo");
	   System.out.println("ooo        ooo");
	   System.out.println("ooo        ooo");
	   System.out.println();
	   System.out.println("     |  |     ");
	   System.out.println("     |  |     ");
	   System.out.println("     uu uu    ");
	   System.out.println();
	   System.out.println(" xxxxxxxxxxxx ");
	   System.out.println("  xxxxxxxxxx  ");
	   System.out.println("     xxxx     ");
   }
}