import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
import java.awt.Color;
import java.util.*;

public class NumberCounter extends Applet {
	private int i;
	private Button increment;
	private Button decrement;

	public void init(){
		i = 0;
		increment = new Button("Increment");
		decrement = new Button("Decrement");

		increment.addActionListener(new MyAddButtonListener());
		decrement.addActionListener(new MyDecButtonListener());
			add(increment);
			add(decrement);
	}
    public void paint(Graphics g) {
		g.drawString("Count: " + i, 50, 50);
    }

	class MyAddButtonListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			i++ ;
			repaint() ;
		}
	}
	class MyDecButtonListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			if(i>0)
			i-- ;
			repaint() ;
		}
	}
}
