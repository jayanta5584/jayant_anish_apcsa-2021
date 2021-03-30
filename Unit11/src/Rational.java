//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 

class Rational implements Comparable<Rational>
{
	//add two instance variables
	int num;
	int den;
	
	//write two constructors
	public Rational()
	{
		num = 0;
		den = 0;
	}
	
	public Rational(int inNum, int inDen)
	{
		setRational(inNum, inDen);
	}
	
	//getter methods
	public int getNum() { return num; }
	public int getDen() { return den; }
	
	//write a setRational method
	
	//write  a set method for numerator and denominator
	public void setRational(int inNum, int inDen)
	{
		num = inNum;
		den = inDen;
	}
	
	public void add(Rational other)
	{
		//num1/den1 + num2/den2 
		//new numerator = (num1 * den2 + num2 * den1)
		//new denominator = (den1 * den2)
		
		int newNum = (num * other.getDen() + other.getNum() * den);
		int newDen = (den * other.getDen());
		setRational(newNum, newDen);
		reduce();
	}

	private void reduce()
	{
		//reset instance variables
		int divisor = gcd(num, den);
		setRational(num/divisor, den/divisor);
	}

	private int gcd(int numOne, int numTwo)
	{
		int gcd = 1;
		for (int i = 2; i<= numOne; i++) //if numOne is smaller, i range least, if not i range is wasted
		{
			if((numOne % i == 0) && (numTwo % i == 0))
			{
				gcd = i;
			}
		}
		return gcd;
	}

	public Rational clone ()
	{
		Rational cloneObj = new Rational(this.getNum(), this.getDen());
		return cloneObj;
	}	
	
	public boolean equals( Rational obj)
	{
		if ((den == 0) || (obj.getDen() == 0))
		{
			return false;
		}
		return ((double) num/den == (double) obj.getNum()/obj.getDen());
	}

	public int compareTo(Rational other)
	{
		if(this.getDen() == 0 || other.getDen() == 0)
		{
			return -1;
		}
		if ((double) num/den > (double) other.getNum()/other.getDen())
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}

	public String toString()
	{
		return num + "/" + den;
	}

	
	//write  toString() method
	
	
}