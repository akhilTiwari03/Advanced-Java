import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

class MyFrame extends JFrame implements ActionListener {

  Container c;
  JButton btn, btn1, btn2, btn3;

  MyFrame() {
    c = this.getContentPane();
    c.setLayout(null);

    btn = new JButton("Blue");
    btn.setBounds(200, 200, 300, 50);
    btn.setFont(new Font("Arial", Font.BOLD, 25));
    c.add(btn);
    btn.addActionListener(this);

    btn1 = new JButton("Red");
    btn1.setBounds(200, 250, 300, 50);
    btn1.setFont(new Font("Arial", Font.BOLD, 25));
    c.add(btn1);
    btn1.addActionListener(this);

    btn2 = new JButton("Green");
    btn2.setBounds(200, 300, 300, 50);
    btn2.setFont(new Font("Arial", Font.BOLD, 25));
    c.add(btn2);
    btn2.addActionListener(this);

    btn3 = new JButton("Yellow");
    btn3.setBounds(200, 350, 300, 50);
    btn3.setFont(new Font("Arial", Font.BOLD, 25));
    c.add(btn3);
    btn3.addActionListener(this);

  }

  @Override
  public void actionPerformed(ActionEvent e) {
    if(e.getSource() == btn)
      c.setBackground(Color.BLUE);
    else if(e.getSource() == btn1)
        c.setBackground(Color.RED);
    else if(e.getSource() == btn2)
        c.setBackground(Color.GREEN);
    else if(e.getSource() == btn3)
        c.setBackground(Color.YELLOW);

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
