package Pong;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;

public class Ball extends Block
{
	private int xSpeed;
	private int ySpeed;

	public Ball()
	{
		super(200, 200);
		xSpeed = 3;
		ySpeed = 1;

	}

	//add the other Ball constructors
	
	public Ball(int x, int y)
	{
		super(x, y);
		xSpeed = 3;
		ySpeed = 1;
		
	}
	
	public Ball(int x, int y, int w, int h)
	{
		super(x, y, w, h);
		xSpeed = 3;
		ySpeed = 1;
	}
	
	public Ball(int x, int y, int w, int h, Color blue)
	{
		super(x, y, w, h, blue);
		xSpeed = 3;
		ySpeed = 1;
		
	}
	
	public Ball(int x, int y, int w, int h, Color blue, int xSpd, int ySpd)
	{
		super(x, y, w, h, blue);
		xSpeed = xSpd;
		ySpeed = ySpd;
	}
	
	
	   
   //add the set methods
   

   public void moveAndDraw(Graphics window)
   {
   	//draw a white ball at old ball location


      setX(getX()+xSpeed);
      setY(getY()+ySpeed);
      
      draw(window, getColor());

		//draw the ball at its new location
   }
   
	public boolean equals(Object obj)
	{
		Ball test = (Ball)obj;
		return super.equals(obj) && this.getXSpeed() == test.getXSpeed() && this.getYSpeed() == test.getYSpeed();

	}   
	
   //add the get methods
	
	public int getXSpeed()
	{
		return xSpeed;
	}
	
	public int getYSpeed()
	{
		return ySpeed;
	}
	
	public void setXSpeed(int xSpd)
	{
		xSpeed = xSpd;
	}
	
	public void setYSpeed(int ySpd)
	{
		ySpeed = ySpd;
	}
	
	public boolean didCollideLeft(Object obj)
	{
		Paddle paddle = (Paddle)obj;
		
		if (getX() <= paddle.getX() + paddle.getWidth() && getX() > paddle.getX() && (getY() >= paddle.getY() && getY() <= paddle.getY() + paddle.getHeight()))
			return true;
		
		return false;
	}
	
	public boolean didCollideRight(Object obj)
	{
		Paddle paddle = (Paddle)obj;
		
		if (getX() + getWidth() >= paddle.getX() && getX() < paddle.getX() && (getY() >= paddle.getY() && getY() <= paddle.getY() + paddle.getHeight()))
			return true;
		
		return false;
	}
	
	public boolean didCollideTop(Object obj)
	{
		Paddle paddle = (Paddle)obj;
		
		if (getY() + getHeight() >= paddle.getY() && getY() < paddle.getY() + paddle.getHeight() && (getX() >= paddle.getX() && getX() + getWidth() <= paddle.getX() + paddle.getWidth()))
			return true;
		
		return false;
	}
	
	public boolean didCollideBottom(Object obj)
	{
		Paddle paddle = (Paddle)obj;
		
		if (getY() + getHeight() > paddle.getY() && getY() <= paddle.getY() + paddle.getHeight() && (getX() >= paddle.getX() && getX() + getWidth() <= paddle.getX() + paddle.getWidth()))
			return true;
		
		return false;
	}

   //add a toString() method
	
	public String toString()
	{
		return "The ball's xSpeed is " + xSpeed + " and its ySpeed is " + ySpeed;
	}
}