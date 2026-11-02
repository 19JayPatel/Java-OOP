
import javax.swing.*;

class Q8 {

    public static void main(String[] args) {

        JFrame f = new JFrame("Even or Odd");

        JLabel l = new JLabel("Enter an integer:");
        l.setBounds(50, 50, 120, 30);
        f.add(l);

        JTextField t = new JTextField();
        t.setBounds(180, 50, 120, 30);
        f.add(t);

        JButton b = new JButton("Check");
        b.setBounds(120, 100, 100, 30);
        f.add(b);

        JLabel result = new JLabel("Result: ");
        result.setBounds(50, 150, 250, 30);
        f.add(result);

        b.addActionListener(e -> {
            try {
                int n = Integer.parseInt(t.getText());

                if (n % 2 == 0) {
                    result.setText("The number is Even");
                } else {
                    result.setText("The number is Odd");
                }

            } catch (NumberFormatException ex) {
                result.setText("Enter a valid integer!");
            }
        });

        f.setLayout(null);
        f.setSize(380, 250);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
