//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;

public class Block implements Locatable
{
	private int xPos;
	private int yPos;
	private int width;
	private int height;

	private Color color;

	public Block()
	{
		xPos = 0;
		yPos = 0;
		width = 0;
		height = 0;

	}

	//add other Block constructors - x , y , width, height, color
	public Block(int x, int y, int w, int h, Color c)
	{
		xPos = x;
		yPos = y;
		width = w;
		height = h;
		color = c;
	}
	
	public Block(int x, int y)
	{
		setPos(x, y);
	}
	
	public Block(int x, int y, Color col)
	{
		xPos = x;
		yPos = y;
		color = col;
	}
	
	//locatable interface methods: setPos, setX, setY, getX, getY
	public void setPos( int x, int y)
	{
		xPos = x;
		yPos = y;
	}
	
    public void setX( int x )
    {
    	xPos = x;
    }
    
    public void setY( int y )
    {
    	yPos = y;
    }

    public int getX()
    {
    	return xPos;
    }
    
    public int getY()
    {
    	return yPos;
    }
	
   
	//add the other set methods
    
    public void setW(int w)
    {
    	width = w;
    }
    
    public void setH(int h)
    {
    	height = h;
    }
   
   public void setColor(Color col)
   {
	   color = col;
   }

   public void draw(Graphics window)
   {
   	//uncomment after you write the set and get methods
      window.setColor(color);
      window.fillRect(getX(), getY(), getW(), getH());
   }

   public void draw(Graphics window, Color col)
   {
	   window.setColor(col);
	   window.fillRect(getX(), getY(), getW(), getH());
   }
   
	public boolean equals(Object obj)
	{
		if (this.toString().equals(obj.toString()))
		{
			return true;
		}
		return false;
	}   

	//add the other get methods
	public int getW()
	{
		return width;
	}
	    
	public int getH()
	{
	    return height;
    }
	
	public Color getC()
	{
		return color;
	}
	
   //add a toString() method  - x , y , width, height, color
	public String toString()
	{
		String str = "";
		str += "Position :: (" + xPos + ", " + yPos + ")\n";
		str += "Dimensions :: " + width + " x " + height + "\n";
		str += "Color :: " + color + "\n";
		str += "\n\n";
		return str;
	}
}
