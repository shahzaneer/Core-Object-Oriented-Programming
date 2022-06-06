import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class DeleteScreen extends JFrame {

    // Data Members
    private JLabel lblDelete;
    private JTextField nameTobeDeleted;
    private JButton delete;
    private JButton home;

    // Constructor
    public DeleteScreen() {

        System.out.println("Delete Screen constructor ");

        this.setSize(600, 600);
        this.setForeground(Color.BLACK);
        this.setVisible(true);
        this.setLayout(new GridLayout(2, 2));

        lblDelete = new JLabel("Enter the Name of Student you want to Delete");
        nameTobeDeleted = new JTextField(20);
        delete = new JButton("Delete");
        home = new JButton("Home");

        this.add(lblDelete);
        this.add(nameTobeDeleted);
        this.add(delete);
        this.add(home);

        // adding Action Listener to the buttons 
        myActionListener a = new myActionListener();
        delete.addActionListener(a);
        home.addActionListener(a);

    }
        
    class myActionListener implements ActionListener {
            
        @Override
            
        public void actionPerformed(ActionEvent e) {

            if (e.getSource() == delete) {
                OperationsStorage o = new OperationsStorage();
                String name = nameTobeDeleted.getText();
                o.removeStudent(name);
                JOptionPane.showMessageDialog(null, "Student Deleted !");
            } 
            else if (e.getSource() == home) {
                dispose();
                new HomeScreen();

            }

        }
        
    }
    }
