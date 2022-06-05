import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.text.html.*;

public class MainUI extends JFrame implements ActionListener{
    JFrame frame;
    JButton shopcart;
    MainUI(){
        super();
        
        frame = new JFrame ("Eshop");
        frame.setBounds(400,200,600,400);
        frame.setLayout(null);
        
        JLabel categ = new JLabel("categories");
        categ.setBounds(40,40,140,40);
        JRadioButton smartPhoneBtn = new JRadioButton("Smart Phones");
        smartPhoneBtn.setBounds(10,120,120,20);
        JRadioButton laptopsBtn = new JRadioButton("Laptops");
        laptopsBtn.setBounds(10,150,120,20);
        JRadioButton tabletsbtn = new JRadioButton("Tablets");
        tabletsbtn.setBounds(10,180,120,20);
        shopcart = new JButton("Shopping Cart");
        shopcart.setBounds(20,300,120,15);
        shopcart.addActionListener(this);
        
        ButtonGroup bg = new ButtonGroup();    
        bg.add(smartPhoneBtn);
        bg.add(laptopsBtn);
        bg.add(tabletsbtn);
        
        
        JPanel leftpanel = new JPanel();
        leftpanel.setBounds(5,5,150,380);
        leftpanel.setLayout( null);
        leftpanel.setBackground(Color.LIGHT_GRAY);
        
        leftpanel.add(categ);
        leftpanel.add(smartPhoneBtn);
        leftpanel.add(laptopsBtn);
        leftpanel.add(tabletsbtn);
        leftpanel.add(shopcart);
        
        JPanel centralPanel = new JPanel();
        centralPanel.setBounds(160,5,425,350);
        centralPanel.setLayout( null);
        centralPanel.setBackground(Color.BLACK);
        centralPanel.setLayout(new GridLayout(3,3));
        
        JButton a1 = new JButton("<html>" + "Title" + "<br>" + "Price" + "</html>");
        a1.setBounds(10,10,120,60);
        JButton a2 = new JButton("<html>" + "Title" + "<br>" + "Price" + "</html>");
        a2.setBounds(150,10,120,60);
        JButton a3 = new JButton("<html>" + "Title" + "<br>" + "Price" + "</html>");
        a3.setBounds(290,10,120,60);
        JButton a4 = new JButton("<html>" + "Title" + "<br>" + "Price" + "</html>");
        a4.setBounds(10,160,120,60);
        JButton a5 = new JButton("<html>" + "Title" + "<br>" + "Price" + "</html>");
        a5.setBounds(150,160,120,60);
        JButton a6 = new JButton("<html>" + "Title" + "<br>" + "Price" + "</html>");
        a6.setBounds(290,160,120,60);
        JButton a7 = new JButton("<html>" + "Title" + "<br>" + "Price" + "</html>");
        a7.setBounds(10,310,120,60);
        JButton a8 = new JButton("<html>" + "Title" + "<br>" + "Price" + "</html>");
        a8.setBounds(150,310,120,60);
        JButton a9 = new JButton("<html>" + "Title" + "<br>" + "Price" + "</html>");
        a9.setBounds(290,310,120,60);
        
        
        centralPanel.add(a1);
        centralPanel.add(a2);
        centralPanel.add(a3);
        centralPanel.add(a4);
        centralPanel.add(a5);
        centralPanel.add(a6);
        centralPanel.add(a7);
        centralPanel.add(a8);
        centralPanel.add(a9);
        
        
        
        
        frame.add(centralPanel);
        frame.add(leftpanel);
        
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()== shopcart){
            frame.dispose();
            ShoppingCart cart = new ShoppingCart();
            cart.setVisible(false);
        }
    }

}
