import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

public class DropDownExample extends JFrame {
    private JComboBox<String> itemList;
    private JButton showPriceButton;
    private JLabel priceLabel;
    private HashMap<String, Double> itemPrices;

    public DropDownExample() {
        setTitle("Eatable Items");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Initialize components
        itemList = new JComboBox<>();
        itemList.addItem("Apple");
        itemList.addItem("Banana");
        itemList.addItem("Orange");
        itemList.addItem("Cola");
        itemList.addItem("Lemonade");
        itemList.addItem("Iced Tea");

        itemPrices = new HashMap<>();
        itemPrices.put("Appy Fizz", 70.0);
        itemPrices.put("Banana Shake", 80.0);
        itemPrices.put("Orange Juice", 90.0);
        itemPrices.put("Cola ", 20.0);
        itemPrices.put("Lemonade", 15.0);
        itemPrices.put("Iced Tea", 25.0);

        showPriceButton = new JButton("Show Price");
        priceLabel = new JLabel();

        // Add action listener to the button
        showPriceButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedItem = (String) itemList.getSelectedItem();
                if (selectedItem != null) {
                    double price = itemPrices.get(selectedItem);
                    priceLabel.setText("Price: Rs " + price);
                } else {
                    priceLabel.setText("Please select an item");
                }
            }
        });

        // Layout
        setLayout(new BorderLayout());
        JPanel topPanel = new JPanel();
        topPanel.add(new JLabel("Select an item: "));
        topPanel.add(itemList);
        add(topPanel, BorderLayout.NORTH);

        JPanel centerPanel = new JPanel();
        centerPanel.add(showPriceButton);
        add(centerPanel, BorderLayout.CENTER);

        JPanel bottomPanel = new JPanel();
        bottomPanel.add(priceLabel);
        add(bottomPanel, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                DropDownExample app = new DropDownExample();
                app.setVisible(true);
            }
        });
    }
}
