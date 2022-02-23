import java.applet.Applet;  
import java.awt.Graphics; 
import java.awt.Color;
public class MyApplet3 extends Applet{
  
public void paint(Graphics g){  
//g.drawString("welcome",20,20);  


g.drawLine(80, 36, 33, 233);
g.drawLine(347, 33, 388, 233);
g.drawRect(80, 400, 270, 30);
g.setColor(Color.YELLOW);
g.fillOval(80, 11, 270, 56);
g.fillOval(66, 130, 50, 90);
g.fillOval(280, 130, 50, 90);
g.fillOval(150, 90, 90, 150);
g.setColor(Color.BLACK);
g.drawOval(80, 11, 270, 56);
g.drawOval(66, 130, 50, 90);
g.drawOval(280, 130, 50, 90);
g.drawOval(150, 90, 90, 150);
g.drawLine(200, 260, 173, 400);
g.drawLine(215, 260, 240, 400);
g.drawArc(30, 210, 360, 50, 0, -180);


}  
  
}  
