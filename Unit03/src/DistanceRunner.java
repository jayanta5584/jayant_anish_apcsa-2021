//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class DistanceRunner
{
	public static void main( String[] args )
	{
		Scanner response = new Scanner(System.in);	
		
		System.out.println("Enter the first x-coordinate:: ");
		int x1 = response.nextInt();
		
		System.out.println("Enter the first y-coordinate:: ");
		int y1 = response.nextInt();
		
		System.out.println("Enter the second x-coordinate:: ");
		int x2 = response.nextInt();
		
		System.out.println("Enter the second y-coordinate:: ");
		int y2 = response.nextInt();
		
		Distance myObj = new Distance(x1, y1, x2, y2);
		myObj.calcDistance();
		myObj.print();
	}
}