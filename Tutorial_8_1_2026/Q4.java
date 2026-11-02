
import javax.swing.*;

class Q4 {

    public static void main(String[] args) {

        JFrame f = new JFrame("Student Details");

        JLabel l1 = new JLabel("Name:");
        l1.setBounds(50, 50, 100, 30);
        f.add(l1);

        JTextField t1 = new JTextField();
        t1.setBounds(160, 50, 180, 30);
        f.add(t1);

        JLabel l2 = new JLabel("Enrollment No:");
        l2.setBounds(50, 100, 100, 30);
        f.add(l2);

        JTextField t2 = new JTextField();
        t2.setBounds(160, 100, 180, 30);
        f.add(t2);

        JButton b = new JButton("Display");
        b.setBounds(120, 150, 120, 30);
        f.add(b);

        JLabel result = new JLabel("");
        result.setBounds(50, 200, 320, 50);
        f.add(result);

        b.addActionListener(e -> {
            String name = t1.getText();
            String enrollment = t2.getText();

            result.setText("<html>Name: " + name
                    + "<br>Enrollment No: " + enrollment
                    + "</html>");
        });

        f.setLayout(null);
        f.setSize(420, 320);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
