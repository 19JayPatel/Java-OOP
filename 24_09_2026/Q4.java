class emp {

    static int a = 10;

    static void input() {
        a *= 5;
    }

    void display() {
        System.out.println(a);
    }
}

public class Q4 {

    public static void main(String[] args) {
        emp e = new emp();

        e.input();

        e.display();
    }
}

//concept of static and static member function using class and object.
// static member and static data member : static a = 10;
