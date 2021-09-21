package travel.management.system;

import javax.swing.*;
import java.awt.*;
import javax.swing.border.LineBorder;
import java.awt.event.*;
import java.sql.*;


public class signup extends JFrame implements ActionListener{
    JButton b1,b2;
    JTextField t1,t2,t3,t4;
    Choice c1;
    signup()
    {
        setLayout(null);
        setBounds(450 ,200, 900, 400);
        getContentPane().setBackground(Color.CYAN);
        
        JPanel p1=new JPanel();
        p1.setLayout(null);
        p1.setBounds(0, 0, 450, 400);
        p1.setBackground(new Color(131, 193, 233));
        add(p1);
        
        JLabel l1=new JLabel("Username");
        l1.setFont(new Font("TOHOMA", Font.BOLD, 14));
        l1.setBounds(50, 40, 100, 25);
        p1.add(l1);
        
        t1=new JTextField();
        t1.setBounds(190, 40, 190, 25);
        t1.setBorder(null);   
        t1.setFont(new Font("Tohoma",Font.BOLD,14)); 
        p1.add(t1);
        
        JLabel l2=new JLabel("Name");
        l2.setFont(new Font("TOHOMA", Font.BOLD, 14));
        l2.setBounds(50, 80, 125, 25);
        p1.add(l2);
        
        t2=new JTextField();
        t2.setBounds(190, 80, 190, 25);
        t2.setBorder(null);   
        t2.setFont(new Font("Tohoma",Font.BOLD,14)); 
        p1.add(t2);
        
        JLabel l3=new JLabel("Password");
        l3.setFont(new Font("TOHOMA", Font.BOLD, 14));
        l3.setBounds(50, 120, 125, 25);
        p1.add(l3);
        
        t3=new JTextField();
        t3.setBounds(190, 120, 190, 25);
        t3.setBorder(null);   
        t3.setFont(new Font("Tohoma",Font.BOLD,14)); 
        p1.add(t3);
        
        JLabel l4=new JLabel("Security Question");
        l4.setFont(new Font("TOHOMA", Font.BOLD, 14));
        l4.setBounds(50, 160, 140, 25);
        p1.add(l4);
        
        c1=new Choice();
        c1.add("Your lucky number?");
        c1.add("Your nickname in school?");
        c1.add("Your fav super hero?");
        c1.add("Your birth place name?");
        c1.setBounds(190, 160, 190, 25);
        p1.add(c1);
        
        JLabel l5=new JLabel("Answer");
        l5.setFont(new Font("TOHOMA", Font.BOLD, 14));
        l5.setBounds(50, 200, 125, 25);
        p1.add(l5);
        
        t4=new JTextField();
        t4.setBounds(190, 200, 190, 25);
        t4.setBorder(null);  
        t4.setFont(new Font("Tohoma",Font.BOLD,14)); 
        p1.add(t4);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icons/signup2.png"));
        Image i2=i1.getImage().getScaledInstance(270, 270, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel l6=new JLabel(i3);
        l6.setBounds(530, 50, 270, 270); 
        add(l6);
        
        JLabel l7=new JLabel("Create New Customer Account");
        l7.setFont(new Font("Tohoma",Font.BOLD,24));
        l7.setBounds(485,10,400,30);
        add(l7);
        
        b1=new JButton("Create");
        b1.setBounds(90, 270, 100, 30);
        b1.setBackground(Color.white);
        b1.setForeground(new Color(133, 193, 233));
        b1.setFont(new Font("Tohoma", Font.BOLD,14));
        b1.setBorder(new LineBorder(Color.RED));
        
        b1.addActionListener(this);
        p1.add(b1);
        
        b2=new JButton("Back");
        b2.setBounds(250, 270, 100, 30);
        b2.setBackground(Color.white);
        b2.setForeground(new Color(133, 193, 233));
        b2.setFont(new Font("Tohoma", Font.BOLD,14));
        b2.setBorder(new LineBorder(Color.RED));
        b2.addActionListener(this);
        p1.add(b2);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b1){
            String username=t1.getText();
            String name=t2.getText();
            String password=t3.getText();
            String security=c1.getSelectedItem();
            String answer=t4.getText();
            
            String query="insert into account values('"+username+"','"+name+"','"+password+"','"+security+"','"+answer+"')";
            try{
                conn c=new conn();
                c.s.executeUpdate(query);

                JOptionPane.showMessageDialog(null, "Account Created Succesfully");
                
                this.setVisible(false);
                new login().setVisible(true);
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Username already exists");
            }
        }else if(ae.getSource()==b2){
            this.setVisible(false);
            new login().setVisible(true);
            
        }
        
    }
    public static void main(String[] args){
        new signup();
    }
}
