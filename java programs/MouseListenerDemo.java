import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*
    <applet code="MouseListenerDemo" width=300 height=500></applet>
*/

public class MouseListenerDemo extends Applet implements MouseListener, ActionListener, TextListener, MouseMotionListener {
    Button myBtn;
    Label myLabel;
    TextArea myTextField;
    int x = 0, y = 0;
    public void init() {
        // setLayout(new GridLayout(3,3));
        // setLayout(new BorderLayout());
        setLayout(new FlowLayout(FlowLayout.LEFT));
        myBtn = new Button();
        myLabel = new Label();
        myTextField = new TextArea("Input Something");
        myTextField.addTextListener(this);
        myLabel.setText("Hello");
        addMouseListener(this);
        myBtn.addActionListener(this);
        add(myTextField);
        add(myBtn);
        add(myLabel);
        addMouseMotionListener(this);
    }

    public void textValueChanged(TextEvent e) {
        System.out.println(e.toString());
        myLabel.setText(myTextField.getText());
    }

    public void actionPerformed(ActionEvent e) {
        myBtn.setLabel("Fuck");
    }

    public void mouseClicked(MouseEvent e) {
        setBackground(Color.blue);
    }

    public void mouseEntered(MouseEvent e) {
        setBackground(Color.yellow);
    }

    public void mouseExited(MouseEvent e) {
        setBackground(Color.green);
    }

    public void mousePressed(MouseEvent e) {
        setBackground(Color.pink);
    }

    public void mouseReleased(MouseEvent e) {
        System.out.println("mouse mouseReleased");
        setBackground(Color.red);
    }
    public void mouseMoved(MouseEvent e) {

    }

    public void paint(Graphics g) {
        g.drawOval(x, y, 200, 200);
    }
    public void mouseDragged(MouseEvent e) {
        System.out.println(e.toString());
        x = e.getX();
        y = e.getY();
        repaint();
    }
}