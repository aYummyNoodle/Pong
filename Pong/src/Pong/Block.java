package Pong;
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
		color = Color.GREEN;

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
	
	public Block(int x, int y, int w, int h)
	{
		xPos = x;
		yPos = y;
		width = w;
		height = h;
	}
	
	public Block(int x, int y)
	{
		xPos = x;
		yPos = y;
	}
	
	
	
	
	
	
	
	
	
	
	
   //add the other set methods
   

   public void setColor(Color col)
   {
	   

   }

   public int getxPos() {
	return xPos;
}

   public void setxPos(int xPos) 
   {
	this.xPos = xPos;
   }

   public int getyPos() {
	return yPos;
   }

   public void setyPos(int yPos) {
	this.yPos = yPos;
   }

   public int getWidth() {
	return width;
   }

   public void setWidth(int width) {
	this.width = width;
   }

   public int getHeight() {
	return height;
   }

   public void setHeight(int height) {
	this.height = height;
   }

   public Color getColor() {
	return color;
   }
   
   public int getX()
   {
	   return xPos;
   }
   
   public int getY()
   {
	   return yPos;
   }
   
   public void setX(int xPos)
   {
	   this.xPos = xPos;
   }
   
   public void setY(int yPos)
   {
	   this.yPos = yPos;
   }
   
   
   public void setPos(int x, int y)
   {
	   xPos = x;
	   yPos = y;
   }
  

   public void draw(Graphics window)
   {
      window.setColor(color);
      window.fillRect(getX(), getY(), getWidth(), getHeight());
   }

   public void draw(Graphics window, Color col)
   {
	   
	   draw(window);
   }
   
	public boolean equals(Object obj)
	{
		Block test = (Block)obj;
		
		if (this.getColor() != null || test.getColor() != null)
		{
			if (this.getxPos() == test.getxPos() && this.getyPos() == test.getyPos() && this.getWidth() == test.getWidth() && this.getHeight() == test.getHeight() && this.getColor().equals(obj))
			{
				return true;
			}
		}
		else
		{
			if (this.getxPos() == test.getxPos() && this.getyPos() == test.getyPos() && this.getWidth() == test.getWidth() && this.getHeight() == test.getHeight())
			{
				return true;
			}
		}


		return false;
	}   

   //add the other get methods
    

   //add a toString() method  - x , y , width, height, color
	public String toString()
	{
		return xPos + "," + yPos + "," + width + "," + height + "," + color;
	}
}