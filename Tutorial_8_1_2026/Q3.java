
import javax.swing.*;

class Q3 {

    public static void main(String[] args) {

        JFrame f = new JFrame("Button Click Event");

        JLabel l = new JLabel("Click the button");
        l.setBounds(120, 50, 200, 30);

        JButton b = new JButton("Click Me");
        b.setBounds(120, 100, 120, 40);

        b.addActionListener(e -> {
            l.setText("Button Clicked!");
        });

        f.add(l);
        f.add(b);

        f.setLayout(null);
        f.setSize(400, 300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
