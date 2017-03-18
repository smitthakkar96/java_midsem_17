import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/*
    <applet code=AddTwoNumbers height=300 width=300></applet>
*/

public class AddTwoNumbers extends Applet implements ActionListener {

    TextField tb1, tb2;
    Label answer;
    Button addButton;
    public void init() {
        tb1 = new TextField("0");
        tb2 = new TextField("0");
        answer = new Label("0");
        addButton = new Button("Add");

        addButton.addActionListener(this);

        add(tb1);
        add(tb2);
        add(addButton);
        add(answer);
        // setLayout(new GridLayout(2, 2));
    }

    public void actionPerformed(ActionEvent e) {
        int a = Integer.parseInt(tb1.getText());
        int b = Integer.parseInt(tb2.getText());
        int sum = a + b;
        answer.setText(String.valueOf(sum));
    }

    public void paint(Graphics g) {
        int number = 10;

        for (int i = 0; i < number; i++) {
            g.setColor(Color.red);
            g.fillOval(20, (30 + (i*50)), 50, 50);
        }
    }

}