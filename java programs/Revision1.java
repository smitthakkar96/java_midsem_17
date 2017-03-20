import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*
    <applet code=Revision1 height=400 width=500></applet>
*/

public class Revision1 extends Applet implements MouseListener {
    public void init() {
        addMouseListener(this);
    }

    public void mouseEntered(MouseEvent e) {
        setBackground(Color.orange);
    }
    public void mouseReleased(MouseEvent e) {
        setBackground(Color.pink);
    }
    public void mouseClicked(MouseEvent e) {
        setBackground(Color.yellow);
    }
    public void mousePressed(MouseEvent e) {
        setBackground(Color.blue);
    }
    public void mouseExited(MouseEvent e) {
        setBackground(Color.red);
    }

}