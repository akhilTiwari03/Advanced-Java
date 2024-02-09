import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

class MyFrame extends JFrame implements ActionListener {

  Container c;
  JButton btn;

  MyFrame() {
    c = this.getContentPane();
    c.setLayout(null);

    btn = new JButton("Click");
    btn.setBounds(200, 200, 100, 50);
    btn.setFont(new Font("Arial", Font.BOLD, 25));
    c.add(btn);
    btn.addActionListener(this);
  }

  @Override
  public void actionPerformed(ActionEvent e) {
      c.setBackground(Color.BLUE);

  }
}

public class Button_Action {

  public static void main(String[] args) {
    // JFrame jF = new JFrame();
    // jF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    // jF.setBounds(100, 100, 500, 500);

    // Container cont = jF.getContentPane();
    // cont.setLayout(null);

    // jF.setVisible(true);

    MyFrame mF = new MyFrame();
    mF.setTitle("Action On Button");
    mF.setBounds(100, 100, 500, 500);
    mF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    mF.setVisible(true);
  }
}
