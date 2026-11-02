
import javax.swing.*;

class swing_button {

    public static void main(String[] args) {
        JFrame f = new JFrame("Student Details");
        JButton b = new JButton("Click");
        f.add(b);
        f.setBounds(20, 30, 35, 40);
        f.setVisible(true);
        f.setSize(400, 400);

    }
}
