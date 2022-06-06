// Wild Card import for all
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class buttons extends JFrame{
    // Data Members
    JButton click, exit;
    
    // Constructor
    public buttons() {

        this.setSize(600, 600);
        this.setForeground(Color.BLACK);
        this.setBackground(new Color(0, 0, 0));
        this.setVisible(true);
        this.setLayout(new GridLayout(1, 2));

        // Create the buttons
        click = new JButton("Click Me");
        click.setSize(90, 20);

        exit = new JButton("Exit");
        exit.setSize(70, 20);

        // Add the buttons to the frame
        this.add(click);
        this.add(exit);


        // adding Action Listener to the buttons 
        myActionListener a = new myActionListener();
        click.addActionListener(a);
        exit.addActionListener(a);
    }


    
    // Inner Class
    
    public class myActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == click) {
                // e.getSource() returns the object that triggered the event
                JOptionPane.showMessageDialog(null, "You clicked the button");
            }
            else if(e.getSource() == exit) {
                System.exit(0);
            }
        }
    }
}



