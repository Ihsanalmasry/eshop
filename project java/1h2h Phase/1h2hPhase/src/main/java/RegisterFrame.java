import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;

public class RegisterFrame extends JFrame implements ActionListener{
        JFrame frame = new JFrame ("Register Frame");
        
        JLabel name = new JLabel("Name :");
        
        JLabel email = new JLabel("email :");
        
        JLabel username = new JLabel("UserName :");

        JLabel pass = new JLabel("Password :");
        
        JLabel bday = new JLabel("Birthdate :");
        
        JLabel address = new JLabel("Address :");
        
        JLabel tel = new JLabel("Tel :");

        JTextField n = new JTextField();
        
        JTextField e = new JTextField();
        
        JTextField u = new JTextField();

        JTextField p = new JTextField();
        
        JTextField b = new JTextField();
        
        JTextField ad = new JTextField();
        
        JTextField t = new JTextField();
        
        JButton button2 = new JButton("Register");
        
        JCheckBox but = new JCheckBox("Newsletter updates");
        
        
        RegisterFrame(){
            super();
            
             name.setBounds(30,50,100,20);
        email.setBounds(30,100,100,20);
        username.setBounds(30,150,100,20);
        pass.setBounds(30,200,100,20);
        bday.setBounds(30,250,100,20);
        address.setBounds(30,300,100,20);
        tel.setBounds(30,350,100,20);


        n.setBounds(200,50,200,20);
        e.setBounds(200,100,200,20);
        u.setBounds(200,150,200,20);
        p.setBounds(200,200,200,20);
        b.setBounds(200,250,200,20);
        ad.setBounds(200,300,200,20);
        t.setBounds(200,350,200,20);
        but.setBounds(30,450,200,20);
        button2.setBounds(300,450,90,20); 
        
        button2.addActionListener(this);
        

            frame.setSize(600,600);

            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            frame.setVisible(true);

            frame.setLayout(null);
            
            

        frame.add(name);
           frame.add(n);
        frame.add(email);
           frame.add(e);
        frame.add(username);
           frame.add(u);
        frame.add(pass);
           frame.add(p);
        frame.add(bday);
           frame.add(b);
        frame.add(address);
           frame.add(ad);
        frame.add(tel);
           frame.add(t);
        frame.add(button2);
        
        frame.add(but);

        frame.repaint();

        
        }
        public void actionPerformed(ActionEvent ex) {
            if(ex.getSource()==button2){
            String NAME = n.getText();
            String EMAIL = e.getText();
            String USERNAME = u.getText();
            String PASSWORD = p.getText();
            String BIRTHDAY = b.getText();
            String ADDRESS = ad.getText();
            String TELEPHONE = t.getText();
            
            Customer newcustomer = new Customer(NAME,EMAIL,USERNAME,PASSWORD,BIRTHDAY,ADDRESS,TELEPHONE);
            
             EshopData.getUsers().add(newcustomer);  
             
            }
            
                
        }
}

   
    
