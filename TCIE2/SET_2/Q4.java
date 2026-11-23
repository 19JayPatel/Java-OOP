class First {

    int a = 10;
}

class Second extends First {

    int b = 20;
}

class Third extends Second {

    void show() {
        int sum = a + b;

        IO.println("First Value: " + a);
        IO.println("Second Value: " + b);
        IO.println("Sum = " + sum);
    }
}

public class Q4 {

    public static void main(String args[]) {

        Third t1 = new Third();

        t1.show();
    }
}
