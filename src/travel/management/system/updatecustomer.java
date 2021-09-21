package travel.management.system;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.sql.*;

public class updatecustomer extends JFrame implements ActionListener {

    JTextField t1, t2, t3, t4, t5, t6, t7, t8, t9;
    JComboBox cb1;
    JRadioButton r1, r2;
    JButton b1, b2;
    Choice ch;
    String user;

    updatecustomer(String username) {
        this.user=username;
        setBounds(420, 100, 950, 650);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel l10 = new JLabel("Update Customer Details");
        l10.setBounds(100, 0, 400, 30);
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

        t8 = new JTextField();
        t8.setBounds(260, 110, 200, 30);
        add(t8);

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

        t9 = new JTextField();
        t9.setBounds(260, 260, 200, 30);
        add(t9);

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

        b1 = new JButton("Update");
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

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icons/update.png"));
        Image i2 = i1.getImage().getScaledInstance(300, 400, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l11 = new JLabel(i3);
        l11.setBounds(550, 80, 220, 400);
        add(l11);

        try {
            conn c = new conn();
            ResultSet rs = c.s.executeQuery("select * from customer where username='"+user+"' ");

            while (rs.next()) {
                t1.setText(rs.getString("username"));
                t8.setText(rs.getString("id"));
                t2.setText(rs.getString("number"));
                t3.setText(rs.getString("name"));
                t9.setText(rs.getString("gender"));
                t4.setText(rs.getString("country"));
                t5.setText(rs.getString("address"));
                t6.setText(rs.getString("phone"));
                t7.setText(rs.getString("email"));

            }
        } catch (Exception e) {

        }

    }

    public void actionPerformed(ActionEvent ae) {
        String username = t1.getText();
        String number = t2.getText();
        String name = t3.getText();
        String country = t4.getText();
        String address = t5.getText();
        String phone = t6.getText();
        String email = t7.getText();
        String id = t8.getText();
        String gender = t9.getText();

        if (ae.getSource() == b1) {

            String sql = "update customer set username='" + username + "', id= '" + id + "', number= '" + number + "', name='" + name + "' ,gender= '" + gender + "' ,country='" + country + "' ,address = '" + address + "' ,phone ='" + phone + "' ,email='" + email + "' where username='"+user+"'";

            try {
                conn c = new conn();
                c.s.executeUpdate(sql);

                JOptionPane.showMessageDialog(null, "Customer Details Updated Successfully ");
                this.setVisible(false);

            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (ae.getSource() == b2) {
            this.setVisible(false);
        }
    }

    public static void main(String args[]) {
        new updatecustomer("").setVisible(true);

    }
}
