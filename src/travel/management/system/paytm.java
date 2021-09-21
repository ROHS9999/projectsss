package travel.management.system;

import javax.swing.*;
import java.awt.*;
import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.scene.*;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import java.awt.event.*;

public class paytm extends JFrame implements Runnable, ActionListener {

    private WebEngine webEngine;
    private JFXPanel panel;
    JButton b1;

    public void run() {
        setTitle("Paytm Payment Interface");
        setVisible(true);
        setBounds(320, 100, 1200, 680);

        panel = new JFXPanel();
        add(panel);

        b1 = new JButton("Back");
        b1.setBounds(10, 10, 80, 38);
        b1.addActionListener(this);
        b1.setFont(new Font("Tohoma", Font.BOLD, 16));
        b1.setBackground(Color.BLUE);
        b1.setForeground(Color.CYAN);
        panel.add(b1);

        Platform.runLater(() -> {
            WebView view = new WebView();
            view.getEngine().load("http://www.paytm.com/credit-card-bill-payment");

            panel.setScene(new Scene(view));
        });
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b1) {
            this.setVisible(false);
           new payment().setVisible(true);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new paytm());
    }

}
