//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class Grid
{
   private String[][] grid;

   //load vals into the rows x cols grid randomly
	public Grid(int rows, int cols, String[] vals)
	{
		selectionShuffle(vals);
		grid = new String[rows][cols];
		for (int i = 0; i<rows; i++) {
			for (int j = 0; j<cols; j++)
			{
				grid[i][j] = vals[i*rows + j];
			}
		}
	}
	
	//mix an array using selectionShuffle from Unit09
	public static void selectionShuffle(String[] values) {
		int k = values.length - 1;
		int r;
		String temp;
		while (k>0)
		{
			r =  (int) ((int) (k+1) * Math.random());
			temp = values[k];
			values[k] = values[r];
			values[r] = temp;
			k--;
		}
	}

	//find out which of the vals occurs the most
	public String findMax(String[] vals)
	{
		int maxCount = 0; String maxString = null;
		for(String element : vals)
		{
			if (countVals(element) > maxCount)
			{
				maxCount = countVals(element);
				maxString = element;
			}
		}
		return maxString;
		
	}

	//returns a count of how many times val occurs in the matrix
	public int countVals(String val)
	{
		int count = 0;
		for(int i = 0; i<grid.length; i++)
		{
			for(int j = 0; j<grid[i].length; j++)
			{
				if(grid[i][j].equals(val))
				{
					count++;
				}
			}
		}
		return count;
	}

	//display the grid
	public String toString()
	{
		String matrix = "";
		for(int i = 0; i<grid.length; i++)
		{
			for(int j = 0; j<grid[i].length; j++)
			{
				matrix += grid[i][j];
				matrix += " ";
			}
			matrix += "\n";
		}
		return matrix;
	}
}