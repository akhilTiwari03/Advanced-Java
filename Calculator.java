import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

class MyCalculator extends JFrame implements ActionListener {

  Container c;
  JLabel label1, label2;
  JTextField txt1, txt2;
  JButton add, sub, mul, div;

  MyCalculator() {
    setTitle("Calculator");
    setBounds(100, 100, 400, 300);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    c = getContentPane();
    c.setLayout(null);
    Font f = new Font("Arial", Font.BOLD, 11);

    // Label Properties
    label1 = new JLabel("First Number: ");
    label2 = new JLabel("Second Number: ");
    label1.setFont(f);
    label2.setFont(f);

    label1.setBounds(50, 50, 150, 50);
    label2.setBounds(50, 100, 150, 50);

    c.add(label1);
    c.add(label2);

    // TextField Properties
    txt1 = new JTextField(0);
    txt2 = new JTextField(0);

    txt1.setBounds(150, 50, 150, 45);
    txt2.setBounds(150, 100, 150, 45);
    txt1.setFont(f);
    txt2.setFont(f);

    c.add(txt1);
    c.add(txt2);

    // Button Properties
    add = new JButton("+");
    add.setBounds(50, 200, 50, 25);
    add.setFont(f);

    sub = new JButton("-");
    sub.setBounds(125, 200, 50, 25);
    sub.setFont(f);

    mul = new JButton("x");
    mul.setBounds(200, 200, 50, 25);
    mul.setFont(f);

    div = new JButton("%");
    div.setBounds(275, 200, 50, 25);
    div.setFont(f);

    c.add(add);
    c.add(sub);
    c.add(mul);
    c.add(div);
    setVisible(true);
  }
  int res = 0;
  @Override
  public void actionPerformed(ActionEvent e) {
    int x = Integer.parseInt(txt1.getText());
    int y = Integer.parseInt(txt2.getText());
    

    if (e.getSource() == add) {
      res = x + y;
    } else if (e.getSource() == sub) {
      res = Math.abs(x - y);
    } else if (e.getSource() == mul) {
      res = x * y;
    } else if (e.getSource() == div) {
      res = x / y;
    }
  }
}

public class Calculator {

  @SuppressWarnings("unused") 
  public static void main(String[] args) {
    MyCalculator calc = new MyCalculator();
  }
}
