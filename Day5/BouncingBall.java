import java.applet.Applet;
import java.awt.*;
import java.util.concurrent.TimeUnit;
import java.awt.event.*;

public class BouncingBall extends Applet implements Runnable {

    Thread th;
    Button start, stop;
    volatile boolean thFlag;
    int x, y, radius;
    boolean xFlag, yFlag;
    int displacement;
    public void init() {
        x = 50;
        y = 100;
        radius = 50;
        displacement=20;
	start = new Button("Start");
	stop = new Button("Stop");
	start.addActionListener(new StartButtonListener());
	stop.addActionListener(new StopButtonListener());
	add(start);
	add(stop);

        xFlag = true;
        yFlag = false;
        thFlag = false;
        th = new Thread(this);
        th.start();
    }
    public void paint(Graphics g) {
        g.setColor(Color.RED);
        g.fillOval(x, y, 50, 50);
    }
    
    	class StartButtonListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			thFlag = true;
			repaint() ;
		}
	}
	class StopButtonListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			thFlag = false;
			repaint() ;
		}
		}
    public void run() {
        while(true) {
        if(thFlag){
            if(x+radius> this.getSize().width) {
                xFlag = false;
		x=this.getSize().width-radius;
            } else if(x < 0) {
                xFlag = true;	
            }
            x = xFlag ?  x + displacement : x - displacement;
            if(y > this.getSize().height-radius) {
                yFlag = false;
		y=this.getSize().height-radius;
            } else if(y < 0) {
                yFlag = true;			
            }
            y = yFlag ?  y + displacement: y - displacement;
            repaint();
	
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
	}
	}
}
