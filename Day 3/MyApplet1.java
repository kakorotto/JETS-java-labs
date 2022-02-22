import java.applet.*;  
import java.awt.*; 
public class MyApplet1 extends Applet{
  
Image img; 
public void init() {  
img = getImage(getDocumentBase(),"duke.png");   
}
   public void paint (Graphics g)
   {     
          g.drawImage (img,0, 0,this.getSize().width,getSize().height, this);
      }
 }
