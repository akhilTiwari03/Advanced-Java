import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Button_Action2 {
   public static void main(String[] args) {
        JFrame jF = new JFrame("Button Action 2");
        jF.setBounds(400, 400, 800, 600);
        jF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Container cont = jF.getContentPane();
        cont.setLayout(null);

        JButton btn = new JButton("Click");
        btn.setBounds(600, 300, 100, 50);
        cont.add(btn);

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cont.setBackground(Color.CYAN);
                btn.setFont(new Font("Calbiri", Font.ITALIC, 30));

                for(int i = 1; i < 10; i++) {
                    JButton btn = new JButton("Click");
                    btn.setBounds(600 + i*50, 300 + i* 50, 100, 50);
                    btn.setText("B "+ i);
                    cont.add(btn);

                    JButton btn2 = new JButton("Click");
                    btn2.setBounds(600 - i*50, 300 + i* 50, 100, 50);
                    btn2.setText("C "+ i);
                    cont.add(btn2);
                }
            }
        });

        jF.setVisible(true);

        

   } 
}
