package GUI;

   import javax.swing.*;
   import java.awt.*;
   import java.awt.event.ActionEvent;
   import java.awt.event.ActionListener;

   public  class GUI implements ActionListener {
   private int Clicks=0;
   private JLabel label = new JLabel();
   private JFrame frame= new JFrame();
   public GUI(){
       JButton b= new JButton();
       b.addActionListener(this);
       JPanel p =new JPanel();
       p.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));
       p.setLayout(new GridLayout(0,1));
       p.add(b);
       p.add(label);
       frame.add(p, BorderLayout.CENTER);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       b.setText("click me ");
       frame.setTitle("GUI");
       frame.pack();
       frame.setVisible(true);
   }

       @Override
       public void actionPerformed(ActionEvent e) {
           Clicks++;
           label.setText("Number of clicks: "+ Clicks);

       }
       public static void main(String [] args){
       new GUI();

       }}
