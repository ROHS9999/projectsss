
package travel.management.system;
import java.awt.Color;
import java.awt.*;
import javax.swing.*;

public class splash1 extends JFrame implements Runnable{
    JProgressBar p;
    Thread t;
    public void run(){
        int i;
        try{
            for( i = 1 ; i<=101 ; i++ ){
                int m=p.getMaximum();
                int n=p.getMinimum();
                if(n < m){
                    p.setValue(p.getValue() + 1);
                   
                }
                else{
                   //nothing
                }
                   
                Thread.sleep(50);
            }
                    i=101;
                    this.setVisible(false);
                    new maindashboard().setVisible(true);
                   
        }catch(Exception e){
            
        }
    }
    
    splash1(){
     
        t=new Thread(this);
        
    setLayout(null);
    setBounds(200, 50, 1100, 600);
    
     ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icons/hotel2.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1100, 600, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l11 = new JLabel(i3);
        l11.setBounds(0,0,1100,600);
        getContentPane().add(l11);
        
        getContentPane().setBackground(Color.yellow);
    setVisible(true);
    
    JLabel l1=new JLabel(" Welcome To Travel And Tourism Management System ");
    l1.setBounds(60, 30, 1000, 50);
    l1.setFont(new Font("Raleway", Font.BOLD, 37));
    l1.setForeground(Color.white);
    l11.add(l1);
    
    p = new JProgressBar();
    p.setBounds(300, 150,500,45);
    p.setStringPainted(true);
    p.setForeground(Color.BLUE);
    l11.add(p);
   
        
    JLabel l2=new JLabel("Please Wait...");
    l2.setBounds(60, 500,300,30);
    l2.setFont(new Font("Tohoma", Font.BOLD, 28));
    l2.setForeground(Color.CYAN);
    l11.add(l2);
    
    
    
    t.start();
    
    }
    public static void main(String args[]){
        new splash1().setVisible(true);
    }
}
