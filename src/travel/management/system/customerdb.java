package travel.management.system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class customerdb extends JFrame implements ActionListener {

    JTable t1;
    JButton b1;
    String x[] = {"Username", "Id", "Id number", "Name", "Gender", "Country", "Address", "Mobile Number", "Email"};
    String y[][] = new String[40][9];
    int i = 0, j = 0;

    customerdb() {
        super("Customers Details");
        setSize(1200, 650);
        setLocation(270, 130);

        try {
            conn c1 = new conn();
            String s1 = "select * from customer";
            ResultSet rs = c1.s.executeQuery(s1);
            while (rs.next()) {
                y[i][j++] = rs.getString("username");
                y[i][j++] = rs.getString("id");
                y[i][j++] = rs.getString("number");
                y[i][j++] = rs.getString("name");
                y[i][j++] = rs.getString("gender");
                y[i][j++] = rs.getString("country");
                y[i][j++] = rs.getString("address");
                y[i][j++] = rs.getString("phone");
                y[i][j++] = rs.getString("email");
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
        new customerdb().setVisible(true);
    }

}
