
import javax.swing.*;

class Q7 {

    public static void main(String[] args) {

        JFrame f = new JFrame("Login Form");

        JLabel l1 = new JLabel("Username:");
        l1.setBounds(50, 50, 100, 30);
        f.add(l1);

        JTextField t1 = new JTextField();
        t1.setBounds(150, 50, 150, 30);
        f.add(t1);

        JLabel l2 = new JLabel("Password:");
        l2.setBounds(50, 100, 100, 30);
        f.add(l2);

        JPasswordField t2 = new JPasswordField();
        t2.setBounds(150, 100, 150, 30);
        f.add(t2);

        JButton b = new JButton("Login");
        b.setBounds(120, 150, 100, 30);
        f.add(b);

        JLabel result = new JLabel("");
        result.setBounds(50, 200, 300, 30);
        f.add(result);

        b.addActionListener(e -> {
            String username = t1.getText();
            String password = new String(t2.getPassword());

            if (username.equals("admin")
                    && password.equals("1234")) {
                result.setText("Login Successful!");
            } else {
                result.setText("Invalid username or password!");
            }
        });

        f.setLayout(null);
        f.setSize(380, 300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
