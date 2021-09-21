
package travel.management.system;
import javax.swing.*;
import java.awt.*;

public class checkpackage extends JFrame {
    
    checkpackage(){
        setBounds(420, 100, 1000, 650);
        getContentPane().setBackground(Color.WHITE);
     
        JTabbedPane pane=new JTabbedPane();
        
        String[] package1=new String[]{"GOLD PACKAGE","6  Days  and  7 Nights","Airport   Assistance","Half  Day  City  Tour","Daily  Buffet","Welcome Drinks on Arrival","Full Day 3 Island Cruise","English Speaking Guide","BOOK NOW","SUMMER SPECIAL","RS 12000/-","package1.jpg"};
        String[] package2=new String[]{"SILVER PACKAGE","5  Days  and  6 Nights","Toll Free Entrance","Meet and Greet at Arrival","Welcome Drinks on Arrival","Night Safari","Full Day 3 Island Cruise","Cruise With Dinner","BOOK NOW","WINTER SPECIAL","RS 24000/-","package2.jpg"};
        String[] package3=new String[]{"BRONZE PACKAGE","6  Days  and  7 Nights","Return Airfare","Free Clubbing","Horse Riding & Other Games","Welcome Drinks on Arrival","Daily Buffet","Stay in 5 Star Hotel","BOOK NOW","WINTER SPECIAL","RS 32000/-","package3.jpg"};

        JPanel p1= createpackage(package1);
        
        pane.addTab("Package1", null, p1);
        
        JPanel p2=createpackage(package2);
        
        pane.addTab("Package2", null, p2);
        
        JPanel p3=createpackage(package3);
        
        pane.addTab("Package3", null, p3);
        
           add(pane, BorderLayout.CENTER);
    }
    public JPanel createpackage(String[] pack){
        JPanel p1=new JPanel();
        p1.setLayout(null);
        p1.setBackground(Color.WHITE);
        
        JLabel l1=new JLabel(pack[0]);
        l1.setBounds(40,10,330,40);
        l1.setFont(new Font("Tohoma",Font.BOLD,32));
        p1.add(l1);
        
        JLabel l2=new JLabel(pack[1]);
        l2.setBounds(40,70,300,40);
        l2.setForeground(Color.red);
        l2.setFont(new Font("Tohoma",Font.BOLD,21));
        p1.add(l2);
        
        
        JLabel l3=new JLabel(pack[2]);
        l3.setBounds(40,130,300,40);
        l3.setForeground(Color.blue);
        l3.setFont(new Font("Tohoma",Font.BOLD,21));
        p1.add(l3);
        
         JLabel l4=new JLabel(pack[3]);
        l4.setBounds(40,190,300,40);
        l4.setForeground(Color.red);
        l4.setFont(new Font("Tohoma",Font.BOLD,21));
        p1.add(l4);
        
         JLabel l5=new JLabel(pack[4]);
        l5.setBounds(40,250,300,40);
        l5.setForeground(Color.blue);
        l5.setFont(new Font("Tohoma",Font.BOLD,21));
        p1.add(l5);
        
         JLabel l6=new JLabel(pack[5]);
        l6.setBounds(40,310,300,40);
        l6.setForeground(Color.red);
        l6.setFont(new Font("Tohoma",Font.BOLD,21));
        p1.add(l6);
        
        JLabel l7=new JLabel(pack[6]);
        l7.setBounds(40,370,300,40);
        l7.setForeground(Color.blue);
        l7.setFont(new Font("Tohoma",Font.BOLD,21));
        p1.add(l7);
        
        JLabel l8=new JLabel(pack[7]);
        l8.setBounds(40,430,300,40);
        l8.setForeground(Color.red);
        l8.setFont(new Font("Tohoma",Font.BOLD,21));
        p1.add(l8);
        
        JLabel l9=new JLabel(pack[8]);
        l9.setBounds(40,510,300,40);
        l9.setForeground(Color.blue);
        l9.setFont(new Font("Tohoma",Font.BOLD,27));
        p1.add(l9);
        
        JLabel l10=new JLabel(pack[9]);
        l10.setBounds(400,530,400,40);
        l10.setForeground(Color.orange);
        l10.setFont(new Font("Tohoma",Font.BOLD,27));
        p1.add(l10);
        
        JLabel l11=new JLabel(pack[10]);
        l11.setBounds(800,530,300,40);
        l11.setForeground(Color.GRAY);
        l11.setFont(new Font("Tohoma",Font.BOLD,27));
        p1.add(l11);
    
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icons/"+pack[11]));
        Image i2=i1.getImage().getScaledInstance(550, 350, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel l12=new JLabel(i3);
        l12.setBounds(400,0,550,400);
        p1.add(l12);
        return p1;
    }
    
    public static void main(String args[]){
        new checkpackage().setVisible(true);
    }
    
}
