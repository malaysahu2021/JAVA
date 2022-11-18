import javax.swing.*;
import java.awt.event.*;

public class framee implements ActionListener
{
    JTextField text = new JTextField();
    JPasswordField passwordField = new JPasswordField();
    JButton submit = new JButton("SUBMIT");
    JFrame frame = new JFrame();

    framee()
    {

        text.setBounds(100,100,100,20);

        submit.setBounds(100,50,100,30);
        submit.setFocusable(false);
        submit.addActionListener(this);

        frame.add(text);
        frame.add(submit);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLayout(null);
        frame.setSize(500,500);
    }

    public static void main(String[] args) 
    {
        framee i = new framee();
    }    

    public void actionPerformed(ActionEvent e)
    {

    }
}