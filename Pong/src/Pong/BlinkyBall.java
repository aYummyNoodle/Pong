package Pong;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

class BlinkyBall extends Ball
{

   //constructors
   public BlinkyBall()
   {
		super();
   }

   public BlinkyBall(int x, int y)
   {

	   super(x, y);

   }

   public BlinkyBall(int x, int y, int wid, int ht)
   {

	   super(x, y, wid, ht);

   }

   public BlinkyBall(int x, int y, int wid, int ht, int xSpd, int ySpd)
   {


   }

   public BlinkyBall(int x, int y, int wid, int ht, Color col, int xSpd, int ySpd)
   {

	   super(x, y, wid, ht, col, xSpd, ySpd);


   }

   public Color randomColor()
   {
   	int r = (int)(Math.random() * 10);		//use Math.random()
 		int g = (int)(Math.random() * 300);
 		int b = (int)(Math.random() * 300);
 		return new Color(r,g,b);
   }

   public void moveAndDraw(Graphics window)
   {
	   super.moveAndDraw(window);
	   super.setColor(randomColor());



   }
}