import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;

public class ShoppingCart extends JFrame implements ActionListener{
    JButton proceed;
    JPanel centralpanel11;
    JScrollPane scroll;
    JPanel panelsouth ;
    ShoppingCart(){
        super();
        JFrame f = new JFrame("Shopping Cart");
        f.setBounds(500,300,400,200);
        f.setLayout(new BorderLayout());
        centralpanel11 = new JPanel();
        centralpanel11.setLayout(new BoxLayout(centralpanel11,BoxLayout.Y_AXIS));
        centralpanel11.setAutoscrolls(true);
        
        centralpanel11.setBackground(Color.GRAY);
        JPanel panel2 = new JPanel(new GridLayout(10,1));
        
        
        panelsouth = new JPanel();
        panelsouth.setBackground(Color.BLACK);
        
        scroll = new JScrollPane(centralpanel11);
        
        scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        
        scroll.setBorder(BorderFactory.createLineBorder(Color.black));
        scroll.add(centralpanel11);
        scroll.add(panel2);
        scroll.getViewport().add(panel2);
        scroll.getViewport().add(centralpanel11);
        f.add(scroll,BorderLayout.CENTER);
        
        proceed = new JButton("Proceed order");
        proceed.setBounds(10,10,20,20);
        proceed.addActionListener(this);
        JButton remove = new JButton("Remove all");
        remove.setBounds(50,10,20,20);
        
        
        f.add(panelsouth,BorderLayout.SOUTH);
        panelsouth.add(proceed,BorderLayout.WEST);
        panelsouth.add(remove,BorderLayout.EAST);
        
        
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == proceed){
            Product a = new Product(100,0.24f,"Smasung","Phone","SmartPhone");
            ProductInOrder order1 = new ProductInOrder(a,2);
            ProductInOrderPanel pror = new ProductInOrderPanel(order1);
            pror.setBounds(10,10,150,20);
            JPanel fff = new JPanel();
            
            JLabel label1 = new JLabel(order1.getProduct().getTitle());
            label1.setSize(20,20);
            JLabel label2 = new JLabel(Float.toString(order1.getProduct().getPrice()));
            label2.setSize(20,20);
            JLabel label3 = new JLabel(Integer.toString(order1.getQuantity()));
            label3.setSize(20,20);
            JLabel label4 = new JLabel(Float.toString(order1.getTotalPrice1()));
            label4.setSize(20,20);
        
            JButton button1 = new JButton("+1");
            button1.setSize(20,20);
            JButton button2 = new JButton("-1");
            button2.setSize(20,20);
            JButton button3 = new JButton("remove");
            button3.setSize(20,20);
            
            fff.add(label1);
            fff.add(label2);
            fff.add(label3);
            fff.add(label4);
            fff.add(button1);
            fff.add(button2);
            fff.add(button3);
            centralpanel11.add(fff);
            centralpanel11.revalidate();
            centralpanel11.repaint();
            
            
        }
    }

    
}