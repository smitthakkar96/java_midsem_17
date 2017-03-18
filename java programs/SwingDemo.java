import javax.swing.*;
import javax.swing.event.*;

class SwingDemo {
    static JLabel nameLabel;
    static JTextField nameTextField;
    public static void main(String args[]) {
        JFrame frame = new JFrame();
        frame.setLayout(new GridLayout(2,2));
        nameLabel = new JLabel("Your Name is ");
        nameTextField = new JTextField();
        nameTextField.getDocument().addDocumentListener(new DocumentListener() {
            public void changedUpdate(DocumentEvent e)
            {
                // nameLabel.setText(nameTextField.getText());
            }
            public void insertUpdate(DocumentEvent e)
            {
                nameLabel.setText(nameTextField.getText());
            }

            public void removeUpdate(DocumentEvent e)
            {
                nameLabel.setText(nameTextField.getText());
            }
        });
        frame.add(nameLabel);
        frame.add(nameTextField);
        frame.setSize(400, 500);
        frame.setVisible(true);
    }
}