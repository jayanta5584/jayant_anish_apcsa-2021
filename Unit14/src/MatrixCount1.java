//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.*;
import java.io.*; 

public class MatrixCount1
{
    private static int[][] m;
    
    public MatrixCount1()
    {
    	m = null;
    }
    
    public MatrixCount1(int[][] arr)
    {
    	m = arr;
    }

    public static int count( int val  )
    {
		int count = 0;
		for (int i = 0; i<m.length; i++)
		{
			for (int j = 0; j<m[i].length; j++)
			{
				if (m[i][j] == val)
					count++;
			}
		}
		return count;
    }
}
