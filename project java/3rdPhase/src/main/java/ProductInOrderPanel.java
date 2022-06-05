import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;

public class ProductInOrderPanel extends JPanel {
    private ProductInOrder prod;
    JPanel centralpanel22;
    
    public ProductInOrderPanel(ProductInOrder x){
        super();
        centralpanel22 = new JPanel();
        centralpanel22.setBounds(15,15,250,250);
        centralpanel22.setLayout(new FlowLayout());
        centralpanel22.setBackground(Color.GREEN);
        prod = x;
        
        JLabel label1 = new JLabel(prod.getProduct().getTitle());
        label1.setSize(20,20);
        JLabel label2 = new JLabel(Float.toString(prod.getProduct().getPrice()));
        label2.setSize(20,20);
        JLabel label3 = new JLabel(Integer.toString(prod.getQuantity()));
        label3.setSize(20,20);
        JLabel label4 = new JLabel(Float.toString(prod.getTotalPrice1()));
        label4.setSize(20,20);
        
        JButton button1 = new JButton("+1");
        button1.setSize(20,20);
        JButton button2 = new JButton("-1");
        button2.setSize(20,20);
        JButton button3 = new JButton("remove");
        button3.setSize(20,20);
        
                centralpanel22.add(label1);
        centralpanel22.add(label2);
        centralpanel22.add(label3);
        centralpanel22.add(label4);
        centralpanel22.add(button1);
        centralpanel22.add(button2);
        centralpanel22.add(button3);
        
        
    }

    ProductInOrderPanel() {
        }
    
}