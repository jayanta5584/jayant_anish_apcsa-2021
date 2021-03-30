//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class TriangleWord
{
	//instance variables and constructors could be present, but are not necessary
	String w = "";
	int length;
	
	public TriangleWord() { w = " "; length = 1; }
	public TriangleWord(String word) { w = word; length = word.length(); }
		
	public static void printTriangle(String word)
	{
		int length = word.length();
		for (int i = 0; i < length; i++)
		{
			for (int j = 0; j<i+1; j++)
			{
				System.out.print(word.substring(0, i+1));
			}
			System.out.println();
		}
	}

}