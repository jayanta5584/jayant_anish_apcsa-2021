//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;

public class Ball extends Block 
//implements Collidable 
{
	private int xSpeed;
	private int ySpeed;

	public Ball() 
	{
		super(200, 200, 10, 10);
		xSpeed = 1;
		ySpeed = 1;
	}

	// add the other Ball constructors
	public Ball(int x, int y) 
	{
		super(x, y, 10, 10);
		xSpeed = 3;
		ySpeed = 1;
	}

	public Ball(int x, int y, int w, int h)
	{
		super(x, y, 10, 10);
		xSpeed = 3;
		ySpeed = 1;
	}
	
	public Ball(int x, int y, int w, int h, Color c)
	{
		super(x, y, 10, 10, c);
		xSpeed = 3;
		ySpeed = 1;
	}

	public Ball(int x, int y, int w, int h, Color c, int xs, int ys)
	{
		super(x, y, 10, 10, c);
		xSpeed = xs;
		ySpeed = ys;
	}
	
	// add the set methods
	public void setPos(int x, int y) 
	{
		setX(x);
		setY(y);
	}

	public void setXSpeed(int x) 
	{
		xSpeed = x;
	}

	public void setYSpeed(int y) 
	{
		ySpeed = y;
	}

	public void setSpeed(int x, int y) 
	{
		setXSpeed(x);
		setYSpeed(y);
	}

	public void moveAndDraw(Graphics window) 
	{
		// draw a white ball at old ball location
		window.setColor(Color.white);
		window.fillRect(getX(), getY(), getW(), getH());

		setX(getX() + xSpeed);
		// setY
		setY(getY() + ySpeed);
		// draw the ball at its new location
		window.setColor(getC());
		window.fillRect(getX(), getY(), getW(), getH());
	}

	public boolean equals(Object obj) 
	{
		return (this.toString().equals(obj.toString()));
	}

	// add the get methods
	public int getXSpeed() 
	{
		return xSpeed;
	}

	public int getYSpeed() 
	{
		return ySpeed;
	}

	/*
	// collidable methods
	public boolean didCollideLeft(Block obj) {
		return (this.getX() == obj.getX() && this.getY() - obj.getY() < obj.getH());
	}

	public boolean didCollideRight(Block obj) {
		return (this.getX() == obj.getX() && this.getY() - obj.getY() < obj.getH());
	}

	public boolean didCollideTop(Block obj) {
		return (this.getY() == 0);
	}

	public boolean didCollideBottom(Block obj) {
		return false;
	}
*/
	// add a toString() method
	public String toString() 
	{
		return super.toString() + "Speed :: <" + xSpeed + ", " + ySpeed + ">\n";
	}
}