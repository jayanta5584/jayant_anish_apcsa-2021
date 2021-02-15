//(c) A+ Computer Science
//www.apluscompsci.com
//Name

import static java.lang.System.*;

import java.util.Scanner;

public class WordRunner
{
	public static void main ( String[] args )
	{
		Scanner input = new Scanner(System.in);
		int runs = 0;
		while (runs < 10) {
			System.out.println("Enter a word:");
			String inputWord = input.nextLine();
			Word userWord = new Word(inputWord);
			System.out.println(userWord);
			runs++;
		}	
	}
}