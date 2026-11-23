import javax.swing.*;

public class Q8 {

    public static void main(String args[]) {

        JFrame f = new JFrame("Create Profile");

        JLabel title = new JLabel("Registration form");
        title.setBounds(150, 30, 200, 30);
        f.add(title);

        JLabel l1 = new JLabel("Registration no:");
        l1.setBounds(50, 80, 120, 25);
        f.add(l1);

        JTextField t1 = new JTextField();
        t1.setBounds(180, 80, 100, 25);
        f.add(t1);

        JLabel l2 = new JLabel("Student name:");
        l2.setBounds(50, 120, 120, 25);
        f.add(l2);

        JTextField t2 = new JTextField();
        t2.setBounds(180, 120, 100, 25);
        f.add(t2);

        JLabel l3 = new JLabel("Batch:");
        l3.setBounds(50, 160, 120, 25);
        f.add(l3);

        JTextField t3 = new JTextField();
        t3.setBounds(180, 160, 100, 25);
        f.add(t3);

        JLabel l4 = new JLabel("Department:");
        l4.setBounds(50, 200, 120, 25);
        f.add(l4);

        JTextField t4 = new JTextField();
        t4.setBounds(180, 200, 100, 25);
        f.add(t4);

        JLabel l5 = new JLabel("Address:");
        l5.setBounds(50, 240, 120, 25);
        f.add(l5);

        JTextField t5 = new JTextField();
        t5.setBounds(180, 240, 100, 25);
        f.add(t5);

        JButton b1 = new JButton("Reset");
        b1.setBounds(90, 290, 100, 30);
        f.add(b1);

        JButton b2 = new JButton("Register");
        b2.setBounds(220, 290, 100, 30);
        f.add(b2);

        b1.addActionListener(e -> {
            t1.setText("");
            t2.setText("");
            t3.setText("");
            t4.setText("");
            t5.setText("");
        });

        f.setLayout(null);
        f.setSize(400, 390);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
