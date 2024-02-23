import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class TableDemo2 {
    public static void main(String[] args) {
        JFrame jf = new JFrame("Table Example2");
        jf.setSize(800, 600);
        jf.setLocationRelativeTo(null);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Object data[][] = {
            {"101", "Ram", "17-12-2018"}, 
            {"102", "Karan", "02-05-2019"},
            {"103", "Arpit", "12-Jan- 2020"},
            {"100", "Akash", "24 December 2024"}
        };

        String []col = {"Reg No", "Name", "Date of Birth"};
        
        // JTable jT = new JTable(data, col);
        // jf.add(new JScrollPane(jT));

        DefaultTableModel tm = new DefaultTableModel(data, col);
        JTable jt = new JTable(tm);
        jf.add(new JScrollPane(jt));
        jf.setVisible(true);
    }
}
