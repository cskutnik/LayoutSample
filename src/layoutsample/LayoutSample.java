package layoutsample;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.*;

public class LayoutSample {
    static JFrame f = new JFrame("Sample Layout");
    static JPanel p1;
    static JPanel p2;
    static JPanel p3;
    static JButton bt1;
    static JButton bt2;
    static JButton bt3;
    static JButton bt4;
    static JButton bt5;
    
    public static void main(String[] args) {
        p1 = new JPanel();
        p2 = new JPanel();
        p3 = new JPanel();
        p1.setLayout(new BorderLayout());
        p2.setLayout(new FlowLayout());
        p3.setLayout(null);
        //implement interface
        bt1 = new JButton("Button 1");
        bt2 = new JButton("Button 2");
        bt3 = new JButton("Button 3");
        bt4 = new JButton("Button 4");
        bt5 = new JButton("Button 5");
        
        //implement interface to Panel
        //p1.add(bt1, BorderLayout.NORTH);
        //p1.add(bt2, BorderLayout.WEST);
        //p1.add(bt3, BorderLayout.EAST);
        //p1.add(bt4, BorderLayout.SOUTH);
        //p1.add(bt5, BorderLayout.CENTER);
        p2.add(bt1);
        p2.add(bt2);
        p2.add(bt3);
        p2.add(bt4);
        p2.add(bt5);
        p1.add(p2, BorderLayout.NORTH);
        f.add(p1);
        
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setResizable(true);
        f.setSize(400, 400);
        f.setLocation(350, 150);
        f.setVisible(true);       
    }
    
}
