
import javax.swing.*;

class Q6 {

    public static void main(String[] args) {

        JFrame f = new JFrame("Simple Calculator");

        JLabel l1 = new JLabel("First Number:");
        l1.setBounds(40, 40, 100, 30);
        f.add(l1);

        JTextField t1 = new JTextField();
        t1.setBounds(150, 40, 150, 30);
        f.add(t1);

        JLabel l2 = new JLabel("Second Number:");
        l2.setBounds(40, 90, 100, 30);
        f.add(l2);

        JTextField t2 = new JTextField();
        t2.setBounds(150, 90, 150, 30);
        f.add(t2);

        JButton b1 = new JButton("Add");
        b1.setBounds(60, 150, 100, 30);
        f.add(b1);

        JButton b2 = new JButton("Subtract");
        b2.setBounds(180, 150, 100, 30);
        f.add(b2);

        JLabel result = new JLabel("Result: ");
        result.setBounds(40, 200, 250, 30);
        f.add(result);

        b1.addActionListener(e -> {
            try {
                int n1 = Integer.parseInt(t1.getText());
                int n2 = Integer.parseInt(t2.getText());

                result.setText("Result: " + (n1 + n2));

            } catch (NumberFormatException ex) {
                result.setText("Enter valid integers!");
            }
        });

        b2.addActionListener(e -> {
            try {
                int n1 = Integer.parseInt(t1.getText());
                int n2 = Integer.parseInt(t2.getText());

                result.setText("Result: " + (n1 - n2));

            } catch (NumberFormatException ex) {
                result.setText("Enter valid integers!");
            }
        });

        f.setLayout(null);
        f.setSize(360, 300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
