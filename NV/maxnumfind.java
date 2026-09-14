import java.util.Scanner;

public class maxnumfind {

    public static void main(String[] args) {

        Scanner s1 = new Scanner(System.in);

        System.out.println("Enter three numbers: ");

        int a = s1.nextInt();
        int b = s1.nextInt();
        int c = s1.nextInt();

        if (a > b) {
            if (a > c) {
                System.out.println(a + " is Maximum number.");
            } else {
                System.out.println(c + " is Maximum number.");
            }
        } else {
            if (b > c) {
                System.out.println(b + " is Maximum number.");
            } else {
                System.out.println(c + " is Maximum number.");
            }
        }
    }
}