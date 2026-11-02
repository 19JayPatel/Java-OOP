
import javax.swing.*;

class Q2 {

    public static void main(String[] args) {

        JFrame f = new JFrame("Button Example");

        JButton b = new JButton("Click Me");
        b.setBounds(120, 100, 120, 40);

        f.add(b);
        f.setLayout(null);
        f.setSize(400, 300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
