import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class HomeScreen extends JFrame {
    private JButton writeButton;
    private JButton readButton;
    private JButton searchButton;
    private JButton updateButton;

    public HomeScreen() {
        setTitle("Home");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 1));
        setVisible(true);

        writeButton = new JButton("Write");
        readButton = new JButton("Read");
        searchButton = new JButton("Search");
        updateButton = new JButton("Update");

        add(writeButton);
        add(readButton);
        add(searchButton);
        add(updateButton);

        myActionListener a = new myActionListener();
        writeButton.addActionListener(a);
        readButton.addActionListener(a);
        searchButton.addActionListener(a);
        updateButton.addActionListener(a);
    }

    public class myActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == writeButton) {
                dispose();
                new AddScreen();
            }
            else if (e.getSource() == readButton) {

                FileOperations o = new FileOperations();
                String data = o.readAll();
                JOptionPane.showMessageDialog(null , data);
                
            }
            else if (e.getSource() == searchButton) {
                dispose();
                new SearchScreen();
    
            }
                
        
            else if (e.getSource() == updateButton) {
                dispose();
                new UpdateScreen();
            }
        }

    }

}
