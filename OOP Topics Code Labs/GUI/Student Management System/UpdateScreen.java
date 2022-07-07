import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class UpdateScreen extends JFrame {

    // Data Members
    private JLabel lblupdate;
    private JTextField nameTobeupdated;
    private JLabel lblnewGpa;
    private JTextField newGpa;
    private JButton update;
    private JButton home;

    // Constructor
    public UpdateScreen() {
        
        this.setSize(600, 600);
        this.setForeground(Color.BLACK);
        this.setVisible(true);
        this.setLayout(new GridLayout(3, 2));

        lblupdate = new JLabel("Enter the Name of Student whose GPA you want to repeat");
        nameTobeupdated = new JTextField(20);
        lblnewGpa = new JLabel("Enter the new GPA");
        newGpa = new JTextField(20);
        update = new JButton("Update");
        home = new JButton("Home");

        this.add(lblupdate);
        this.add(nameTobeupdated);
        this.add(lblnewGpa);
        this.add(newGpa);
        this.add(update);
        this.add(home);

        // adding Action Listener to the buttons 
        myActionListener a = new myActionListener();
        update.addActionListener(a);
        home.addActionListener(a);

    }
        
    class myActionListener implements ActionListener {
            
        @Override
            
        public void actionPerformed(ActionEvent e) {

            if (e.getSource() == update) {
                
                OperationsStorage o = new OperationsStorage();
                String name = nameTobeupdated.getText();
                double newgpa = Double.parseDouble(newGpa.getText());
                boolean found = o.updateGPA(name, newgpa);
                if(found)
                    JOptionPane.showMessageDialog(null, "GPA Updated !");
                else
                    JOptionPane.showMessageDialog(null, "Student not found !");    
            } 
            else if (e.getSource() == home) {
                dispose();
                new HomeScreen();
                }
            }
        }
    }
