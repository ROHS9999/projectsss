
package travel.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;


public class viewcustomer extends JFrame implements ActionListener {
    
    JButton b1;
 
    viewcustomer(String user){
     
        setBounds(420, 100, 1000, 650);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel l23 = new JLabel("All Customer Details");
        l23.setBounds(40, 0, 400, 30);
        l23.setFont(new Font("Tohoma", Font.BOLD, 25));
        l23.setForeground(Color.BLUE);
        add(l23);
        
        
        JLabel l1 = new JLabel("Username :");
        l1.setBounds(40, 60, 150, 30);
        l1.setFont(new Font("Tohoma", Font.BOLD, 16));
        add(l1);
        
        JLabel l11 = new JLabel();
        l11.setBounds(280, 60, 150, 30);
        l11.setFont(new Font("Tohoma", Font.PLAIN, 16));
        add(l11);
        
        
        JLabel l2 = new JLabel("ID :");
        l2.setBounds(40, 130, 150, 30);
        l2.setFont(new Font("Tohoma", Font.BOLD, 16));
        add(l2);
        
        JLabel l12 = new JLabel();
        l12.setBounds(280, 130, 150, 30);
        l12.setFont(new Font("Tohoma", Font.PLAIN, 16));
        add(l12);
        
        JLabel l3 = new JLabel("Number :");
        l3.setBounds(40, 200, 150, 30);
        l3.setFont(new Font("Tohoma", Font.BOLD, 16));
        add(l3);
        
        JLabel l13 = new JLabel();
        l13.setBounds(280, 200, 150, 30);
        l13.setFont(new Font("Tohoma", Font.PLAIN, 16));
        add(l13);
        
        JLabel l4 = new JLabel("Name :");
        l4.setBounds(40, 270, 150, 30);
        l4.setFont(new Font("Tohoma", Font.BOLD, 16));
        add(l4);
        
        JLabel l14 = new JLabel();
        l14.setBounds(280, 270, 150, 30);
        l14.setFont(new Font("Tohoma", Font.PLAIN, 16));
        add(l14);
        
        JLabel l5 = new JLabel("Gender :");
        l5.setBounds(40, 340, 150, 30);
        l5.setFont(new Font("Tohoma", Font.BOLD, 16));
        add(l5);
        
        JLabel l15 = new JLabel();
        l15.setBounds(280, 340, 150, 30);
        l15.setFont(new Font("Tohoma", Font.PLAIN, 16));
        add(l15);
        
        JLabel l6 = new JLabel("Country :");
        l6.setBounds(520, 60, 150, 30);
        l6.setFont(new Font("Tohoma", Font.BOLD, 16));
        add(l6);
        
        
        JLabel l16 = new JLabel();
        l16.setBounds(760, 60, 150, 30);
        l16.setFont(new Font("Tohoma", Font.PLAIN, 16));
        add(l16);
        
        
        JLabel l7 = new JLabel("Address :");
        l7.setBounds(520, 130, 150, 30);
        l7.setFont(new Font("Tohoma", Font.BOLD, 16));
        add(l7);
        
        JLabel l17 = new JLabel();
        l17.setBounds(760, 130, 150, 30);
        l17.setFont(new Font("Tohoma", Font.PLAIN, 16));
        add(l17);
        
        JLabel l8 = new JLabel("Phone :");
        l8.setBounds(520, 200, 150, 30);
        l8.setFont(new Font("Tohoma", Font.BOLD, 16));
        add(l8);
        
        JLabel l18 = new JLabel();
        l18.setBounds(760, 200, 150, 30);
        l18.setFont(new Font("Tohoma", Font.PLAIN, 16));
        add(l18);
        
        JLabel l9 = new JLabel("Email :");
        l9.setBounds(520, 270, 150, 30);
        l9.setFont(new Font("Tohoma", Font.BOLD, 16));
        add(l9);
        
        JLabel l19 = new JLabel();
        l19.setBounds(760, 270, 150, 30);
        l19.setFont(new Font("Tohoma", Font.PLAIN, 16));
        add(l19);
        
        b1 = new JButton("Back");
        b1.setBounds(350, 410, 120, 25);
        b1.setFont(new Font("Tohoma", Font.BOLD, 14));
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        add(b1);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icons/viewall.jpg"));
        Image i2 = i1.getImage().getScaledInstance(600, 200, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l21 = new JLabel(i3);
        l21.setBounds(10,440,600,200);
        add(l21);
        
         ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icons/viewall.jpg"));
        Image i5 = i4.getImage().getScaledInstance(630, 200, Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel l22 = new JLabel(i6);
        l22.setBounds(600,440,630,200);
        add(l22);
        
         try {
            conn c = new conn();
            ResultSet rs = c.s.executeQuery("select * from customer where username='"+user+"' ");

            while (rs.next()) {
                l11.setText(rs.getString("username"));
                l12.setText(rs.getString("id"));
                l13.setText(rs.getString("number"));
                l14.setText(rs.getString("name"));
                l15.setText(rs.getString("gender"));
                l16.setText(rs.getString("country"));
                l17.setText(rs.getString("address"));
                l18.setText(rs.getString("phone"));
                l19.setText(rs.getString("email"));

            }
        } catch (Exception e) {

        }

    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == b1){
            this.setVisible(false);
        }
    }
    
    public static void main(String args[]){
        new viewcustomer("").setVisible(true);
    }
}
