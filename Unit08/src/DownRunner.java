import java.util.Scanner;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class DownRunner
{
	public static void main( String args[] )
	{		
		Scanner arrInfo = new Scanner(System.in);
		int testCount = 0;
		
		while (testCount<10) 
		{
			System.out.println("How long is the array?");
			int len = arrInfo.nextInt();
			int[] arr = new int[len];
			if (len >0)
			{
				for (int i = 0; i<len; i++)
				{
					System.out.println("Enter the " + (i+1) + " element: ");
					arr[i] = arrInfo.nextInt();
				}
				System.out.println(RayDown.go(arr));
			}
			else 
			{
				System.out.println("Please enter an array with at least one element.");
			}
			testCount++;
		}
	
	}
	}