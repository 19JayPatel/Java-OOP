import javax.swing.*;

class Q1 {

    public static void main(String[] args) {

        JFrame f = new JFrame("Welcome");

        JLabel l = new JLabel("Welcome to Java Swing");
        l.setBounds(100, 100, 200, 30);

        f.add(l);
        f.setLayout(null);
        f.setSize(400, 300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
