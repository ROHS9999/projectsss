package travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class dashboard extends JFrame implements ActionListener {

    JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15;
    String user;

    dashboard(String username) {
        this.user = username;
        setExtendedState(JFrame.MAXIMIZED_BOTH);

        JLabel l4 = new JLabel("Travel and Tourism Management System");
        l4.setBounds(480, 65, 900, 60);
        l4.setFont(new Font("Tohoma", Font.BOLD, 40));
        l4.setForeground(Color.cyan);

        add(l4);
        JPanel p1 = new JPanel();
        p1.setLayout(null);
        p1.setBounds(0, 0, 1950, 60);
        p1.setBackground(new Color(0, 0, 102));
        add(p1);

        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icons/login.png"));
        Image i5 = i4.getImage().getScaledInstance(40, 40, Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel l3 = new JLabel(i6);
        l3.setBounds(10, 10, 40, 40);
        p1.add(l3);

        JLabel l2 = new JLabel("Dashboard");
        l2.setFont(new Font("Raleway", Font.BOLD, 31));
        l2.setBounds(70, 10, 200, 30);
        l2.setForeground(Color.WHITE);
        p1.add(l2);

        JPanel p2 = new JPanel();
        p2.setLayout(null);
        p2.setBounds(0, 60, 270, 1000);
        p2.setBackground(new Color(0, 0, 102));
        add(p2);

        b1 = new JButton("Add Personal Details");
        b1.setBounds(0, 0, 270, 50);
        b1.setForeground(Color.WHITE);
        b1.setBackground(new Color(0, 0, 102));
        b1.setFont(new Font("Tohoma", Font.PLAIN, 17));
        b1.setMargin(new Insets(0, 0, 0, 60));
        b1.addActionListener(this);
        p2.add(b1);

        b2 = new JButton("Update Personal Details");
        b2.setBounds(0, 50, 270, 50);
        b2.setForeground(Color.WHITE);
        b2.setBackground(new Color(0, 0, 102));
        b2.setFont(new Font("Tohoma", Font.PLAIN, 17));
        b2.setMargin(new Insets(0, 0, 0, 40));
        b2.addActionListener(this);
        p2.add(b2);

        b3 = new JButton("View Details");
        b3.setBounds(0, 100, 270, 50);
        b3.setForeground(Color.WHITE);
        b3.setBackground(new Color(0, 0, 102));
        b3.setFont(new Font("Tohoma", Font.PLAIN, 17));
        b3.setMargin(new Insets(0, 0, 0, 126));
        b3.addActionListener(this);
        p2.add(b3);

        b4 = new JButton("Delete Personal Details");
        b4.setBounds(0, 150, 270, 50);
        b4.setForeground(Color.WHITE);
        b4.setBackground(new Color(0, 0, 102));
        b4.setFont(new Font("Tohoma", Font.PLAIN, 17));
        b4.setMargin(new Insets(0, 0, 0, 43));
        b4.addActionListener(this);
        p2.add(b4);

        b5 = new JButton("Check Package");
        b5.setBounds(0, 200, 270, 50);
        b5.setForeground(Color.WHITE);
        b5.setBackground(new Color(0, 0, 102));
        b5.setFont(new Font("Tohoma", Font.PLAIN, 17));
        b5.setMargin(new Insets(0, 0, 0, 100));
        b5.addActionListener(this);
        p2.add(b5);

        b6 = new JButton("Book Package");
        b6.setBounds(0, 250, 270, 50);
        b6.setForeground(Color.WHITE);
        b6.setBackground(new Color(0, 0, 102));
        b6.setFont(new Font("Tohoma", Font.PLAIN, 17));
        b6.setMargin(new Insets(0, 0, 0, 112));
        b6.addActionListener(this);
        p2.add(b6);

        b7 = new JButton("View Package");
        b7.setBounds(0, 300, 270, 50);
        b7.setForeground(Color.WHITE);
        b7.setBackground(new Color(0, 0, 102));
        b7.setFont(new Font("Tohoma", Font.PLAIN, 17));
        b7.setMargin(new Insets(0, 0, 0, 112));
        b7.addActionListener(this);
        p2.add(b7);

        b15 = new JButton("View Hotels");
        b15.setBounds(0, 350, 270, 50);
        b15.setForeground(Color.WHITE);
        b15.setBackground(new Color(0, 0, 102));
        b15.setFont(new Font("Tohoma", Font.PLAIN, 17));
        b15.setMargin(new Insets(0, 0, 0, 135));
        b15.addActionListener(this);
        p2.add(b15);

        b8 = new JButton("Book Hotel");
        b8.setBounds(0, 400, 270, 50);
        b8.setForeground(Color.WHITE);
        b8.setBackground(new Color(0, 0, 102));
        b8.setFont(new Font("Tohoma", Font.PLAIN, 17));
        b8.setMargin(new Insets(0, 0, 0, 135));
        b8.addActionListener(this);
        p2.add(b8);

        b9 = new JButton("View Booked Hotel");
        b9.setBounds(0, 450, 270, 50);
        b9.setForeground(Color.WHITE);
        b9.setBackground(new Color(0, 0, 102));
        b9.setFont(new Font("Tohoma", Font.PLAIN, 17));
        b9.setMargin(new Insets(0, 0, 0, 78));
        b9.addActionListener(this);
        p2.add(b9);

        b10 = new JButton("Destinations");
        b10.setBounds(0, 500, 270, 50);
        b10.setForeground(Color.WHITE);
        b10.setBackground(new Color(0, 0, 102));
        b10.setFont(new Font("Tohoma", Font.PLAIN, 17));
        b10.setMargin(new Insets(0, 0, 0, 124));
        b10.addActionListener(this);
        p2.add(b10);

        b11 = new JButton("Payment");
        b11.setBounds(0, 550, 270, 50);
        b11.setForeground(Color.WHITE);
        b11.setBackground(new Color(0, 0, 102));
        b11.setFont(new Font("Tohoma", Font.PLAIN, 17));
        b11.setMargin(new Insets(0, 0, 0, 152));
        b11.addActionListener(this);
        p2.add(b11);

        b12 = new JButton("Calculator");
        b12.setBounds(0, 600, 270, 50);
        b12.setForeground(Color.WHITE);
        b12.setBackground(new Color(0, 0, 102));
        b12.setFont(new Font("Tohoma", Font.PLAIN, 17));
        b12.setMargin(new Insets(0, 0, 0, 143));
        b12.addActionListener(this);
        p2.add(b12);

        b13 = new JButton("About Software");
        b13.setBounds(0, 650, 320, 50);
        b13.setForeground(Color.WHITE);
        b13.setBackground(new Color(0, 0, 102));
        b13.setFont(new Font("Tohoma", Font.PLAIN, 17));
        b13.setMargin(new Insets(0, 0, 0, 152));
        b13.addActionListener(this);
        p2.add(b13);

        b14 = new JButton("Exit");
        b14.setBounds(0, 700, 270, 50);
        b14.setForeground(Color.WHITE);
        b14.setBackground(new Color(0, 0, 102));
        b14.setFont(new Font("Tohoma", Font.PLAIN, 17));
        b14.setMargin(new Insets(0, 0, 0, 186));
        b14.addActionListener(this);
        p2.add(b14);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icons/hotel2.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1700, 850, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        l1.setSize(1700, 850);
        add(l1);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b12) {
            try {
                Runtime.getRuntime().exec("calc.exe");
            } catch (Exception e) {

            }
        } else if (ae.getSource() == b1) {
            new addcustomer(user).setVisible(true);
        } else if (ae.getSource() == b2) {
            new updatecustomer(user).setVisible(true);
        } else if (ae.getSource() == b3) {
            new viewcustomer(user).setVisible(true);
        } else if (ae.getSource() == b5) {
            new checkpackage().setVisible(true);
        } else if (ae.getSource() == b6) {
            new bookpackage(user).setVisible(true);
        } else if (ae.getSource() == b7) {
            new viewpackage(user).setVisible(true);
        } else if (ae.getSource() == b15) {
            new viewhotels().setVisible(true);
        } else if (ae.getSource() == b10) {
            new destinations().setVisible(true);
        } else if (ae.getSource() == b8) {
            new bookhotel(user).setVisible(true);
        } else if (ae.getSource() == b9) {
            new viewbookedhotel(user).setVisible(true);
        } else if (ae.getSource() == b14) {
            int a=JOptionPane.showConfirmDialog(this,"Are you sure to close software? ");
            if(a == JOptionPane.YES_OPTION){
            System.exit(0);
            }
        } else if (ae.getSource() == b4) {
            new deletecustomer(user).setVisible(true);
        } else if (ae.getSource() == b11) {
            new payment().setVisible(true);
        }else if (ae.getSource() == b13) {
            new about().setVisible(true);
        }
        

    }

    public static void main(String args[]) {
        new dashboard("").setVisible(true);
    }
}
