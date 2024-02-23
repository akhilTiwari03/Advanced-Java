import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextField;

class MyFrame extends JFrame implements ActionListener
{
java.awt.Container c;
JTextField jTF;
MyFrame()
{
setSize(500, 500);
setLocationRelativeTo(null);
setDefaultCloseOperation(EXIT_ON_CLOSE);

    c = getContentPane();
    c.setLayout(null);

    jTF = new JTextField();
    jTF.setFont(new Font("Arial", Font.PLAIN, 13));
    jTF.setBounds(100, 100, 200, 50);
    c.add(jTF);
    
    jTF.addActionListener(this);
    setVisible(true);
}

@Override
public void actionPerformed(ActionEvent e)
{
    jTF.setText(jTF.getText().toUpperCase());
}
}
public class TextBox_List {
public static void main(String[] args) {
new MyFrame();
}
}