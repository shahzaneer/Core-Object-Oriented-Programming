import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class UpdateScreen extends JFrame {
    JLabel nameLabel, newJobDesignationLabel, newJobSalaryLabel;
    JTextField nameTextField, newJobDesignationTextField, newJobSalaryTextField;
    JButton update, home;

    public UpdateScreen() {
        setTitle("Update Job");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 2));
        setVisible(true);

        nameLabel = new JLabel("Name");
        newJobDesignationLabel = new JLabel("New Job Designation");
        newJobSalaryLabel = new JLabel("New Job Salary");

        nameTextField = new JTextField();
        newJobDesignationTextField = new JTextField();
        newJobSalaryTextField = new JTextField();

        update = new JButton("Update");
        home = new JButton("Home");

        add(nameLabel);
        add(nameTextField);
        add(newJobDesignationLabel);
        add(newJobDesignationTextField);
        add(newJobSalaryLabel);
        add(newJobSalaryTextField);
        add(update);
        add(home);

        myActionListener a = new myActionListener();
        update.addActionListener(a);
        home.addActionListener(a);


    }

    public class myActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == update) {
                System.out.println("Update Triggered");
                FileOperations o = new FileOperations();
                String name = nameTextField.getText();
                String newJobDesignation = newJobDesignationTextField.getText();
                double newJobSalary = Double.parseDouble(newJobSalaryTextField.getText());



                boolean found = o.updateJob(name, newJobDesignation, newJobSalary);
                if(found) {
                    JOptionPane.showMessageDialog(null, "Job Updated");
                }
                else {
                    JOptionPane.showMessageDialog(null, "No such Person Found");
                }


            }
            else if (e.getSource() == home) {
                dispose();
                new HomeScreen();

            }

        }

    }

}
