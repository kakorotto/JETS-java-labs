import java.applet.*;  
import java.awt.*; 
import java.awt.event.*;
public class MyAppletFont extends Applet {//throws Exception{  

    Font[] fonts  = GraphicsEnvironment.getLocalGraphicsEnvironment().getAllFonts();
  public void paint (Graphics g)  {
  int y =15;
    for (int i = 0; i < fonts.length; i++) {
    	//g.setFont(fonts[i]);
    	g.setFont(new Font(fonts[i].getFontName(),Font.BOLD,15));
      g.drawString (fonts[i].getFontName() + " : ",15,y);
      g.drawString (fonts[i].getFamily() + " : ",15,y);
      g.drawString (fonts[i].getName(),15,y);
      y+=15;
}
    }
}
