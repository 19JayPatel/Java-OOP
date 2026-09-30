import java.util.Scanner;

class Student {

    Scanner sc = new Scanner(System.in);
    int no[] = new int[5];

    void show() {
        try {
            no[7] = 123;
            System.out.println("Value assigned successfully!"); 
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

public class Q2 {

    public static void main(String[] args) {
        Student s = new Student();

        s.show();
    }
}
