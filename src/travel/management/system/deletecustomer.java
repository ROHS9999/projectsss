package travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;

public class deletecustomer extends JFrame implements ActionListener {

    JButton b1, b2;
    JLabel l11, l12, l13, l14, l15, l16, l17, l18, l19;
    String user;

    deletecustomer(String username) {
        this.user = username;
        setBounds(420, 100, 920, 650);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel head = new JLabel("Delete Customer Details");
        head.setBounds(50, 0, 400, 30);
        head.setFont(new Font("Tohoma", Font.BOLD, 25));
        head.setForeground(Color.BLUE);
        add(head);

        JLabel l1 = new JLabel("Username :");
        l1.setBounds(70, 60, 150, 30);
        l1.setFont(new Font("Tohoma", Font.BOLD, 18));
        add(l1);

        l11 = new JLabel();
        l11.setBounds(280, 60, 200, 30);
        l11.setFont(new Font("Tohoma", Font.BOLD, 16));
        add(l11);

        JLabel l2 = new JLabel("ID :");
        l2.setBounds(70, 110, 150, 30);
        l2.setFont(new Font("Tohoma", Font.BOLD, 18));
        add(l2);

        l12 = new JLabel();
        l12.setBounds(280, 110, 200, 30);
        l12.setFont(new Font("Tohoma", Font.BOLD, 16));
        add(l12);

        JLabel l3 = new JLabel("Number :");
        l3.setBounds(70, 160, 150, 30);
        l3.setFont(new Font("Tohoma", Font.BOLD, 18));
        add(l3);

        l13 = new JLabel();
        l13.setBounds(280, 160, 200, 30);
        l13.setFont(new Font("Tohoma", Font.BOLD, 16));
        add(l13);

        JLabel l4 = new JLabel("Name :");
        l4.setBounds(70, 210, 150, 30);
        l4.setFont(new Font("Tohoma", Font.BOLD, 18));
        add(l4);

        l14 = new JLabel();
        l14.setBounds(280, 210, 200, 30);
        l14.setFont(new Font("Tohoma", Font.BOLD, 16));
        add(l14);

        JLabel l5 = new JLabel("Gender :");
        l5.setBounds(70, 260, 150, 30);
        l5.setFont(new Font("Tohoma", Font.BOLD, 18));
        add(l5);

        l15 = new JLabel();
        l15.setBounds(280, 260, 200, 30);
        l15.setFont(new Font("Tohoma", Font.BOLD, 16));
        add(l15);

        JLabel l6 = new JLabel("Country:");
        l6.setBounds(70, 310, 150, 30);
        l6.setFont(new Font("Tohoma", Font.BOLD, 18));
        add(l6);

        l16 = new JLabel();
        l16.setBounds(280, 310, 200, 30);
        l16.setFont(new Font("Tohoma", Font.BOLD, 16));
        add(l16);

        JLabel l7 = new JLabel("Address:");
        l7.setBounds(70, 360, 150, 30);
        l7.setFont(new Font("Tohoma", Font.BOLD, 18));
        add(l7);

        l17 = new JLabel();
        l17.setBounds(280, 360, 200, 30);
        l17.setFont(new Font("Tohoma", Font.BOLD, 16));
        add(l17);

        JLabel l8 = new JLabel("Phone:");
        l8.setBounds(70, 410, 150, 30);
        l8.setFont(new Font("Tohoma", Font.BOLD, 18));
        add(l8);

        l18 = new JLabel();
        l18.setBounds(280, 410, 200, 30);
        l18.setFont(new Font("Tohoma", Font.BOLD, 16));
        add(l18);

        JLabel l9 = new JLabel("Email:");
        l9.setBounds(70, 460, 150, 30);
        l9.setFont(new Font("Tohoma", Font.BOLD, 18));
        add(l9);

        l19 = new JLabel();
        l19.setBounds(280, 460, 200, 30);
        l19.setFont(new Font("Tohoma", Font.BOLD, 16));
        add(l19);

        b1 = new JButton("Delete");
        b1.setBounds(50, 530, 110, 30);
        b1.setFont(new Font("Raleway", Font.BOLD, 18));
        b1.setForeground(Color.white);
        b1.setBackground(Color.BLUE);
        b1.addActionListener(this);
        add(b1);

        b2 = new JButton("Back");
        b2.setBounds(230, 530, 110, 30);
        b2.setFont(new Font("Raleway", Font.BOLD, 18));
        b2.setForeground(Color.white);
        b2.setBackground(Color.BLUE);
        b2.addActionListener(this);
        add(b2);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icons/delete.png"));
        Image i2 = i1.getImage().getScaledInstance(400, 400, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l21 = new JLabel(i3);
        l21.setBounds(400, 70, 400, 400);
        add(l21);

        try {
            conn c = new conn();
            ResultSet rs = c.s.executeQuery("select * from customer where username='" + user + "' ");

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
            e.printStackTrace();
        }
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b1) {
            int a = JOptionPane.showConfirmDialog(this, "Are you sure to delete customer details ?");
            if (a == JOptionPane.YES_OPTION) {

                try {
                    conn c = new conn();
                    c.s.executeUpdate("Delete from customer where username='" + user + "'");
                    JOptionPane.showMessageDialog(null, "Customer Details Deleted Succesfully ");

                    l11.setText("");
                    l12.setText("");
                    l13.setText("");
                    l14.setText("");
                    l15.setText("");
                    l16.setText("");
                    l17.setText("");
                    l18.setText("");
                    l19.setText("");

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } else if (ae.getSource() == b2) {
            this.setVisible(false);

        }
    }

    public static void main(String args[]) {
        new deletecustomer("").setVisible(true);
    }
}
