class First {

    static int a;

    static void show() {
        IO.println("Value is " + a);
    }
}

public class Q3 {

    public static void main(String args[]) {

        First.a = 10;
        First.show();
    }
}
