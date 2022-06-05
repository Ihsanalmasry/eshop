import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.*;
public class Frame implements ActionListener {
    JFrame frame = new JFrame ("Login");
    
    JLabel label = new JLabel("Enter Username :");

    JLabel l = new JLabel("Enter Password :");

    JTextField text = new JTextField();

    JButton button = new JButton("Register");
 
    JButton but = new JButton("Login");

    JPasswordField j = new JPasswordField();
    
    Frame(){
        
        l.setBounds(10,50,100,20);
        j.setBounds(150,50,100,20);
        label.setBounds(10,10,150,20);
        text.setBounds(150, 10, 100, 20);
        button.setBounds(20,100,90,20); 
        but.setBounds(150,100,90,20);
        
        
        button.addActionListener(this);


        frame.add(l);

        frame.add(j);

        frame.add(label); 

        frame.add(text);

        frame.add(button);

        frame.add(but);

        frame.repaint();
        
        
        
        frame.setSize(300,300);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setLayout(null);

        frame.setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == button){
            frame.dispose();
            RegisterFrame nf = new RegisterFrame();
        }
    }
    
}
