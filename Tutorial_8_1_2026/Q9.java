
import java.awt.*;
import javax.swing.*;

class Q9 {

    public static void main(String[] args) {

        JFrame f = new JFrame("Change Background Color");

        JButton b = new JButton("Change Color");
        b.setBounds(100, 100, 150, 40);

        b.addActionListener(e -> {
            f.getContentPane().setBackground(Color.BLUE);
        });

        f.add(b);
        f.setLayout(null);
        f.setSize(380, 300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
