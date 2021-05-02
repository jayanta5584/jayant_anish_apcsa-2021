//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;

public class Paddle extends Block
{
   //instance variables

	private Color color;
	private int speed;

   public Paddle()
   {
	  super(10, 10);
      speed = 5;
   }
   
   public Paddle(int x, int y)
   {
	   super(x, y, 10, 10, new Color(0, 0, 0));
	   speed = 0;
   }
   
   public Paddle(int x, int y, int s)
   {
	  super(x, y, 10, 10, new Color(0, 0, 0));
	  speed = s;
   }
   
   public Paddle(int x, int y, int w, int h, int s)
   {
	   super(x, y, w, h, new Color(0, 0, 0));
	   speed = s;
   }
   
   public Paddle(int x, int y, int w, int h, Color col, int s)
   {
	   super(x, y, w, h, col);
	   speed = s;
   }
   
//setter
   public void setSpeed(int s)
   {
	   speed = s;
   }

   public void moveUP()
   {
	   setY(getY() + speed);
   }
   
   public void moveDOWN()
   {
	   setY(getY() - speed);
   }



   public void moveUpAndDraw(Graphics window)
   {
	   window.setColor(Color.white);
	   window.fillRect(getX(), getY(), getW(), getH());
	   moveUP();
	   window.setColor(color);
	   window.fillRect(getX(), getY(), getW(), getH());
   }

   public void moveDownAndDraw(Graphics window)
   {
	   window.setColor(Color.white);
	   window.fillRect(getX(), getY(), getW(), getH());
	   moveDOWN();
	   window.setColor(color);
	   window.fillRect(getX(), getY(), getW(), getH());
   }

   //add get methods
   public int getSpeed()
   {
	   return speed;
   }
   
   //add a toString() method
   public String toString()
   {
	   return  "Speed :: " + speed + "\n" + super.toString();
   }
}