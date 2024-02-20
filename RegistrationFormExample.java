import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RegistrationFormExample extends JFrame implements ActionListener {
// Components
private JTextField firstNameField, lastNameField, emailField;
private JPasswordField passwordField;
private JCheckBox agreeCheckBox;
private JRadioButton maleRadioButton, femaleRadioButton, otherRadioButton;
private ButtonGroup genderButtonGroup;
private JComboBox<String> ageComboBox;
private JButton registerButton;

// Constructor
public RegistrationFormExample() {
    setTitle("Registration Form");
    setSize(400, 400);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLocationRelativeTo(null);

    // Initialize components
    JLabel firstNameLabel = new JLabel("First Name:");
    JLabel lastNameLabel = new JLabel("Last Name:");
    JLabel emailLabel = new JLabel("Email:");
    JLabel passwordLabel = new JLabel("Password:");
    JLabel genderLabel = new JLabel("Gender:");
    JLabel ageLabel = new JLabel("Age:");
    JLabel agreeLabel = new JLabel("I agree to terms:");

    firstNameField = new JTextField(20);
    lastNameField = new JTextField(20);
    emailField = new JTextField(20);
    passwordField = new JPasswordField(20);

    agreeCheckBox = new JCheckBox();
    maleRadioButton = new JRadioButton("Male");
    femaleRadioButton = new JRadioButton("Female");
    otherRadioButton = new JRadioButton("Other");
    genderButtonGroup = new ButtonGroup();
    genderButtonGroup.add(maleRadioButton);
    genderButtonGroup.add(femaleRadioButton);
    genderButtonGroup.add(otherRadioButton);

    String[] ages = {"Under 18", "18-25", "26-35", "36-45", "46-55", "56+"};
    ageComboBox = new JComboBox<>(ages);

    registerButton = new JButton("Register");
    registerButton.addActionListener(this);

    // Layout
    JPanel panel = new JPanel();
    panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
    
    addFormField(panel, firstNameLabel, firstNameField);
    addFormField(panel, lastNameLabel, lastNameField);
    addFormField(panel, emailLabel, emailField);
    addFormField(panel, passwordLabel, passwordField);
    
    panel.add(Box.createVerticalStrut(10));
    addFormField(panel, genderLabel, maleRadioButton, femaleRadioButton, otherRadioButton);
    
    panel.add(Box.createVerticalStrut(10));
    addFormField(panel, ageLabel, ageComboBox);
    
    panel.add(Box.createVerticalStrut(10));
    addFormField(panel, agreeLabel, agreeCheckBox);
    
    panel.add(Box.createVerticalStrut(10));
    panel.add(registerButton);

    // Add panel to frame
    add(panel);

    // Set visible
    setVisible(true);
}

// Helper method to add form fields with labels
private void addFormField(JPanel panel, JLabel label, JComponent... components) {
    JPanel fieldPanel = new JPanel();
    fieldPanel.setAlignmentX(Component.LEFT_ALIGNMENT);
    fieldPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
    fieldPanel.add(label);
    for (JComponent component : components) {
        fieldPanel.add(component);
    }
    panel.add(fieldPanel);
}

// Action listener for register button
public void actionPerformed(ActionEvent e) {
    if (e.getSource() == registerButton) {
        String firstName = firstNameField.getText();
        String lastName = lastNameField.getText();
        String email = emailField.getText();
        String password = new String(passwordField.getPassword());
        String gender = "";
        if (maleRadioButton.isSelected()) {
            gender = "Male";
        } else if (femaleRadioButton.isSelected()) {
            gender = "Female";
        } else if (otherRadioButton.isSelected()) {
            gender = "Other";
        }
        String age = (String) ageComboBox.getSelectedItem();
        boolean agree = agreeCheckBox.isSelected();

        // You can add further processing here such as saving to a database or displaying a message
        System.out.println("Registration successful!");
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Email: " + email);
        System.out.println("Gender: " + gender);
        System.out.println("Age: " + age);
        System.out.println("Agree to terms: " + (agree ? "Yes" : "No"));
        // Password should not be printed directly in real application
    }
}

// Main method
public static void main(String[] args) {
    new RegistrationFormExample();
}
}