
package travel.management.system;
import java.awt.Color;
import java.awt.*;
import javax.swing.*;

public class loading extends JFrame implements Runnable{
    JProgressBar p;
   String username;
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
                    new dashboard(username).setVisible(true);
        }catch(Exception e){
            
        }
    }
    
    loading(String user){
        username=user;
        t=new Thread(this);
        
    setLayout(null);
    setBounds(450, 150, 800, 500);
    getContentPane().setBackground(Color.cyan);
    setVisible(true);
    
    JLabel l1=new JLabel("Travel And Tourism Management ");
    l1.setBounds(90, 30, 600, 50);
    l1.setFont(new Font("Raleway", Font.BOLD, 37));
    l1.setForeground(Color.BLUE);
    add(l1);
    
    p = new JProgressBar();
    p.setBounds(200, 110,400,35);
    p.setStringPainted(true);
    p.setForeground(Color.BLUE);
    add(p);
   
        
    JLabel l2=new JLabel("Please Wait...");
    l2.setBounds(350, 150,150,30);
    l2.setFont(new Font("Tohoma", Font.BOLD, 18));
    l2.setForeground(Color.RED);
    add(l2);
    
        
    JLabel l3=new JLabel("Welcome  " + username);
    l3.setBounds(20, 400,200,40);
    l3.setFont(new Font("Tohoma", Font.BOLD, 22));
    l3.setForeground(Color.RED);
    add(l3);
    
    t.start();
    
    }
    public static void main(String args[]){
        new loading("").setVisible(true);
    }
}
