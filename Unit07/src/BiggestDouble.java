import static java.lang.System.*;

public class BiggestDouble
{
	private double one,two,three,four;

	public BiggestDouble()
	{
		this(0,0,0,0);
	}

	public BiggestDouble(double a, double b, double c, double d)
	{
		setDoubles(a, b, c, d);
	}

	public void setDoubles(double a, double b, double c, double d)
	{
		one = a;
		two = b;
		three = c;
		four = d;
	}

	public double getBiggest()
	{
		double arr[] = {one, two, three, four};
		double biggest = arr[0];
		for (int i = 1; i< 4; i++)
		{
			if( arr[i] >biggest)
			{
				biggest = arr[i];
			}
		}
		
		return biggest;
	}

	public String toString()
	{
	   return "" + getBiggest();
	}
}