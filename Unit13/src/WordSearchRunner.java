//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.*;
import java.io.*; 

public class WordSearchRunner
{
    public static void main(String[] args) throws Exception
    {
    	  WordSearch ms = new WordSearch(8,"APPLEXYPXLHJKEEDEGGLLXXCGFPDGOGNMYNTAHUUPUQDGBTSBTHIGHMSILKXLTHIS");
    	  String[] words = "APPLE AXE APEX CAT HEX EGG HAT COMPUTER GUM THIS TUG THIGH".split(" ");
    	  System.out.println( ms );
    	  for(int i = 0; i<words.length; i++)
    	  {
    	  	  if( ms.isFound(words[i]) )
    	  	  {
    	  	  	  System.out.println( words[i] + " was found in the matrix.");
    	  	  }
    	  	  else
    	  	  {
    	  	     System.out.println( words[i] + " was not found in the matrix.");
    	  	  }
    	  }
    }
}


//