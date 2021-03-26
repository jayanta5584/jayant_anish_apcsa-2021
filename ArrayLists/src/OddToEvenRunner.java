import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class OddToEvenRunner
{
	public static void main( String args[] )
	{
		Scanner input = new Scanner(System.in);
		System.out.println("What size ArrayList would you like?");
		int arraySize = input.nextInt();
		List<Integer> arr = new ArrayList<>();
		for (int i = 0; i<arraySize; i++)
		{
			System.out.println("Enter the " + (i+1) + " element");
			int val = input.nextInt();
			arr.add(val);
		}
		System.out.println(ListOddToEven.go(arr));
	}
}