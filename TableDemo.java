import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class TableDemo {
    public static void main(String[] args) {

        JFrame jf = new JFrame("Table Example");
        jf.setSize(800, 600);
        jf.setLocationRelativeTo(null);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        String data[][] = {
                { "100", "Akhil", "21" },
                { "101", "Lakshya", "22" },
                { "201", "Arpit", "21" },
                { "103", "Akash", "21" }
        };
        String[] col = { "Roll No. ", "Name ", " Age" };

        JTable jt = new JTable(data, col);
        jf.add(new JScrollPane(jt));
        jt.setFont(new Font("Arial", Font.ITALIC, 13));
        jt.setRowHeight(50);

    }
}
