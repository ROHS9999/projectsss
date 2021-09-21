package travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class bookpackage extends JFrame implements ActionListener {

    JButton b1, b2, b3;
    JLabel l3,l7,l9,l11,l13;
    Choice ch;
    JTextField t1;

    bookpackage(String user) {
        
        setBounds(320, 100, 1200, 680);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel l1 = new JLabel("BOOK PACKAGE");
        l1.setBounds(140, 10, 400, 30);
        l1.setFont(new Font("Tohoma", Font.BOLD, 25));
        l1.setForeground(Color.blue);
        add(l1);

        JLabel l2 = new JLabel("Username");
        l2.setBounds(40, 80, 200, 30);
        l2.setFont(new Font("Tohoma", Font.BOLD, 18));
        add(l2);

        l3 = new JLabel();
        l3.setBounds(320, 80, 250, 30);
        l3.setFont(new Font("Tohoma", Font.PLAIN, 16));
        add(l3);

        JLabel l4 = new JLabel("Select Package");
        l4.setBounds(40, 140, 200, 30);
        l4.setFont(new Font("Tohoma", Font.BOLD, 18));
        add(l4);

        ch = new Choice();
        ch.add("GOLD PACKAGE");
        ch.add("SILVER PACKAGE");
        ch.add("BRONZE PACKAGE");
        ch.setBounds(320, 145, 250, 30);
        add(ch);

        JLabel l5 = new JLabel("Total Persons");
        l5.setBounds(40, 210, 200, 30);
        l5.setFont(new Font("Tohoma", Font.BOLD, 18));
        add(l5);

        t1 = new JTextField("1");
        t1.setBounds(320, 210, 250, 30);
        add(t1);

        JLabel l6 = new JLabel("ID");
        l6.setBounds(40, 280, 200, 30);
        l6.setFont(new Font("Tohoma", Font.BOLD, 18));
        add(l6);

        l7 = new JLabel();
        l7.setBounds(320, 280, 250, 30);
        l7.setFont(new Font("Tohoma", Font.PLAIN, 18));
        add(l7);

        JLabel l8 = new JLabel("Number");
        l8.setBounds(40, 350, 200, 30);
        l8.setFont(new Font("Tohoma", Font.BOLD, 18));
        add(l8);

        l9 = new JLabel();
        l9.setBounds(320, 350, 250, 30);
        l9.setFont(new Font("Tohoma", Font.PLAIN, 16));
        add(l9);

        JLabel l10 = new JLabel("Phone");
        l10.setBounds(40, 420, 200, 30);
        l10.setFont(new Font("Tohoma", Font.BOLD, 18));
        add(l10);

        l11 = new JLabel();
        l11.setBounds(320, 420, 250, 30);
        l11.setFont(new Font("Tohoma", Font.PLAIN, 16));
        add(l11);

        JLabel l12 = new JLabel("Total Price");
        l12.setBounds(40, 490, 200, 30);
        l12.setFont(new Font("Tohoma", Font.BOLD, 18));
        add(l12);

        l13 = new JLabel();
        l13.setBounds(320, 490, 250, 30);
        l13.setFont(new Font("Tohoma", Font.BOLD, 16));
        l13.setForeground(Color.RED);
        add(l13);

        b1 = new JButton("Check Price");
        b1.setBounds(60, 580, 150, 25);
        b1.setForeground(Color.CYAN);
        b1.setBackground(Color.BLACK);
        b1.setFont(new Font("Tohoma", Font.BOLD, 15));
        b1.addActionListener(this);
        add(b1);

        b2 = new JButton("Book Package");
        b2.setBounds(240, 580, 150, 25);
        b2.setForeground(Color.CYAN);
        b2.setBackground(Color.BLACK);
        b2.setFont(new Font("Tohoma", Font.BOLD, 15));
        b2.addActionListener(this);
        add(b2);

        b3 = new JButton("Back");
        b3.setBounds(420, 580, 150, 25);
        b3.setForeground(Color.CYAN);
        b3.setBackground(Color.BLACK);
        b3.setFont(new Font("Tohoma", Font.BOLD, 15));
        b3.addActionListener(this);
        add(b3);
        
         ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icons/bookpackage.jpg"));
        Image i2 = i1.getImage().getScaledInstance(550, 400, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l21 = new JLabel(i3);
        l21.setBounds(600,30,550,400);
        add(l21);
        
        try{
            conn c=new conn();
            ResultSet rs=c.s.executeQuery("Select * from customer where username='"+user+"'");
            
            while(rs.next()){
                 l3.setText(rs.getString("username"));
                 l7.setText(rs.getString("id"));
                 l9.setText(rs.getString("number"));
                 l11.setText(rs.getString("phone"));
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == b1){
            
            String p=ch.getSelectedItem();
            int cost=0;
                    if(p.equals("GOLD PACKAGE")){
                        cost+=12000;
                    }else if(p.equals("SILVER PACKAGE")){
                        cost+=24000;
                    }else if(p.equals("BRONZE PACKAGE")){
                        cost+=32000;
                    }
           int persons = Integer.parseInt(t1.getText());
           cost *= persons;
           l13.setText("RS "+cost);
            
        }else if(ae.getSource() == b2){
            
            try{
                conn c=new conn();
                String sql="insert into bookPackage values('"+l3.getText()+"','"+ch.getSelectedItem()+"','"+t1.getText()+"','"+l7.getText()+"','"+l9.getText()+"','"+l11.getText()+"','"+l13.getText()+"')";
                c.s.executeUpdate(sql);  
                
                JOptionPane.showMessageDialog(null, "Package Booked Successfully ");
                this.setVisible(false);
                
            }catch(Exception e){
                e.printStackTrace();
            }
            
        }else if(ae.getSource() == b3){
            this.setVisible(false);
        }
    }
    

    public static void main(String args[]) {
        new bookpackage("").setVisible(true);
    }
}
