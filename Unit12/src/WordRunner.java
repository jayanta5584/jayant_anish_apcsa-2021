//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File; 
import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;
import static java.lang.System.*;

public class WordRunner
{
	public static void main( String args[] ) throws IOException
	{
		File text = new File("C:/Users/anish/Documents/GitHub/jayant_anish_apcsa-2021/Unit12/src/words.dat");
		Scanner file = new Scanner(text);
		int size = file.nextInt();
		System.out.println(size);
		Word[] words = new Word[size];
		for(int i = 0; i<size; i++)
		{
			words[i] = new Word(file.nextLine());
		}

		for (int i = 0; i < words.length - 1; i++)
		{ 
			for (int j = i + 1; j < words.length; j++)
			{
				if (words[j].compareTo(words[i]) > 0)
				{
					Word temp = words[i];
					words[i] = words[j];
					words[j] = temp;
				}
			}
		}
		
		











	}
}