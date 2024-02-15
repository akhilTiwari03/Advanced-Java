import java.awt.*;
import javax.swing.*;

public class MyTextArea {

  public static void main(String[] args) {
    JFrame jf = new JFrame("this is adv java class");
    jf.setSize(800, 600);
    jf.setLocation(200, 200); // optional
    jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Container c = jf.getContentPane();
    c.setLayout(null);

    JTextArea textarea = new JTextArea("");
    textarea.setSize(200, 200);
    textarea.setLocation(100, 100);
    c.add(textarea);
    c.setBackground(Color.LIGHT_GRAY);
    textarea.setBackground(Color.YELLOW);

    textarea.setFont(new Font("Verdana", Font.BOLD, 30));
    textarea.setLineWrap(true);

    // textarea.setEnabled(false);
    textarea.setText("this is adv java class");
    jf.setVisible(true);
  }
}
