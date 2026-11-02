
import java.awt.*;

class frame_label {

    public static void main(String[] args) {
        Frame f = new Frame("Student Details");
        Label l = new Label("Name");
        f.add(l);
        f.setBounds(20, 30, 35, 40);
        f.setVisible(true);
        f.setSize(400, 400);

    }
}
