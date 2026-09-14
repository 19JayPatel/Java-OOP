
import java.util.Scanner;

public class CharacterValue {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char character = sc.next().charAt(0);

        System.out.println("Unicode Value: " + (int) character);

        System.out.print("Enter an integer value: ");
        int number = sc.nextInt();

        System.out.println("Corresponding Character: " + (char) number);
    }
}
