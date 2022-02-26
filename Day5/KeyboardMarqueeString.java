import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import java.util.*;
public class KeyboardMarqueeString extends Applet implements Runnable, KeyListener {
    private String display;
    private int x, y;
    Thread th;
  
    public void init()
    {
    	addKeyListener(this);
        display = "Java World";
        x = 100;
        y = 100;
        th = new Thread(this);
        th.start();
    	
    }
    public void drawUpdate()
    {
        x = x + 30;
        if (x > 300)
           x=-50;

    }
    
    public void keyPressed(KeyEvent e) {
    // TODO Auto-generated method stub
     int code = e.getKeyCode();
        if (code == KeyEvent.VK_UP){
           if (y>0)
            y--;
        }

        if (code == KeyEvent.VK_DOWN){
           if(y<getHeight())
            y++;
        }

        if (code == KeyEvent.VK_LEFT){
	if (x>0)            
            x--;
        }

        if (code == KeyEvent.VK_RIGHT){
        if(x<getWidth())
            x++;
        }
repaint();
}
public void keyReleased(KeyEvent e) {
    // TODO Auto-generated method stub

}
public void keyTyped(KeyEvent e) {
    // TODO Auto-generated method stub

}
public void actionPerformed(ActionEvent e) {
    // TODO Auto-generated method stub
}
    public void run()
    {
        while (true) {

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
