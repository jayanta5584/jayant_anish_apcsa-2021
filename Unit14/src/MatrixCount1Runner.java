import java.util.Scanner;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class MatrixCount1Runner
{
	public static void main( String args[] ) throws Exception
	{
		Scanner userInput = new Scanner(System.in);
		int[][] arr = {{ 1, 2, 3, 4, 5},
		{ 6, 7, 8, 9, 0},
		{ 6, 7, 1, 2, 5},
		{ 6, 7, 8, 9, 0},
		{ 5, 4, 3, 2, 1}};
		
		MatrixCount1 test = new MatrixCount1(arr);
		System.out.println("What element would you like to count");
		int val = userInput.nextInt();
		System.out.println(test.count(val));
		
	}
}



