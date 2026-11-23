
import javax.swing.*;

public class Q7 {

    public static void main(String args[]) {

        JFrame f = new JFrame("Login Screen");

        JLabel p = new JLabel("PATIENT LOGIN");
        p.setBounds(100, 30, 150, 30);
        f.add(p);

        JLabel p1 = new JLabel("ID Number:");
        p1.setBounds(30, 80, 100, 30);
        f.add(p1);

        JTextField pt1 = new JTextField();
        pt1.setBounds(110, 80, 100, 30);
        f.add(pt1);

        JLabel p2 = new JLabel("Password:");
        p2.setBounds(30, 150, 100, 30);
        f.add(p2);

        JPasswordField pt2 = new JPasswordField();
        pt2.setBounds(110, 150, 100, 30);
        f.add(pt2);

        JButton pb = new JButton("Login");
        pb.setBounds(115, 210, 80, 30);
        f.add(pb);

        JLabel d = new JLabel("DOCTOR LOGIN");
        d.setBounds(330, 30, 150, 30);
        f.add(d);

        JLabel d1 = new JLabel("ID Number:");
        d1.setBounds(250, 80, 100, 30);
        f.add(d1);

        JTextField dt1 = new JTextField();
        dt1.setBounds(330, 80, 100, 30);
        f.add(dt1);

        JLabel d2 = new JLabel("Password:");
        d2.setBounds(250, 150, 100, 30);
        f.add(d2);

        JPasswordField dt2 = new JPasswordField();
        dt2.setBounds(330, 150, 100, 30);
        f.add(dt2);

        JButton db = new JButton("Login");
        db.setBounds(365, 210, 80, 30);
        f.add(db);

        f.setLayout(null);
        f.setSize(500, 330);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
