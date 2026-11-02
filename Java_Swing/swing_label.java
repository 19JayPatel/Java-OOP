
import javax.swing.*;

class swing_label {

    public static void main(String[] args) {
        JFrame f = new JFrame("Student Details");
        JLabel l = new JLabel("Name");
        f.add(l);
        f.setBounds(20, 30, 35, 40);
        f.setVisible(true);
        f.setSize(400, 400);

    }
}
