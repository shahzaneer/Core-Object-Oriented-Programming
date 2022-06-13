import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class SearchScreen extends JFrame {
    private JLabel nameLabel;
    private JTextField nameTextField;
    private JButton search, home;

    public SearchScreen() {
        setTitle("Search");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(2, 2));
        setVisible(true);

        nameLabel = new JLabel("Name");
        nameTextField = new JTextField();
        search = new JButton("Search");
        home = new JButton("Home");

        add(nameLabel);
        add(nameTextField);
        add(search);
        add(home);

        myActionListener a = new myActionListener();
        search.addActionListener(a);
        home.addActionListener(a);

    }

    public class myActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == search) {
                
                FileOperations o = new FileOperations();
                String name = nameTextField.getText();
                String data = o.searchEmployeeWithSalaryGreaterorEqualToFiftyThousand(name);
                JOptionPane.showMessageDialog(null, data);
            }
            else if (e.getSource() == home) {
                dispose();
                new HomeScreen();
            }
        
        }

    }

}
