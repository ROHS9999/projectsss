package travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class bookhotel extends JFrame implements ActionListener {

    JLabel l3, l10, l12, l14, l16;
    Choice ch1, ch2, ch3;
    JTextField t1, t2;

    JButton b1, b2, b3;

    bookhotel(String user) {
        setBounds(320, 100, 1200, 720);
        getContentPane().setBackground(Color.white);
        setLayout(null);

        JLabel l1 = new JLabel("BOOK HOTEL");
        l1.setBounds(140, 10, 400, 30);
        l1.setFont(new Font("Tohoma", Font.BOLD, 25));
        l1.setForeground(Color.blue);
        add(l1);

        JLabel l2 = new JLabel("Username:");
        l2.setBounds(40, 60, 200, 30);
        l2.setFont(new Font("Tohoma", Font.BOLD, 18));
        add(l2);

        l3 = new JLabel();
        l3.setBounds(320, 60, 250, 30);
        l3.setFont(new Font("Tohoma", Font.PLAIN, 16));
        add(l3);

        JLabel l4 = new JLabel("Select Hotel");
        l4.setBounds(40, 110, 200, 30);
        l4.setFont(new Font("Tohoma", Font.BOLD, 18));
        add(l4);

        ch1 = new Choice();
        try {
            conn c = new conn();
            ResultSet rs = c.s.executeQuery("Select * from hotel");
            while (rs.next()) {
                ch1.add(rs.getString("name"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        ch1.setBounds(320, 110, 220, 30);
        ch1.setFont(new Font("Tohoma", Font.PLAIN, 16));
        add(ch1);

        JLabel l5 = new JLabel("Total Persons:");
        l5.setBounds(40, 160, 200, 30);
        l5.setFont(new Font("Tohoma", Font.BOLD, 18));
        add(l5);

        t1 = new JTextField();
        t1.setBounds(320, 160, 220, 30);
        t1.setFont(new Font("Tohoma", Font.PLAIN, 16));
        add(t1);

        JLabel l6 = new JLabel("No. of Days:");
        l6.setBounds(40, 220, 200, 30);
        l6.setFont(new Font("Tohoma", Font.BOLD, 18));
        add(l6);

        t2 = new JTextField();
        t2.setBounds(320, 220, 220, 30);
        t2.setFont(new Font("Tohoma", Font.PLAIN, 16));
        add(t2);

        JLabel l7 = new JLabel("AC/Non-AC:");
        l7.setBounds(40, 280, 200, 30);
        l7.setFont(new Font("Tohoma", Font.BOLD, 18));
        add(l7);

        ch2 = new Choice();
        ch2.add("Yes");
        ch2.add("No");
        ch2.setBounds(320, 280, 220, 30);
        ch2.setFont(new Font("Tohoma", Font.PLAIN, 16));
        add(ch2);

        JLabel l8 = new JLabel("Food Included:");
        l8.setBounds(40, 340, 200, 30);
        l8.setFont(new Font("Tohoma", Font.BOLD, 18));
        add(l8);

        ch3 = new Choice();
        ch3.add("Yes");
        ch3.add("No");
        ch3.setBounds(320, 340, 220, 30);
        ch3.setFont(new Font("Tohoma", Font.PLAIN, 16));
        add(ch3);

        JLabel l9 = new JLabel("ID:");
        l9.setBounds(40, 390, 200, 30);
        l9.setFont(new Font("Tohoma", Font.BOLD, 18));
        add(l9);

        l10 = new JLabel();
        l10.setBounds(320, 390, 250, 30);
        l10.setFont(new Font("Tohoma", Font.PLAIN, 16));
        add(l10);

        JLabel l11 = new JLabel("Number:");
        l11.setBounds(40, 450, 200, 30);
        l11.setFont(new Font("Tohoma", Font.BOLD, 18));
        add(l11);

        l12 = new JLabel();
        l12.setBounds(320, 450, 250, 30);
        l12.setFont(new Font("Tohoma", Font.PLAIN, 16));
        add(l12);

        JLabel l13 = new JLabel("Phone:");
        l13.setBounds(40, 510, 200, 30);
        l13.setFont(new Font("Tohoma", Font.BOLD, 18));
        add(l13);

        l14 = new JLabel();
        l14.setBounds(320, 510, 250, 30);
        l14.setFont(new Font("Tohoma", Font.PLAIN, 16));
        add(l14);

        JLabel l15 = new JLabel("Total Price:");
        l15.setBounds(40, 570, 200, 30);
        l15.setFont(new Font("Tohoma", Font.BOLD, 18));
        add(l15);

        l16 = new JLabel();
        l16.setBounds(320, 570, 250, 30);
        l16.setFont(new Font("Tohoma", Font.PLAIN, 16));
        add(l16);

        b1 = new JButton("Check Price");
        b1.setBounds(60, 630, 150, 30);
        b1.setFont(new Font("Tohoma", Font.BOLD, 17));
        b1.setBackground(Color.BLUE);
        b1.setForeground(Color.cyan);
        b1.addActionListener(this);
        add(b1);

        b2 = new JButton("Book");
        b2.setBounds(240, 630, 150, 30);
        b2.setFont(new Font("Tohoma", Font.BOLD, 17));
        b2.setBackground(Color.BLUE);
        b2.setForeground(Color.cyan);
        b2.addActionListener(this);
        add(b2);

        b3 = new JButton("Back");
        b3.setBounds(420, 630, 150, 30);
        b3.setFont(new Font("Tohoma", Font.BOLD, 17));
        b3.setBackground(Color.BLUE);
        b3.setForeground(Color.cyan);
        b3.addActionListener(this);
        add(b3);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icons/book.jpg"));
        Image i2 = i1.getImage().getScaledInstance(580, 530, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel i4 = new JLabel(i3);
        i4.setBounds(580, 40, 580, 530);
        add(i4);

        try {
            conn c = new conn();
            String sql = "Select * from customer where username='"+user+"'";
            ResultSet rs = c.s.executeQuery(sql);
            while (rs.next()) {
                l3.setText(rs.getString("username"));
                l10.setText(rs.getString("id"));
                l12.setText(rs.getString("number"));
                l14.setText(rs.getString("phone"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b1) {
            try {
                conn c = new conn();
                ResultSet rs = c.s.executeQuery("Select * from hotel where name='" + ch1.getSelectedItem() + "'");
                while (rs.next()) {
                    int cost = Integer.parseInt(rs.getString("cost_per_day"));
                    int food = Integer.parseInt(rs.getString("food_charges"));
                    int ac = Integer.parseInt(rs.getString("ac_charges"));

                    int persons = Integer.parseInt(t1.getText());
                    int days = Integer.parseInt(t2.getText());

                    String acprice = ch2.getSelectedItem();
                    String foodprice = ch3.getSelectedItem();

                    if (persons * days > 0) {
                        int total = 0;
                        total += acprice.equals("Yes") ? ac : 0;
                        total += foodprice.equals("Yes") ? food : 0;
                        total += cost;
                        total = total * persons * days;

                        l16.setText("" + total);
                    } else {
                        l16.setText("");
                        JOptionPane.showMessageDialog(null, "Please enter valid details");
                    }

                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (ae.getSource() == b2) {
            try{
                conn c=new conn();
                c.s.executeUpdate("insert into bookhotel values('"+l3.getText()+"','"+ch1.getSelectedItem()+"','"+t1.getText()+"','"+t2.getText()+"','"+ch2.getSelectedItem()+"','"+ch3.getSelectedItem()+"','"+l10.getText()+"','"+l12.getText()+"','"+l14.getText()+"','"+l16.getText()+"')");
                  JOptionPane.showMessageDialog(null, "Hotel Booked Successfully");
                  this.setVisible(false);
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, "Please enter valid details");
                e.printStackTrace();
            }
        }else if(ae.getSource() == b3){
            this.setVisible(false);
        }
    }

    public static void main(String args[]) {
        new bookhotel("").setVisible(true);
    }
}
