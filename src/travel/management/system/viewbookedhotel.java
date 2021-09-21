package travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;

public class viewbookedhotel extends JFrame implements ActionListener {

    JLabel l3, l5, l7, l9, l11, l13, l15, l17, l19, l21;
    JButton b1, b2;
    String user;

    viewbookedhotel(String username) {
        this.user = username;
        setBounds(320, 100, 1200, 720);
        getContentPane().setBackground(Color.cyan);
        setLayout(null);

        JLabel l1 = new JLabel("BOOKED PACKAGE DETAILS");
        l1.setBounds(40, 10, 400, 30);
        l1.setFont(new Font("Tohoma", Font.BOLD, 25));
        l1.setForeground(Color.RED);
        add(l1);

        JLabel l2 = new JLabel("Username:");
        l2.setBounds(40, 80, 200, 30);
        l2.setFont(new Font("Tohoma", Font.BOLD, 18));
        add(l2);

        l3 = new JLabel();
        l3.setBounds(360, 80, 250, 30);
        l3.setFont(new Font("Tohoma", Font.BOLD, 16));
        add(l3);

        JLabel l4 = new JLabel("Hotel Name:");
        l4.setBounds(40, 140, 200, 30);
        l4.setFont(new Font("Tohoma", Font.BOLD, 18));
        add(l4);

        l5 = new JLabel();
        l5.setBounds(360, 140, 250, 30);
        l5.setFont(new Font("Tohoma", Font.BOLD, 16));
        add(l5);

        JLabel l6 = new JLabel("Total Persons:");
        l6.setBounds(40, 200, 200, 30);
        l6.setFont(new Font("Tohoma", Font.BOLD, 18));
        add(l6);

        l7 = new JLabel();
        l7.setBounds(360, 200, 250, 30);
        l7.setFont(new Font("Tohoma", Font.BOLD, 16));
        add(l7);

        JLabel l8 = new JLabel("Total Days:");
        l8.setBounds(40, 260, 200, 30);
        l8.setFont(new Font("Tohoma", Font.BOLD, 18));
        add(l8);

        l9 = new JLabel();
        l9.setBounds(360, 260, 250, 30);
        l9.setFont(new Font("Tohoma", Font.BOLD, 16));
        add(l9);

        JLabel l10 = new JLabel("Ac included?:");
        l10.setBounds(40, 320, 200, 30);
        l10.setFont(new Font("Tohoma", Font.BOLD, 18));
        add(l10);

        l11 = new JLabel();
        l11.setBounds(360, 320, 250, 30);
        l11.setFont(new Font("Tohoma", Font.BOLD, 16));
        add(l11);

        JLabel l12 = new JLabel("Food Included?:");
        l12.setBounds(40, 380, 200, 30);
        l12.setFont(new Font("Tohoma", Font.BOLD, 18));
        add(l12);

        l13 = new JLabel();
        l13.setBounds(360, 380, 250, 30);
        l13.setFont(new Font("Tohoma", Font.BOLD, 16));
        add(l13);

        JLabel l14 = new JLabel("ID:");
        l14.setBounds(40, 440, 200, 30);
        l14.setFont(new Font("Tohoma", Font.BOLD, 18));
        add(l14);

        l15 = new JLabel();
        l15.setBounds(360, 440, 250, 30);
        l15.setFont(new Font("Tohoma", Font.BOLD, 16));
        l15.setForeground(Color.RED);
        add(l15);

        JLabel l16 = new JLabel("Number:");
        l16.setBounds(40, 500, 200, 30);
        l16.setFont(new Font("Tohoma", Font.BOLD, 18));
        add(l16);

        l17 = new JLabel();
        l17.setBounds(360, 500, 250, 30);
        l17.setFont(new Font("Tohoma", Font.BOLD, 16));
        l17.setForeground(Color.RED);
        add(l17);
        JLabel l18 = new JLabel("Phone:");
        l18.setBounds(40, 560, 200, 30);
        l18.setFont(new Font("Tohoma", Font.BOLD, 18));
        add(l18);

        l19 = new JLabel();
        l19.setBounds(360, 560, 250, 30);
        l19.setFont(new Font("Tohoma", Font.BOLD, 16));
        l19.setForeground(Color.RED);
        add(l19);
        JLabel l20 = new JLabel("Total Cost:");
        l20.setBounds(40, 620, 200, 30);
        l20.setFont(new Font("Tohoma", Font.BOLD, 18));
        add(l20);

        l21 = new JLabel();
        l21.setBounds(360, 620, 250, 30);
        l21.setFont(new Font("Tohoma", Font.BOLD, 16));
        l21.setForeground(Color.RED);
        add(l21);

        b1 = new JButton("Delete Booking");
        b1.setBounds(620, 580, 150, 30);
        b1.setForeground(Color.cyan);
        b1.setBackground(Color.black);
        b1.setFont(new Font("Tohoma", Font.BOLD, 16));
        b1.addActionListener(this);
        add(b1);

        b2 = new JButton("Back");
        b2.setBounds(820, 580, 150, 30);
        b2.setForeground(Color.cyan);
        b2.setBackground(Color.black);
        b2.setFont(new Font("Tohoma", Font.BOLD, 16));
        b2.addActionListener(this);
        add(b2);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icons/bookedDetails.jpg"));
        Image i2 = i1.getImage().getScaledInstance(530, 500, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel i4 = new JLabel(i3);
        i4.setBounds(530, 40, 530, 500);
        add(i4);

        try {
            conn c = new conn();
            String sql = "Select * from bookhotel where username='" + user + "'";
            ResultSet rs = c.s.executeQuery(sql);
            while (rs.next()) {
                l3.setText(rs.getString("username"));
                l5.setText(rs.getString("hotel"));
                l7.setText(rs.getString("persons"));
                l9.setText(rs.getString("days"));
                l11.setText(rs.getString("ac"));
                l13.setText(rs.getString("food"));
                l15.setText(rs.getString("id"));
                l17.setText(rs.getString("number"));
                l19.setText(rs.getString("phone"));
                l21.setText(rs.getString("cost"));

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b1) {
            try {
                int a = JOptionPane.showConfirmDialog(this, "Are you sure ? ");
                if (a == JOptionPane.YES_OPTION) {
                    conn c = new conn();
                    String sql1 = "Delete from bookhotel where username='" + user + "'";
                    c.s.executeUpdate(sql1);
                    JOptionPane.showMessageDialog(null, "Hotel Booking Deleted Successfully ");
                    l3.setText("");
                    l5.setText("");
                    l7.setText("");
                    l9.setText("");
                    l11.setText("");
                    l13.setText("");
                    l15.setText("");
                    l17.setText("");
                    l19.setText("");
                    l21.setText("");
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (ae.getSource() == b2) {
            this.setVisible(false);
        }
    }

    public static void main(String args[]) {
        new viewbookedhotel("").setVisible(true);
    }
}
