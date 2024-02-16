import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class CheckBoxExample extends JFrame implements ActionListener {

  private JLabel titleLabel;
  private JCheckBox burgerCheckBox, pizzaCheckBox, pastaCheckBox;
  private JButton calculateButton;
  private JTextArea billTextArea;

  private double totalBill = 0.0;

  public CheckBoxExample() {
    setTitle("Restaurant Menu");
    setSize(400, 300);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setLayout(new FlowLayout());

    titleLabel = new JLabel("Select Items:");
    burgerCheckBox = new JCheckBox("Burger - 599 Rs");
    pizzaCheckBox = new JCheckBox("Pizza - 899 Rs");
    pastaCheckBox = new JCheckBox("Pasta - 799 Rs");
    calculateButton = new JButton("Calculate Bill");
    billTextArea = new JTextArea(10, 30);
    billTextArea.setEditable(false);

    calculateButton.addActionListener(this);

    add(titleLabel);
    add(burgerCheckBox);
    add(pizzaCheckBox);
    add(pastaCheckBox);
    add(calculateButton);
    add(billTextArea);
  }

  public void actionPerformed(ActionEvent e) {
    totalBill = 0.0;
    StringBuilder billBuilder = new StringBuilder();
    billBuilder.append("Your Order:\n");

    if (burgerCheckBox.isSelected()) {
      totalBill += 599;
      billBuilder.append("Burger - 599 Rs\n");
    }
    if (pizzaCheckBox.isSelected()) {
      totalBill += 899;
      billBuilder.append("Pizza - 899 Rs\n");
    }
    if (pastaCheckBox.isSelected()) {
      totalBill += 799;
      billBuilder.append("Pasta - 799 Rs\n");
    }

    billBuilder.append("Total Bill: Rs. ").append(totalBill);

    billTextArea.setText(billBuilder.toString());
  }

  public static void main(String[] args) {
    SwingUtilities.invokeLater(() -> {
      CheckBoxExample menu = new CheckBoxExample();
      menu.setVisible(true);
    });
  }
}
