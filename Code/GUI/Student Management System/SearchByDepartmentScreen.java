import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class SearchByDepartmentScreen extends JFrame {
    private JLabel searchDepartment;
    private JTextField searchDepartmentTextField;
    private JButton searchDepartmentButton;
    private JButton home;
    
    public SearchByDepartmentScreen() {

        this.setSize(600, 600);
        this.setForeground(Color.BLACK);
        this.setVisible(true);
        this.setLayout(new GridLayout(2, 2));

        searchDepartment = new JLabel("Search By Department");
        searchDepartmentTextField = new JTextField();
        searchDepartmentButton = new JButton("Search");
        home = new JButton("Home");

        this.add(searchDepartment);
        this.add(searchDepartmentTextField);
        this.add(searchDepartmentButton);
        this.add(home);

        myActionListener a = new myActionListener();
        searchDepartmentButton.addActionListener(a);
        home.addActionListener(a);

    }
    
    // Inner Class
    
    public class myActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource() == searchDepartmentButton) {
                
                OperationsStorage o = new OperationsStorage();
                String department = searchDepartmentTextField.getText();
                String details = o.searchStudentsByDepartment(department);
                JOptionPane.showMessageDialog(null, details);
                
            }
            else if(e.getSource() == home) {
                dispose();

            }
            
        }
    }
}
