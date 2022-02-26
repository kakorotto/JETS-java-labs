import java.util.Date;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class DraggedBall extends Applet
{
	int x,y,diameter,dx,dy;
	public void init(){
		x=100;
		y=150;
		diameter=40;
		dx=10;
		dy=10;
		addMouseListener(new MouseBallAdapter());
		addMouseMotionListener(new MouseMotionBallAdapter());
	}
	
	public void paint(Graphics g){
		g.setColor(Color.RED);
		g.fillOval(x ,y , diameter, diameter);
	}
	
	public class MouseBallAdapter extends MouseAdapter
		{
	  public void mouseClicked(MouseEvent e)
	  {
	  x = e.getX() - (int)(diameter/2);
	  y = e.getY() - (int)(diameter/2);
	  repaint();
	  }
	}
	
	public class MouseMotionBallAdapter extends MouseMotionAdapter
		{
	  public void mouseDragged(MouseEvent e)
	  {
	  x = e.getX() - (int)(diameter/2);
	  y = e.getY() - (int)(diameter/2);
	  repaint();
	  }
	}
	
}
