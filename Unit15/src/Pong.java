//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import static java.lang.Character.*;
import java.awt.image.BufferedImage;
import java.awt.event.ActionListener;

public class Pong extends Canvas implements KeyListener, Runnable 
{
	private Ball ball;
	private Paddle leftPaddle;
	private Paddle rightPaddle;
	private boolean[] keys;
	private int leftScore;
	private int rightScore;
	private BufferedImage back;

	public Pong()
	{
		// set up all variables related to the game
		// set up all variables related to the game
		ball = new Ball(200, 200, 10, 10, Color.RED, 1, 1);
		leftPaddle = new Paddle(10, 0, 10, 50, 5);
		rightPaddle = new Paddle(770, 0, 10, 50, 5);
		keys = new boolean[4];
		setBackground(Color.WHITE);
		setVisible(true);
		new Thread(this).start();
		addKeyListener(this); // starts the key thread to log key strokes
	}

	public void update(Graphics window) 
	{
		paint(window);
	}

	public void paint(Graphics window)
	{
		// set up the double buffering to make the game animation nice and smooth
		Graphics2D twoDGraph = (Graphics2D) window;
		
		// take a snap shop of the current screen and same it as an image
		// that is the exact same width and height as the current screen
		if (back == null)
			back = (BufferedImage) (createImage(getWidth(), getHeight()));

		// create a graphics reference to the back ground image
		// we will draw all changes on the background image
		Graphics graphToBack = back.createGraphics();
		ball.moveAndDraw(graphToBack);
		leftPaddle.draw(graphToBack);
		rightPaddle.draw(graphToBack);
		graphToBack.drawString("Left Score: " + leftScore, 50, 550);
		graphToBack.drawString("Right Score: " + rightScore, 650, 550);
		
		// see if ball hits left wall or right wall
		if (!(ball.getX() > 0 && ball.getX() < 770)) 
		{
			ball.setXSpeed(0);
			ball.setYSpeed(0);
			graphToBack.setColor(Color.white);
			graphToBack.fillRect(ball.getX(), ball.getY(), ball.getW(), ball.getH());
			ball.setPos((int) (100*Math.random() + 280), (int) (100*Math.random() + 280));
			ball.setXSpeed(1);
			ball.setYSpeed(1);
		}

		// see if the ball hits the top or bottom wall
		if (!(ball.getY() > 10 && ball.getY() < 550)) 
		{
			ball.setYSpeed(-ball.getYSpeed());
		}
		
		
		// see if the ball hits the left paddle
		if (ball.getX() == 10)
		{
			if((ball.getY() > leftPaddle.getY()) && (ball.getY() < (leftPaddle.getY() + leftPaddle.getH())))
			{
				ball.setXSpeed(-ball.getXSpeed());
			}
			else
			{
				graphToBack.clearRect(0, 0, 770, 550);
				rightScore++;
			}
		}
		
		// see if the ball hits the right paddle
		if (ball.getX() == 760) 
		{
			if((ball.getY() > rightPaddle.getY()) && (ball.getY() < (rightPaddle.getY() + rightPaddle.getH())))
			{
				ball.setXSpeed(-ball.getXSpeed());
			}
			else
			{
				graphToBack.clearRect(0, 0, 770, 550);
				leftScore++;
			}
			
		}
		
		// see if the paddles need to be moved
		if (keys[0] == true) 
		{
			leftPaddle.moveUpAndDraw(graphToBack);
		}
		if (keys[1] == true) 
		{
			leftPaddle.moveDownAndDraw(graphToBack);
		}
		if (keys[2] == true) 
		{
			rightPaddle.moveUpAndDraw(graphToBack);
		}
		if (keys[3] == true) 
		{
			rightPaddle.moveDownAndDraw(graphToBack);
		}
		
		twoDGraph.drawImage(back, null, 0, 0);
	}

	public void keyPressed(KeyEvent e) 
	{
		switch (toUpperCase(e.getKeyChar())) 
		{
		case 'Z':
			keys[0] = true;
			break;
		case 'W':
			keys[1] = true;
			break;
		case 'M':
			keys[2] = true;
			break;
		case 'I':
			keys[3] = true;
			break;
		}
	}

	public void keyReleased(KeyEvent e) 
	{
		switch (toUpperCase(e.getKeyChar())) 
		{
		case 'Z':
			keys[0] = false;
			break;
		case 'W':
			keys[1] = false;
			break;
		case 'M':
			keys[2] = false;
			break;
		case 'I':
			keys[3] = false;
			break;
		}
	}

	public void keyTyped(KeyEvent e) 
	{
	}

	public void run() 
	{
		try 
		{
			while (true) 
			{
				Thread.currentThread().sleep(8);
				repaint();
			}
		} catch (Exception e) 
		{
		}
	}
}
