import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*
<applet code="MouseHandling" width=200 height=200>
</applet>
*/

public class MouseHandling extends Applet implements MouseListener, MouseMotionListener {
    String message = "";
    int XCoor = 0, YCoor = 0;

    public void init() {
        addMouseListener(this);
        addMouseMotionListener(this);
    }

    public void mouseClicked(MouseEvent m) {
        XCoor = 0;
        YCoor = 10;
        message = "Mouse Clicked.";
        repaint();
    }

    public void mouseEntered(MouseEvent m) {
        XCoor = 0;
        YCoor = 10;
        message = "Mouse Entered.";
        repaint();
    }

    public void mouseExited(MouseEvent m) {
        XCoor = 0;
        YCoor = 10;
        message = "Mouse Exited.";
        repaint();
    }

    public void mousePressed(MouseEvent m) {
        XCoor = m.getX();

        YCoor = m.getY();
        message = "DOWN";
        repaint();
    }

    public void mouseReleased(MouseEvent m) {
        XCoor = m.getX();
        YCoor = m.getY();
        message = "UP";
        repaint();
    }

    public void mouseDragged(MouseEvent m) {
        XCoor = m.getX();
        YCoor = m.getY();
        message = "*";
        showStatus("Dragging Mouse At " + XCoor + "," + YCoor);
        repaint();
    }

    public void mouseMoved(MouseEvent m) {
        showStatus("Mouse Moved To " + m.getX() + "," + m.getY());
    }

    public void paint(Graphics g) {
        g.drawString(message, XCoor, YCoor);
    }
}