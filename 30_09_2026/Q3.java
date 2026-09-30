
import java.util.Scanner;

class Student {

    float percentage;

    Student(float per) {
        this.percentage = per;
    }

    void show() {
        try {
            float per = percentage;
            per = per / 0;
            System.out.println(per);
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
    }
}

public class Q3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter percentage: ");
        float per = sc.nextFloat();

        Student s1 = new Student(per);
        s1.show();

        sc.close();
    }
}
