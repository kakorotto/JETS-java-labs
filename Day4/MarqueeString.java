import java.awt.*;
import java.applet.*;
import java.util.*;
public class MarqueeString extends Applet implements Runnable {
    private String display;
    private int x, y;
    Thread th;
  
    public void init()
    {
        display = "Java World";
        x = 100;
        y = 100;
        th = new Thread(this);
        th.start();
    }
  
    public void update()
    {
        x = x + 30;
        if (x > 300)
           x=-50;

    }
  

    public void run()
    {
  
        while (true) {
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
 
    public void paint(Graphics g)
    {
        g.drawString(display, x, y);
    }
}
