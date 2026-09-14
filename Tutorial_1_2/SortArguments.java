
import java.util.Arrays;

public class SortArguments {

    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Please enter some values.");
            return;
        }

        boolean numeric = true;

        for (int i = 0; i < args.length; i++) {

            try {
                Integer.parseInt(args[i]);
            } catch (NumberFormatException e) {
                numeric = false;
                break;
            }
        }

        if (numeric) {

            int[] numbers = new int[args.length];

            for (int i = 0; i < args.length; i++) {
                numbers[i] = Integer.parseInt(args[i]);
            }

            Arrays.sort(numbers);

            System.out.println("Numeric values in sorted order:");

            for (int number : numbers) {
                System.out.print(number + " ");
            }

        } else {

            Arrays.sort(args);

            System.out.println("Alphabetic values in sorted order:");

            for (String value : args) {
                System.out.print(value + " ");
            }

        }

        System.out.println();

    }
}
