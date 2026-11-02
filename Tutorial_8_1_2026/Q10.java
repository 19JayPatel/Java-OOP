
import javax.swing.*;

class Q10 {

    public static void main(String[] args) {

        JFrame f = new JFrame("Programming Languages");

        JLabel l = new JLabel("Select Languages:");
        l.setBounds(50, 30, 200, 30);
        f.add(l);

        JCheckBox c1 = new JCheckBox("Java");
        c1.setBounds(50, 70, 100, 30);
        f.add(c1);

        JCheckBox c2 = new JCheckBox("Python");
        c2.setBounds(50, 110, 100, 30);
        f.add(c2);

        JCheckBox c3 = new JCheckBox("C++");
        c3.setBounds(50, 150, 100, 30);
        f.add(c3);

        JButton b = new JButton("Display");
        b.setBounds(50, 200, 120, 30);
        f.add(b);

        JLabel result = new JLabel("");
        result.setBounds(50, 240, 300, 50);
        f.add(result);

        b.addActionListener(e -> {
            String languages = "";

            if (c1.isSelected()) {
                languages = languages + "Java ";
            }

            if (c2.isSelected()) {
                languages = languages + "Python ";
            }

            if (c3.isSelected()) {
                languages = languages + "C++ ";
            }

            if (languages.isEmpty()) {
                result.setText("No language selected!");
            } else {
                result.setText("Selected: " + languages);
            }
        });

        f.setLayout(null);
        f.setSize(380, 350);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
