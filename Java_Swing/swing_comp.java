
import javax.swing.*;

class swing_comp {

    public static void main(String[] args) {
        JFrame f = new JFrame("Student Details");
        f.setVisible(true);
        f.setSize(400, 400);
        f.setLayout(null);

        JLabel l = new JLabel("RollNo");
        l.setBounds(50, 50, 100, 30);
        f.add(l);

        JTextField t = new JTextField();
        t.setBounds(160, 50, 200, 30);
        f.add(t);

        JLabel n = new JLabel("Name");
        n.setBounds(50, 100, 100, 30);
        f.add(n);

        JTextField nm = new JTextField();
        nm.setBounds(160, 100, 200, 30);
        f.add(nm);

        JButton b = new JButton("Click Here");
        b.setBounds(160, 160, 150, 30);
        f.add(b);
    }
}
