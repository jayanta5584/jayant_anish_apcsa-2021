
import java.util.Scanner;

public class SumLastRunner
{
	public static void main( String args[] )
	{
		Scanner input = new Scanner(System.in);
		int testCount = 0;
		
		while (testCount<10) 
		{
			System.out.println("How long is the array?");
			int len = input.nextInt();
			int[] arr = new int[len];
			if (len != 0)
			{
				for (int i = 0; i<len; i++)
				{
					System.out.println("Enter the " + (i+1) + " element: ");
					arr[i] = input.nextInt();
				}
				System.out.println(RaySumLast.go(arr));
			}
			else 
			{
				System.out.println(-1);
			}
			
			testCount++;
		}
	
	}
}