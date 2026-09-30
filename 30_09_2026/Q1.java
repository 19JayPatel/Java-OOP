
import java.util.Scanner;

class Student {

    Scanner sc = new Scanner(System.in);
    int no;

    void input() {
        System.out.println("Enter number: ");
        no = sc.nextInt();
    }

    void show() {
        try {
            no = no / 0;
            System.out.println("Result: " + no);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

public class Q1 {

    public static void main(String[] args) {
        Student s = new Student();

        s.input();
        s.show();
    }
}
