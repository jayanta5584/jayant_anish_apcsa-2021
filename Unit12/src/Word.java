//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class Word implements Comparable<Word>
{
	private String word;

	public Word( String s )
	{
		word = s;
	}
	
	public int getLength(Word wd)
	{
		return wd.getLength(wd);
	}

	public int compareTo( Word rhs )
	{		
		if(word.length() > getLength(rhs))
		{
			return 1;
		}
		else if (word.length() == getLength(rhs))
		{
			return 0;
		}
		else
		{
			return -1;
		}
	}

	public String toString()
	{
		return "";
	}
}