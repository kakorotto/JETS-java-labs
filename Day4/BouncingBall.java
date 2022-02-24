import java.applet.*;
import java.awt.*;

public class BouncingBall extends Applet implements Runnable {

  int x = 295, y = 295, radius = 50, xChange = 11, yChange =11;

  Thread th;
  boolean stopFlag,xFlag,yFlag;

  public void start() {
    th = new Thread(this);
    stopFlag = false;
    th.start();
    th.setPriority(1);
  }


  public void paint(Graphics g) {
    g.setColor(Color.RED);
    g.fillOval(x - radius, y - radius, 2*radius, 2*radius);
  } 

  public void run() {
    while (true) {
      if (stopFlag)
        break;

     if ((x - radius + xChange <= 0) || (x + radius + xChange >= bounds().width)) xChange = -xChange;
      if ((y - radius + yChange <= 0) || (y + radius + yChange >= bounds().height)) yChange = -yChange;
   if(x + radius + xChange >= bounds().width) { x--; xChange--;repaint();}
   if(y + radius + yChange >= bounds().width) { y--; yChange--;repaint();}
      x += xChange;
      y += yChange;


	//if(xFlag)
	//{x++;if(x>=getWidth()- }
	repaint();

      try {
        Thread.sleep(100);
      } catch (Exception e) {
        e.printStackTrace();
      }
      
    }
  }

//  public void stop() {
//    stopFlag = true;
//    th = null;
//  }
}
