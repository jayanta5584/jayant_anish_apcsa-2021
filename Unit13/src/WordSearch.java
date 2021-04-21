//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.*;
import java.io.*; 

public class WordSearch
{
    private String[][] m;
    private int row;
    private int column;
    private String userString = "";

    public WordSearch( int size, String str )
    {
    	userString = str;
    	row = size;
    	column = str.length()/size;
    	m = new String[row][column];
    	for (int i = 0; i<m.length; i++)
    	{
    		for (int j = 0; j<m[i].length; j++)
    		{
    			m[i][j] = str.substring(i*row + j, i*row + j + 1);
    		}
    	}
    	
    }

    public boolean isFound( String word )
    {
    	return (checkRight(word, row, column) || checkLeft(word, row, column) || checkDown(word, row, column)
    			|| checkUp(word, row, column));
    }

	public boolean checkRight(String w, int r, int c)
   {
		int length = w.length();
		for (int i = 0; i < r; i++)
		{
			for (int j = 0; j < c - length+1; j++)
			{
				String word = "";
				for (int k = j; k < j + length; k++)
				{
					word +=  m[i][k];
				}
				if (word.equals(w)){
					return true;
				}
			}
		}
		return false;
		
	}

	public boolean checkLeft(String w, int r, int c)
	{

		int length = w.length();
		for (int i = 0; i < r; i++)
		{
			for (int j = c - 1; j >= length-1; j--)
			{
				String word = "";
				for (int k = j; k > j-length; k--)
				{
					word +=  m[i][k];
				}
				if (word.equals(w)){
					return true;
				}
			}
		}
		return false;
	}

	public boolean checkUp(String w, int r, int c)
	{
		int length = w.length();
		for (int i = r-1; i >= length-1; i--)
		{
			for (int j = 0; j < c; j++)
			{
				String word = "";
				for (int k = i; k > i - length; i--)
				{
					word +=  m[k][j];
				}
				if (word.equals(w)){
					return true;
				}
			}
		}
		return false;
	}
	
	public boolean checkDown(String w, int r, int c)
   {
		int length = w.length();
		for (int i = 0; i < r-length + 1; i++)
		{
			for (int j = 0; j < c; j++)
			{
				String word = "";
				for (int k = i; k < i + length; k++)
				{
					word += m[i][k];
				}
				if (word.equals(w)){
					return true;
				}
			}
		}
		return false;
	}

	public boolean checkDiagUpRight(String w, int r, int c)
	{
		return false;
	}

	public boolean checkDiagUpLeft(String w, int r, int c)
	{
		return false;
	}

	public boolean checkDiagDownLeft(String w, int r, int c)
   {
		return false;
	}

	public boolean checkDiagDownRight(String w, int r, int c)
	{
		return false;
	}
	
	public String print22()
	{
		String result = "";
		for (int i = 0; i < m.length; i++)
		{
			for (int j = 0; j < m[i].length; j++)
			{
				result += m[i][j];
				result += " ";
			}
			result += "\n";
		}
		return result;
	}

    public String toString()
    {
 		return print22();
    }
}
