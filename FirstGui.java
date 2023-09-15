package GUI;

import javax.swing.*;
public class FirstGui  extends JFrame{
    FirstGui(){
        JFrame f= new JFrame("JFrame Example");
        JButton b=new JButton("Button1");
      //  JButton b2=new JButton("Button2");
       JLabel l =new JLabel("JFrame by Example");
       f.add(l);
        JPanel p =new JPanel();
        p.add(l);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        b.setSize(200,300);
    f.add(p);

        f.setVisible(true);
// default layout manager called by JPanel.

        p.add(b);
        //P.add(b2);

        f.setSize(500  ,600);

    }
    public static void main(String[] args) {
new FirstGui();
    }
}
