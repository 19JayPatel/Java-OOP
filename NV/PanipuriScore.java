
import java.util.Scanner;

public class PanipuriScore {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] pscore = new int[10];

        // Enter panipuri count for 10 times
        System.out.println("Enter panipuri count for 10 times:");

        for (int i = 0; i < pscore.length; i++) {
            System.out.print("Eating " + (i + 1) + ": ");
            pscore[i] = sc.nextInt();
        }

        // Display all counts
        System.out.println("\nPanipuri counts:");

        for (int i = 0; i < pscore.length; i++) {
            System.out.println("Eating " + (i + 1) + ": " + pscore[i]);
        }

        // Find minimum, maximum and sum
        int min = pscore[0];
        int max = pscore[0];
        int sum = 0;

        for (int i = 0; i < pscore.length; i++) {

            sum = sum + pscore[i];

            if (pscore[i] < min) {
                min = pscore[i];
            }

            if (pscore[i] > max) {
                max = pscore[i];
            }
        }

        // Calculate average
        double avg = (double) sum / pscore.length;

        // Count how many times greater than average
        int countGreater = 0;

        for (int i = 0; i < pscore.length; i++) {

            if (pscore[i] > avg) {
                countGreater++;
            }
        }

        // Display result
        System.out.println("\n----- Result -----");
        System.out.println("Minimum panipuri count: " + min);
        System.out.println("Maximum panipuri count: " + max);
        System.out.println("Average panipuri count: " + avg);
        System.out.println("Times greater than average: " + countGreater);
    }
}
