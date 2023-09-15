import javax.swing.*;

public class ChatFrame extends JFrame {
    private JButton Help;
    public static void main(String[] args) {
        JFrame frame = new JFrame("Chat Frame");

        frame.setVisible(true);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setLayout(frame.getLayout());
        frame.setSize(400,500);
        JButton b1 = new JButton();
        JButton b2 = new JButton("Help");
        JPanel panel = new JPanel();
        b1.addActionListener(b1.getAction());
        b1.setText("File");
        frame.add(b1);

        frame.add(b2);
        panel.add(b1);
        panel.add(b2);



    }
    }

