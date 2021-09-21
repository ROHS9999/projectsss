package travel.management.system;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.sql.*;

public class addcustomer extends JFrame implements ActionListener {

    JTextField t1, t2, t3, t4, t5, t6, t7;
    JComboBox cb1;
    JRadioButton r1, r2;
    JButton b1, b2;
    Choice ch;
   
    addcustomer(String user) {
       
        setBounds(420, 100, 950, 650);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel l10 = new JLabel("Add Customer Details");
        l10.setBounds(120, 0, 400, 30);
        l10.setFont(new Font("Tohoma", Font.BOLD, 25));
        l10.setForeground(Color.BLUE);
        add(l10);

        JLabel l1 = new JLabel("Username :");
        l1.setBounds(40, 60, 150, 30);
        l1.setFont(new Font("Tohoma", Font.BOLD, 16));
        add(l1);

        t1 = new JTextField();
        t1.setBounds(260, 60, 200, 30);
        add(t1);

        JLabel l2 = new JLabel("ID :");
        l2.setBounds(40, 110, 150, 30);
        l2.setFont(new Font("Tohoma", Font.BOLD, 16));
        add(l2);

        ch = new Choice();
        ch.add("Passport");
        ch.add("Addhar number");
        ch.add("PAN number");
        ch.add("Voter ID");
        ch.setBounds(260, 110, 200, 30);
        add(ch);

        JLabel l3 = new JLabel("Number :");
        l3.setBounds(40, 160, 150, 30);
        l3.setFont(new Font("Tohoma", Font.BOLD, 16));
        add(l3);

        t2 = new JTextField();
        t2.setBounds(260, 160, 200, 30);
        add(t2);

        JLabel l4 = new JLabel("Name :");
        l4.setBounds(40, 210, 150, 30);
        l4.setFont(new Font("Tohoma", Font.BOLD, 16));
        add(l4);

        t3 = new JTextField();
        t3.setBounds(260, 210, 200, 30);
        add(t3);

        JLabel l5 = new JLabel("Gender :");
        l5.setBounds(40, 260, 150, 30);
        l5.setFont(new Font("Tohoma", Font.BOLD, 16));
        add(l5);

        r1 = new JRadioButton("Male");
        r1.setBounds(280, 260, 90, 30);
        r1.setBackground(Color.WHITE);
        add(r1);

        r2 = new JRadioButton("Female");
        r2.setBounds(370, 260, 80, 30);
        r2.setBackground(Color.WHITE);
        add(r2);

        JLabel l6 = new JLabel("Country :");
        l6.setBounds(40, 310, 150, 30);
        l6.setFont(new Font("Tohoma", Font.BOLD, 16));
        add(l6);

        t4 = new JTextField();
        t4.setBounds(260, 310, 200, 30);
        add(t4);

        JLabel l7 = new JLabel("Address :");
        l7.setBounds(40, 360, 150, 30);
        l7.setFont(new Font("Tohoma", Font.BOLD, 16));
        add(l7);

        t5 = new JTextField();
        t5.setBounds(260, 360, 200, 30);
        add(t5);

        JLabel l8 = new JLabel("Phone :");
        l8.setBounds(40, 410, 150, 30);
        l8.setFont(new Font("Tohoma", Font.BOLD, 16));
        add(l8);

        t6 = new JTextField();
        t6.setBounds(260, 410, 200, 30);
        add(t6);

        JLabel l9 = new JLabel("Email :");
        l9.setBounds(40, 460, 150, 30);
        l9.setFont(new Font("Tohoma", Font.BOLD, 16));
        add(l9);

        t7 = new JTextField();
        t7.setBounds(260, 460, 200, 30);
        add(t7);

        b1 = new JButton("Add");
        b1.setBounds(90, 520, 120, 30);
        b1.setFont(new Font("Tohoma", Font.BOLD, 16));
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        add(b1);

        b2 = new JButton("Back");
        b2.setBounds(260, 520, 120, 30);
        b2.setFont(new Font("Tohoma", Font.BOLD, 16));
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        add(b2);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icons/newcustomer.jpg"));
        Image i2 = i1.getImage().getScaledInstance(500, 600, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l11 = new JLabel(i3);
        l11.setBounds(480, 70, 400, 500);
        add(l11);
        
        try{
            conn c=new conn();
            ResultSet rs = c.s.executeQuery("select * from account where username='"+user+"' ");
            
            while(rs.next()){
                t1.setText(rs.getString("username"));
                t3.setText(rs.getString("name"));
            }
        }catch(Exception e){
            
        }
        
    }

    public void actionPerformed(ActionEvent ae) {
        String username = t1.getText();
        String id = ch.getSelectedItem();
        String number = t2.getText();
        String name = t3.getText();

        String country = t4.getText();
        String address = t5.getText();
        String phone = t6.getText();
        String email = t7.getText();
        String gender = null;
        if (r1.isSelected()) {
            gender = "Male";
        } else if (r2.isSelected()) {
            gender = "Female";
        }
        if (ae.getSource() == b1) {

        
        String sql = "insert into customer values('" + username + "', '" + id + "', '" + number + "', '" + name + "' ,'" + gender + "' ,'" + country + "' ,'" + address + "' ,'" + phone + "' ,'" + email + "')";
        
        try{
            conn c=new conn();
            c.s.executeUpdate(sql);
            
            JOptionPane.showMessageDialog(null, "Customer Details Added Successfully ");
            this.setVisible(false);

            
        }catch(Exception e){
            
        }
        }else if(ae.getSource() == b2){
            this.setVisible(false);
        }
    }

    public static void main(String args[]) {
        new addcustomer("").setVisible(true);

    }
}
