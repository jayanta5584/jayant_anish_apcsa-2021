//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class TriangleFive
{
   private char letter;
   private int amount;
   private String alpha = "abcdefghijklmnopqrstuvwxyz";

	public TriangleFive()
	{
		setLetter('z');
		setAmount(0);
	}

	public TriangleFive(char c, int amt)
	{
		setLetter(c);
		setAmount(amt);
	}

	public void setLetter(char c)
	{
		letter = c;
	}

	public void setAmount(int amt)
	{
		amount = amt;
	}
	
	public void printTriangle()
	{
		String arr[] = new String[amount];
		for (int i = 0; i<arr.length; i++)
		{
			arr[i] = "";
		}
		String temp = String.valueOf(letter);
		
		for (int i=0; i<amount; i++)
		{
			for (int j=amount-i; j>0; j--)
			{
				temp = String.valueOf((char) (letter+amount-j));
				arr[i] += temp.repeat(j) + " ";
			}
		}
		
		for (int i = 0; i<amount; i++)
		{
			System.out.println(arr[i]);
		}

	}
	
	public String repeatChar(char x, int n)
	{
		String val = String.valueOf(x);
		return val.repeat(n);
	}
	
	public void printTriangleII()
	{
		for (int i = 0; i < amount; i++) //number of row, ith row starting from 0
		{
			for (int j = 0; j < amount - i; j++) //amount-i terms in each row repeated repeated amount-j times. 
			{
				System.out.print(repeatChar(alpha.charAt(alpha.indexOf(letter+j)), amount-j) + " ");
			}
			System.out.println();
		}
	}
}