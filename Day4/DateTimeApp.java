import java.util.*;
import java.applet.*;  
import java.awt.*; 
import java.awt.event.*;

public class DateTimeApp extends Applet implements Runnable{
Thread th; Date d;
public void init(){

th = new Thread(this);
th.start();
d = new Date();
}
public void paint(Graphics g){

g.drawString(d.toString(), 50, 100);

}
public void run(){
while(true){
d = new Date();
repaint();
try{Thread.sleep(999);}
catch(Exception e) {e.printStackTrace();}
}
}
}
