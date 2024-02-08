import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class MyTextField {
    public static void main(String[] args) {
        JFrame jF = new JFrame("Demo of JFrame");
        jF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jF.setBounds(500, 300, 800, 600);
        
        Container contr = jF.getContentPane();
        contr.setLayout(null);

        JTextField jtxt = new JTextField();
        jtxt.setBounds(200, 200, 300, 50);
        jtxt.setText("Enter username..");
        Font f = new Font("Arial", Font.ITALIC, 30);
        jtxt.setFont(f);

        jtxt.setForeground(Color.BLUE);
        jtxt.setBackground(Color.YELLOW);

        jtxt.setEditable(false);
        contr.add(jtxt);

        JPasswordField pwd = new JPasswordField();
        pwd.setBounds(200, 300, 300, 50);
        pwd.setText("123456");
        pwd.setEchoChar('$'); // password character which is shown when you type anything is Echo Char. if we put it empty then normal characters is shown
        
        contr.add(pwd);
        jF.setVisible(true);
    }
}
