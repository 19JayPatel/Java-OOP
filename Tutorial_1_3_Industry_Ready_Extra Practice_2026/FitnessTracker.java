
import java.util.Scanner;

public class FitnessTracker {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter age: ");
        byte age = scanner.nextByte();

        System.out.print("Enter weight in kg: ");
        double weight = scanner.nextDouble();

        System.out.print("Enter daily step count: ");
        int stepCount = scanner.nextInt();

        System.out.print("Did you complete your workout? (true/false): ");
        boolean workoutCompleted = scanner.nextBoolean();

        // Assumption: average step length is 0.0008 km
        double distancePerStep = 0.0008;

        // Calculate total distance
        double totalDistance = stepCount * distancePerStep;

        // Calculate percentage of 10,000-step goal
        double goalPercentage = ((double) stepCount / 10000) * 100;

        System.out.println("\n--- Fitness Report ---");
        System.out.println("Age: " + age);
        System.out.printf("Weight: %.2f kg%n", weight);
        System.out.println("Steps: " + stepCount);
        System.out.printf("Distance: %.2f km%n", totalDistance);
        System.out.printf("10,000 Step Goal: %.2f%%%n", goalPercentage);
        System.out.println("Workout Completed: " + workoutCompleted);

        scanner.close();
    }
}
