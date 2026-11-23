class First {

    int a = 10, b;

    void show() {
        try {
            b = 0;

            int c = a / b;

            IO.println("Answer = " + c);
        } catch (ArithmeticException e) {
            IO.println("We can not divide number by zero " + e);
        }
    }
}

public class Q7 {

    public static void main(String args[]) {

        First f = new First();

        f.show();
    }
}
