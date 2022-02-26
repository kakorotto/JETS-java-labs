import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class DrawLine extends Applet implements MouseMotionListener, MouseListener {

    private Point startPoint, endPoint;

    public void init() {
        this.addMouseMotionListener(this);
        addMouseListener(this);
    }
    public void paint(Graphics g) {
        super.paint(g);
        if (startPoint != null && endPoint != null) {
            g.drawLine(startPoint.x, startPoint.y, endPoint.x, endPoint.y);
        }
    }
    public void mouseDragged(MouseEvent e) {
        endPoint = e.getPoint();
        repaint();
    }
    public void mouseMoved(MouseEvent e) {
    }
    public void mouseClicked(MouseEvent e) {
    }
    public void mousePressed(MouseEvent e) {
        startPoint = e.getPoint();
        endPoint = e.getPoint();
        repaint();
    }
    public void mouseReleased(MouseEvent e) {
    }
    public void mouseEntered(MouseEvent e) {
    }
    public void mouseExited(MouseEvent e) {
    }

}
