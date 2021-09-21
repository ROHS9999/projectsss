package travel.management.system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class bookedpackagedb extends JFrame implements ActionListener {

    JTable t1;
    JButton b1;
    String x[] = {"Username", "Package Name", "Total Persons", "Id", "Id Number", "Mobile Number", "Total Booking Amount"};
    String y[][] = new String[40][7];
    int i = 0, j = 0;

    bookedpackagedb() {
        super("Customers Booked Package Details");
        setSize(1200, 650);
        setLocation(270, 130);

        try {
            conn c1 = new conn();
            String s1 = "select * from bookpackage";
            ResultSet rs = c1.s.executeQuery(s1);
            while (rs.next()) {
                y[i][j++] = rs.getString("username");
                y[i][j++] = rs.getString("package");
                y[i][j++] = rs.getString("persons");
                y[i][j++] = rs.getString("id");
                y[i][j++] = rs.getString("number");
                y[i][j++] = rs.getString("phone");
                y[i][j++] = rs.getString("price");
                i++;
                j = 0;
            }
            t1 = new JTable(y, x);

        } catch (Exception e) {
            e.printStackTrace();
        }

        b1 = new JButton("Print");
        add(b1, "South");
        JScrollPane sp = new JScrollPane(t1);
        add(sp);
        b1.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae) {
        try {
            t1.print();
        } catch (Exception e) {
        }
    }

    public static void main(String[] args) {
        new bookedpackagedb().setVisible(true);
    }

}
