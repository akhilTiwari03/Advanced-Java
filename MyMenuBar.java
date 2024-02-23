import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MyMenuBar {
    public static void main(String[] args) {
        JFrame jF = new JFrame("Table Example");
        jF.setSize(500, 500);
        jF.setLocationRelativeTo(null);
        jF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JMenuBar jMB = new JMenuBar();

        JMenu file = new JMenu("File");
        JMenuItem file1 = new JMenuItem("New");
        JMenuItem file2 = new JMenuItem("Open");
        JMenuItem file3 = new JMenuItem("Save");

        file.add(file1);
        file.add(file2);
        file.add(file3);

        jMB.add(file);
        jF.setJMenuBar(jMB);

        JMenu edit = new JMenu("Edit");
        JMenuItem edit1 = new JMenuItem("Cut");
        JMenuItem edit2 = new JMenuItem("Copy");
        JMenuItem edit3 = new JMenuItem("Paste");
        JMenuItem edit4 = new JMenuItem("Delete");

        edit.add(edit1);
        edit.add(edit2);
        edit.add(edit3);
        edit.add(edit4);

        jMB.add(edit);
        jF.setJMenuBar(jMB);
    }    
}
