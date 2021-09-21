package travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class admindashboard extends JFrame implements ActionListener  {

    JButton b1, b2, b3, b4, b5;

    admindashboard() {
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLayout(null);
        JPanel p1 = new JPanel();
        p1.setLayout(null);
        p1.setBounds(0, 0, 1950, 100);
        p1.setBackground(Color.blue);
        add(p1);

        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icons/login.png"));
        Image i5 = i4.getImage().getScaledInstance(60, 60, Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel l3 = new JLabel(i6);
        l3.setBounds(0, 20, 60, 60);
        p1.add(l3);

        JLabel l4 = new JLabel("Admin Control Center");
        l4.setBounds(60, 20, 400, 60);
        l4.setFont(new Font("Raleway", Font.BOLD, 31));
        l4.setForeground(Color.white);
        p1.add(l4);

        JLabel l5 = new JLabel("Travel and Tourism Management System");
        l5.setBounds(490, 20, 900, 50);
        l5.setFont(new Font("Tohoma", Font.BOLD, 40));
        l5.setForeground(Color.YELLOW);
        p1.add(l5);

        JPanel p2 = new JPanel();
        p2.setLayout(null);
        p2.setBounds(0, 100, 270, 1000);
        p2.setBackground(Color.blue);
        add(p2);

        JPanel p3 = new JPanel();
        p3.setLayout(null);
        p3.setBounds(270, 100, 1280, 800);
        p3.setBackground(Color.pink);
        add(p3);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icons/dest2.png"));
        Image i2 = i1.getImage().getScaledInstance(1280, 800, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        l1.setSize(1280, 800);
        p3.add(l1);

        b1 = new JButton("Customers Details");
        b1.setBounds(0, 0, 270, 70);
        b1.setForeground(Color.black);
        b1.setBackground(Color.pink);
        b1.setFont(new Font("Tohoma", Font.BOLD, 23));
        b1.setMargin(new Insets(0, 0, 0, 20));
        b1.addActionListener(this);
        p2.add(b1);

        b2 = new JButton("Booked Packages");
        b2.setBounds(0, 100, 270, 70);
        b2.setForeground(Color.black);
        b2.setBackground(Color.pink);
        b2.setFont(new Font("Tohoma", Font.BOLD, 23));
        b2.setMargin(new Insets(0, 0, 0, 24));
        b2.addActionListener(this);
        p2.add(b2);

        b3 = new JButton("Hotels Details");
        b3.setBounds(0, 200, 270, 70);
        b3.setForeground(Color.black);
        b3.setBackground(Color.pink);
        b3.setFont(new Font("Tohoma", Font.BOLD, 23));
        b3.setMargin(new Insets(0, 0, 0, 65));
        b3.addActionListener(this);
        p2.add(b3);

        b4 = new JButton("Booked Hotels");
        b4.setBounds(0, 300, 270, 70);
        b4.setForeground(Color.black);
        b4.setBackground(Color.pink);
        b4.setFont(new Font("Tohoma", Font.BOLD, 23));
        b4.setMargin(new Insets(0, 0, 0, 57));
        b4.addActionListener(this);
        p2.add(b4);

        b5 = new JButton("Close Software");
        b5.setBounds(0, 400, 270, 70);
        b5.setForeground(Color.black);
        b5.setBackground(Color.pink);
        b5.setFont(new Font("Tohoma", Font.BOLD, 23));
        b5.addActionListener(this);
        b5.setMargin(new Insets(0, 0, 0, 53));
        p2.add(b5);

    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b1) {
            new customerdb().setVisible(true);
        } else if (ae.getSource() == b2) {
           new bookedpackagedb().setVisible(true);
        } else if (ae.getSource() == b3) {
           new hotelsdb().setVisible(true);
        } else if (ae.getSource() == b4) {
           new bookedhotelsdb().setVisible(true);
        }else if (ae.getSource() == b5) {
            int a=JOptionPane.showConfirmDialog(this,"Are you sure to close software? ");
            if(a == JOptionPane.YES_OPTION){
            System.exit(0);
            }
        }
           
        
    }

    public static void main(String args[]) {
        new admindashboard().setVisible(true);
    }
}
