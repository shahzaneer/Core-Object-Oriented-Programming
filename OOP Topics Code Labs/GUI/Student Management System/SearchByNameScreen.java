import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class SearchByNameScreen extends JFrame {
    private JLabel searchName;
    private JTextField searchNameTextField;
    private JButton searchNameButton;
    private JButton home;
    
    public SearchByNameScreen() {

        this.setSize(600, 600);
        this.setForeground(Color.BLACK);
        this.setVisible(true);
        this.setLayout(new GridLayout(2, 2));

        searchName = new JLabel("Search By Name");
        searchNameTextField = new JTextField();
        searchNameButton = new JButton("Search");
        home = new JButton("Home");

        this.add(searchName);
        this.add(searchNameTextField);
        this.add(searchNameButton);
        this.add(home);
        
        myActionListener a = new myActionListener();
        searchNameButton.addActionListener(a);
        home.addActionListener(a);

    }
    
    // Inner Class
    
    public class myActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource() == searchNameButton) {
                OperationsStorage o = new OperationsStorage();
                String name = searchNameTextField.getText();
                String details =  o.searchStudentByName(name);
                JOptionPane.showMessageDialog(null, details);
            }
            else if(e.getSource() == home) {
                dispose();
            }
        }
    }
}
