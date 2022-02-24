import java.awt.*;
import java.applet.*;
import java.util.*;
public class AllInOne extends Applet implements Runnable {
    private String display;
    private int xDisplay, yDisplay;
    private Date d;
    Thread th1,th2,th3;
    
    
  int x = 295, y = 295, radius = 50, xChange = 11, yChange =11;
  boolean stopFlag,xFlag,yFlag;

    public void init()
    {
        display = "Java World";
        xDisplay = 100;
        yDisplay = 100;
        d = new Date();
        th1 = new Thread(this);
        th1.start();
        th2 = new Thread(this);
        th2.start();
        th3 = new Thread(this);
        th3.start();
    }
    public void update()
    {
        xDisplay = xDisplay + 50;
        if (xDisplay > 600)
           xDisplay=-50;
    }
    public void run()
    {
  	if(Thread.currentThread()==th1){while (true) {
            repaint();
            update();
            try {
                Thread.sleep(1000);
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
       if(Thread.currentThread()==th2){
       while(true){
	d = new Date();
	repaint();
	try{Thread.sleep(999);}
	catch(Exception e) {e.printStackTrace();}
	}
	}
	if(Thread.currentThread()==th3){
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
    }
 
    public void paint(Graphics g)
    {
        g.drawString(display, xDisplay, yDisplay);
        g.drawString(d.toString(), 200, 50);
            g.setColor(Color.RED);
    g.fillOval(x - radius, y - radius, 2*radius, 2*radius);
    }
}



