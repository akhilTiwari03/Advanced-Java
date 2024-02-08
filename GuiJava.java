import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class GuiJava {
    public static void main(String[] args) {
        JFrame jF = new JFrame();
        jF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jF.setSize(400,400);
        jF.setTitle("Akhil");
        
        ImageIcon icon = new ImageIcon("C:\\Users\\akhil\\OneDrive\\Pictures\\default_profile.png");
        jF.setIconImage(icon.getImage());
        
        Container contr = jF.getContentPane();
        contr.setBackground(Color.LIGHT_GRAY);
        contr.setLayout(null);
        
        JLabel jL = new JLabel("User Name");
        jL.setBounds(100, 200,200,50);
        contr.add(jL);

        Font f = new Font("calbiri",Font.BOLD, 24);
        jL.setFont(f);
        jF.setVisible(true);
        
    }
}
