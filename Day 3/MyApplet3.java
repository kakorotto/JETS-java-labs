import java.applet.Applet;  
import java.awt.Graphics; 
public class MyApplet3 extends Applet{
  
public void paint(Graphics g){  
String s =getParameter("msg");
//g.drawString("welcome",150,150);  
g.drawString(s,15,15);  
}  
  
}  
