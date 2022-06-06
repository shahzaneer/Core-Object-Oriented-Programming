import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Fram2 extends JFrame{
    // Data Members
    private JLabel j1, j2;
    private JTextField t1, t2;
    private JButton b1, b2;
    private MyActionListener a;

    public Fram2() {

        // Frame
        this.setVisible(true);
        this.setLayout(new GridLayout(3, 2));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        // Data Members Initialization
        j1 = new JLabel("UserName");
        j2 = new JLabel("Password");
        t1 = new JTextField(10);
        t2 = new JTextField(10);
        b1 = new JButton("Submit");
        b2 = new JButton("Exit");

        this.add(j1);
        this.add(t1);
        this.add(j2);
        this.add(t2);
        this.add(b1);
        this.add(b2);

        // ActionListener
        a = new MyActionListener();
        b1.addActionListener(a);
        b2.addActionListener(a);



    }




    public class MyActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == b1) {
                if (t1.getText().equals("admin") && t2.getText().equals("shah")) {
                    JOptionPane.showMessageDialog(null, "Login SuccessFully!");
                }
                else {
                    JOptionPane.showMessageDialog(null, "Login Failed!");

                }
            }
            else {
                JOptionPane.showMessageDialog(null, "Exit Successfully!");
                System.exit(0);
            }
        }
        
    }
}