import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class AddScreen extends JFrame {
    JLabel nameLabel, jobDesignationLabel, jobSalaryLabel, headNameLabel;
    JTextField nameTextField, jobDesignationTextField, jobSalaryTextField, headNameTextField;
    JButton submit, home;

    public AddScreen() {
        setTitle("Add Employee");
        setSize(600, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(5, 2));
        setVisible(true);

        nameLabel = new JLabel("Name");
        jobDesignationLabel = new JLabel("Job Designation");
        jobSalaryLabel = new JLabel("Job Salary");
        headNameLabel = new JLabel("Head Name");

        nameTextField = new JTextField();
        jobDesignationTextField = new JTextField();
        jobSalaryTextField = new JTextField();
        headNameTextField = new JTextField();

        submit = new JButton("Submit");
        home = new JButton("Home");

        add(nameLabel);
        add(nameTextField);
        add(jobDesignationLabel);
        add(jobDesignationTextField);
        add(jobSalaryLabel);
        add(jobSalaryTextField);
        add(headNameLabel);
        add(headNameTextField);
        add(submit);
        add(home);

        myActionListener a = new myActionListener();
        submit.addActionListener(a);
        home.addActionListener(a);


    }

    public class myActionListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submit) {
            
            FileOperations o = new FileOperations();
            String designation = jobDesignationTextField.getText();
            double salary = Double.parseDouble(jobSalaryTextField.getText());

            Job j = new Job(designation, salary);

            String name = nameTextField.getText();
            String headName = headNameTextField.getText();
            Employee emp = new Employee(name, j, headName);
            o.writeToFile(emp);
            JOptionPane.showMessageDialog(null, "Employee added");
        }
        else if (e.getSource() == home) {
            dispose();
            new HomeScreen();
        }
            
    }

}

}
