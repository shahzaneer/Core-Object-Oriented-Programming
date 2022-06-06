// Wild Card import for all
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class HomeScreen extends JFrame{
    // Data Members
    JButton add , searchByName , searchByDepartment , update , delete , readAll;
    
    // Constructor
    public HomeScreen() {

        this.setSize(600, 600);
        this.setForeground(Color.BLACK);
        this.setVisible(true);
        this.setLayout(new GridLayout(6, 1));

        // Create the buttons
        add = new JButton("Add");
        searchByName = new JButton("Search By Name");
        searchByDepartment = new JButton("Search By Department");
        update = new JButton("Update");
        delete = new JButton("Delete");
        readAll = new JButton("Read All");


        // Add the buttons to the frame
        this.add(add);
        this.add(readAll);
        this.add(searchByName);
        this.add(searchByDepartment);
        this.add(update);
        this.add(delete);


        // adding Action Listener to the buttons 
        myActionListener a = new myActionListener();
        add.addActionListener(a);
        searchByName.addActionListener(a);
        searchByDepartment.addActionListener(a);
        update.addActionListener(a);
        delete.addActionListener(a);
        readAll.addActionListener(a);
    }


    
    // Inner Class
    
    public class myActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == add) {
                dispose();
                new AddScreen();
            
            }
            else if (e.getSource() == update) {
                dispose();
                new UpdateScreen();
            }
            else if (e.getSource() == searchByName) {
                new SearchByNameScreen();
            }

            else if (e.getSource() == searchByDepartment) {
                new SearchByDepartmentScreen();
            }
            else if (e.getSource() == delete) {

                dispose();
                new DeleteScreen();
            }

            else if(e.getSource() == readAll) {
                OperationsStorage o = new OperationsStorage();
                String details = o.readAll();
                JOptionPane.showMessageDialog(null,details);
            }
            
            }
        }
    }




