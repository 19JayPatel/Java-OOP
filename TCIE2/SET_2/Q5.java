class First {

    int a = 10;

    First(int x) {
        a = x;
    }

    void show() {
        IO.println("Constructor value assigned");
    }
}

class Second extends First {

    int b;

    Second(int x, int y) {
        super(x);
        b = y;
    }

    void showdata() {
        IO.println("First Value is " + a);
        IO.println("Second Value is " + b);
    }
}

public class Q5 {

    public static void main(String args[]) {

        Second s = new Second(4, 5);

        s.show();
        s.showdata();
    }
}
