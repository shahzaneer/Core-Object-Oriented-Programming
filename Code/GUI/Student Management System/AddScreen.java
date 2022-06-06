import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class AddScreen extends JFrame {

    // Data Members

    private JLabel nameLabel, phoneNumberLabel, genderLabel, gpaJLabel, semesterLabel, sectionLabel, departmentNameLabel,
            departmentlocationLabel;
    private JTextField nameTextField, phoneNumberTextField,genderTextField, gpaTextField, semesterTextField, sectionTextField,
            departmentNameTextField, departmentLocationTextField;
    private JButton submit, home;
    
    // Constructor
    public AddScreen() {
        this.setSize(600, 600);
        this.setForeground(Color.BLACK);
        this.setVisible(true);
        this.setLayout(new GridLayout(9, 2));

        nameLabel = new JLabel("Name");
        phoneNumberLabel = new JLabel("Phone Number");
        genderLabel = new JLabel("Gender");
        semesterLabel = new JLabel("Semtester");
        gpaJLabel = new JLabel("GPA");
        sectionLabel = new JLabel("Section");
        departmentNameLabel = new JLabel("Department Name");
        departmentlocationLabel = new JLabel("Department Location");

        nameTextField = new JTextField();
        phoneNumberTextField = new JTextField();
        genderTextField = new JTextField();
        gpaTextField = new JTextField();
        semesterTextField = new JTextField();
        sectionTextField = new JTextField();
        departmentNameTextField = new JTextField();
        departmentLocationTextField = new JTextField();


        submit = new JButton("Submit");
        home = new JButton("Home");



        // Addition of these Components
        this.add(nameLabel);
        this.add(nameTextField);
        this.add(phoneNumberLabel);
        this.add(phoneNumberTextField);
        this.add(genderLabel);
        this.add(genderTextField);
        this.add(semesterLabel);
        this.add(semesterTextField);
        this.add(gpaJLabel);
        this.add(gpaTextField);
        this.add(sectionLabel);
        this.add(sectionTextField);
        this.add(departmentNameLabel);
        this.add(departmentNameTextField);
        this.add(departmentlocationLabel);
        this.add(departmentLocationTextField);

        this.add(submit);
        this.add(home);

        myActionListener a = new myActionListener();
        
        submit.addActionListener(a);
        home.addActionListener(a);


    }


    // Inner Class
    
    public class myActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {

            String name = nameTextField.getText();
            String phoneNumber = phoneNumberTextField.getText();
            String gender = genderTextField.getText();
            int semester = Integer.parseInt(semesterTextField.getText());
            double gpa = Double.parseDouble(gpaTextField.getText());
            String section =  sectionTextField.getText();
            String departmentName = departmentNameTextField.getText();
            String departmentLocation = departmentLocationTextField.getText();

            Department d = new Department(departmentName, departmentLocation);
            Student s = new Student(name, phoneNumber, gender, gpa, semester, section, d);

            if (e.getSource() == home && (nameTextField == null || phoneNumberTextField == null || genderTextField == null || semesterTextField == null && gpaTextField == null || sectionTextField == null || departmentNameLabel == null || departmentLocationTextField == null)) {
                dispose();
                new HomeScreen();
            }
            
            if (e.getSource() == submit) {
                OperationsStorage o = new OperationsStorage();
                o.writeToFile(s);
            }
            else if(e.getSource() == home) {
                dispose();
                new HomeScreen();
            }
            
        }
    }
}
