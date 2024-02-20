import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

class ToggleButton extends JFrame implements ActionListener {

    java.awt.Container c;
    JToggleButton btnToggle;

    ToggleButton() {
        JFrame jF = new JFrame("My Toggle Button");
        jF.setBounds(200, 200, 800, 50);
        jF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        c = jF.getContentPane();
        c.setLayout(null);

        btnToggle = new JToggleButton("Click Me ");
        btnToggle.setBounds(200, 200, 800, 50);
        btnToggle.setBackground(Color.BLACK);
        c.add(btnToggle);

        btnToggle.addActionListener(this);
        jF.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (btnToggle.isSelected()) {
            c.setBackground(Color.RED);
        } else {
            c.setBackground(null); // Reset background to default when button is deselected
        }
    }
}

public class MyToggleButton {
    public static void main(String[] args) {
        new ToggleButton();
    }
}
