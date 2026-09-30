
class emp {

    static int a = 10;

    static int input(int a1) {
        a = a1;
        a *= 5;
        return a;
    }
}

public class Q5 {

    public static void main(String[] args) {
        emp e = new emp();

        int a1 = e.input(10);

        System.out.println("Print :" + a1);
    }
}
// with parameater
