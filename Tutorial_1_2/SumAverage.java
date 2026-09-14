
public class SumAverage {

    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Please enter some numbers.");
            return;
        }

        int sum = 0;

        for (int i = 0; i < args.length; i++) {
            sum = sum + Integer.parseInt(args[i]);
        }

        double average = (double) sum / args.length;

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);

    }
}
