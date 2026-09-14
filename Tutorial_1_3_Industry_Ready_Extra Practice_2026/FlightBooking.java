
import java.util.Scanner;

public class FlightBooking {

    public static void main(String[] args) {

        if (args.length < 1) {
            System.out.println(
                    "Usage: java FlightBooking <flightId>"
            );
            return;
        }

        String flightId = args[0];

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter passenger age: ");
        byte age = scanner.nextByte();

        System.out.print("Enter seat class (E/B/F): ");
        char seatClass = scanner.next().toUpperCase().charAt(0);

        System.out.print("Enter luggage weight (kg): ");
        float luggageWeight = scanner.nextFloat();

        double baseFare;
        float luggageLimit;

        // Select fare and luggage limit according to class
        switch (seatClass) {

            case 'E':
                baseFare = 5000;
                luggageLimit = 15;
                break;

            case 'B':
                baseFare = 10000;
                luggageLimit = 25;
                break;

            case 'F':
                baseFare = 20000;
                luggageLimit = 40;
                break;

            default:
                System.out.println("Invalid seat class.");
                scanner.close();
                return;
        }

        double finalFare = baseFare;

        // Child discount
        if (age < 12) {
            finalFare = finalFare * 0.50;
        } // Senior citizen discount
        else if (age >= 60) {
            finalFare = finalFare * 0.80;
        }

        // Calculate excess luggage
        float extraLuggage = 0;

        if (luggageWeight > luggageLimit) {
            extraLuggage = luggageWeight - luggageLimit;
        }

        // Sample penalty: ₹500 for each extra kg
        double luggagePenalty = extraLuggage * 500;

        // Final fare
        double totalFare = finalFare + luggagePenalty;

        System.out.println("\n--- Flight Booking Summary ---");
        System.out.println("Flight ID: " + flightId);
        System.out.println("Seat Class: " + seatClass);
        System.out.println("Passenger Age: " + age);
        System.out.printf("Base Fare: %.2f%n", baseFare);
        System.out.printf("Luggage Weight: %.2f kg%n", luggageWeight);
        System.out.printf("Extra Luggage: %.2f kg%n", extraLuggage);
        System.out.printf("Luggage Penalty: %.2f%n", luggagePenalty);
        System.out.printf("Total Fare: %.2f%n", totalFare);

        scanner.close();
    }
}
