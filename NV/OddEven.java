import java.util.Scanner;

public class OddEven {
	public static void main(String[] args) {

		Scanner s1 = new Scanner(System.in);

		System.out.print("Enter number: ");
		int number = s1.nextInt();

		if (number % 2 == 0) {
			System.out.println("Number is: " + number + " Even number.");
		} else {
			System.out.println("Number is: " + number + " Odd number.");
		}
	}
}