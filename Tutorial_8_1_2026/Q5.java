
import javax.swing.*;

class Q5 {

    public static void main(String[] args) {

        JFrame f = new JFrame("Addition");

        JLabel l1 = new JLabel("First Number:");
        l1.setBounds(50, 50, 100, 30);
        f.add(l1);

        JTextField t1 = new JTextField();
        t1.setBounds(160, 50, 150, 30);
        f.add(t1);

        JLabel l2 = new JLabel("Second Number:");
        l2.setBounds(50, 100, 100, 30);
        f.add(l2);

        JTextField t2 = new JTextField();
        t2.setBounds(160, 100, 150, 30);
        f.add(t2);

        JButton b = new JButton("Add");
        b.setBounds(120, 150, 100, 30);
        f.add(b);

        JLabel result = new JLabel("Sum: ");
        result.setBounds(50, 200, 250, 30);
        f.add(result);

        b.addActionListener(e -> {
            try {
                int n1 = Integer.parseInt(t1.getText());
                int n2 = Integer.parseInt(t2.getText());

                int sum = n1 + n2;
                result.setText("Sum: " + sum);

            } catch (NumberFormatException ex) {
                result.setText("Enter valid integers!");
            }
        });

        f.setLayout(null);
        f.setSize(380, 300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
