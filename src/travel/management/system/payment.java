
package travel.management.system;

import java.awt.Color;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



public class payment extends JFrame implements ActionListener{
    JButton b1,b2;
    payment(){
        setBounds(320, 100, 980, 680);
        getContentPane().setBackground(Color.cyan);
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icons/paytm.jpeg"));
        Image i2 = i1.getImage().getScaledInstance(950,630, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel i4 = new JLabel(i3);
        i4.setBounds(10,10, 950, 630);
        add(i4);
        
        b1=new JButton("Pay");
        b1.setBounds(20,20,130,40);
        b1.setFont(new Font("Tohoma",Font.BOLD,16));
        b1.setBackground(Color.blue);
        b1.setForeground(Color.white);
        i4.add(b1);
        b1.addActionListener(this);
        
        b2=new JButton("Back");
        b2.setBounds(20,80,130,40);
        b2.setFont(new Font("Tohoma",Font.BOLD,16));
        b2.setBackground(Color.blue);
        b2.setForeground(Color.white);
        i4.add(b2);
        b2.addActionListener(this);
}
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == b1){  
           SwingUtilities.invokeLater(new paytm());
            this.setVisible(false);
        }else if(ae.getSource() == b2){
            this.setVisible(false);
        }
    }
    public static void main(String args[]){
        new payment().setVisible(true);
    }
}
