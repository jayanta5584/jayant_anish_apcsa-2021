//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;

public class WordSortTwo
{
	private String[] wordRay;
	
	public WordSortTwo(String sentence)
	{
		wordRay = sentence.split(" ");
	}

	public void sort() //alphabetically
	{
		for(int i = 0; i<wordRay.length-1; i++)
		{
			for (int j = i+1; j<wordRay.length; j++)
			{
				if(wordRay[j].compareTo(wordRay[i])<=0)
				{
					String temp = wordRay[j];
					wordRay[j] = wordRay[i];
					wordRay[i] = temp;
				}
			}
		}
	}

	public String toString()
	{
		sort();
		String output="";
		for (int i = 0; i<wordRay.length; i++)
		{
			output += wordRay[i];
			output += "\n";
		}
		return output+"\n\n";
	}
}