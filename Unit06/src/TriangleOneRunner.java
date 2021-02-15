//(c) A+ Computer Science
//www.apluscompsci.com
//Name

import static java.lang.System.*;
import java.util.Scanner;

public class TriangleOneRunner
{
	public static void main ( String[] args )
	{
		Scanner input = new Scanner(System.in);
		int runs = 0;
		while (runs < 10) {
			System.out.println("Enter a word:");
			String inputWord = input.nextLine();
			TriangleOne inputTriangle = new TriangleOne(inputWord);
			inputTriangle.print();
			runs++;
		}
		
	}
}