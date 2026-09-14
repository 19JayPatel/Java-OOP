
import java.util.Scanner;

public class HealthMetrics {

    public static void main(String[] args) {

        // Check CLI mode
        if (args.length < 1) {
            System.out.println(
                    "Usage: java HealthMetrics --metric"
            );
            System.out.println(
                    "   or: java HealthMetrics --imperial"
            );
            return;
        }

        String unitMode = args[0];

        // Validate the selected mode
        if (!unitMode.equals("--metric")
                && !unitMode.equals("--imperial")) {

            System.out.println(
                    "Invalid mode. Use --metric or --imperial."
            );
            return;
        }

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter weight: ");
        double weight = scanner.nextDouble();

        System.out.print("Enter height: ");
        double height = scanner.nextDouble();

        System.out.print("Enter age: ");
        int age = scanner.nextInt();

        System.out.print("Enter activity factor: ");
        double activityFactor = scanner.nextDouble();

        double weightInKg;
        double heightInCm;

        // Convert everything to metric units
        if (unitMode.equals("--metric")) {

            weightInKg = weight;
            heightInCm = height;

        } else {

            // Pounds to kilograms
            weightInKg = weight * 0.453592;

            // Inches to centimeters
            heightInCm = height * 2.54;
        }

        // Convert height from cm to meters for BMI
        double heightInMeters = heightInCm / 100;

        // Calculate BMI
        double bmi
                = weightInKg / (heightInMeters * heightInMeters);

        /*
         * Generalized BMR estimate.
         *
         * Since sex is not provided by the question,
         * this uses a simple general formula.
         */
        double bmr
                = (10 * weightInKg)
                + (6.25 * heightInCm)
                - (5 * age)
                + 5;

        // Estimate daily energy requirement
        double dailyCalories = bmr * activityFactor;

        // Determine BMI category
        String bmiCategory;

        if (bmi < 18.5) {
            bmiCategory = "Underweight";

        } else if (bmi < 25) {
            bmiCategory = "Normal";

        } else if (bmi < 30) {
            bmiCategory = "Overweight";

        } else {
            bmiCategory = "Obese";
        }

        // Display final report
        System.out.println("\n--- Health Assessment Report ---");
        System.out.println("Unit Mode: " + unitMode);
        System.out.printf("Weight: %.2f kg%n", weightInKg);
        System.out.printf("Height: %.2f cm%n", heightInCm);
        System.out.println("Age: " + age);
        System.out.printf("BMI: %.2f%n", bmi);
        System.out.println("BMI Category: " + bmiCategory);
        System.out.printf("Estimated BMR: %.2f kcal/day%n", bmr);
        System.out.printf(
                "Estimated Daily Calories: %.2f kcal/day%n",
                dailyCalories
        );

        scanner.close();
    }
}
