import java.util.InputMismatchException;
import java.util.Scanner;

public class VehicleTollPlaza {
    public static void main(String[] args) {

        // Need toll rates for three vehicle types
        if (args.length < 3) {
            System.out.println(
                    "Usage: java VehicleTollPlaza <carRate> <busRate> <truckRate>"
            );
            return;
        }

        double carRate;
        double busRate;
        double truckRate;

        // Parse command-line rates
        try {
            carRate = Double.parseDouble(args[0]);
            busRate = Double.parseDouble(args[1]);
            truckRate = Double.parseDouble(args[2]);

        } catch (NumberFormatException e) {
            System.out.println("Invalid toll rate in command-line arguments.");
            return;
        }

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter vehicle type (car/bus/truck): ");
            String vehicleType = scanner.next();

            System.out.print("Enter axle count: ");
            int axleCount = scanner.nextInt();

            System.out.print("Enter vehicle weight: ");
            double weight = scanner.nextDouble();

            double toll;

            // Select toll based on vehicle type
            if (vehicleType.equalsIgnoreCase("car")) {
                toll = carRate;

            } else if (vehicleType.equalsIgnoreCase("bus")) {
                toll = busRate;

            } else if (vehicleType.equalsIgnoreCase("truck")) {
                toll = truckRate;

            } else {
                System.out.println("Unknown vehicle type.");
                return;
            }

            // Example extra charge for heavy vehicles
            if (weight > 10000) {
                toll += 100;
            }

            // Example axle-based charge
            if (axleCount > 4) {
                toll += 50;
            }

            System.out.println("\n--- Toll Receipt ---");
            System.out.println("Vehicle: " + vehicleType);
            System.out.println("Axles: " + axleCount);
            System.out.printf("Weight: %.2f kg%n", weight);
            System.out.printf("Total Toll: %.2f%n", toll);

        } catch (InputMismatchException e) {

            System.out.println(
                    "Invalid input. Please enter the correct data type."
            );

        } finally {
            scanner.close();
        }
    }
}