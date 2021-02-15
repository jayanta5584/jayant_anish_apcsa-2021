//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class LetterRemover
{
   private String sentence;
   private char lookFor;

	public LetterRemover()
	{
		setRemover("", 'a');
	}

	public LetterRemover(String s1, char char1)
	{
		setRemover(s1, char1);
		//add in second constructor
	}
	
	
	public void setRemover(String s, char rem)
	{
		sentence = s;
		lookFor = rem;
	}

	public String removeLetters()
	{
		int i = 0;
		String cleaned = "";
		while (i < sentence.length())
		{
			if (sentence.charAt(i) != lookFor)
			{
				cleaned += sentence.charAt(i);
			}
			i++;
		}
		return cleaned;
	}

	public String toString()
	{
		return sentence + " - letter to remove " + lookFor + "\n" + removeLetters();
	}
}