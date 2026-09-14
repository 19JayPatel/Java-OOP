
import java.util.Scanner;

public class PosSystem {

    public static void main(String[] args) {

        // Check CLI arguments
        if (args.length < 2) {
            System.out.println(
                    "Usage: java PosSystem <taxRate> <storeID>"
            );
            return;
        }

        try {
            // Read configuration from command line
            double taxRate = Double.parseDouble(args[0]);
            int storeId = Integer.parseInt(args[1]);

            Scanner scanner = new Scanner(System.in);

            double subtotal = 0;

            System.out.println("\n--- POS System ---");
            System.out.println("Store ID: " + storeId);
            System.out.println("Tax Rate: " + taxRate + "%");

            System.out.println(
                    "\nEnter item prices. Enter -1 to finish."
            );

            while (true) {

                System.out.print("Enter item price: ");
                double itemPrice = scanner.nextDouble();

                // -1 is the sentinel value
                if (itemPrice == -1) {
                    break;
                }

                // Don't accept negative prices other than -1
                if (itemPrice < 0) {
                    System.out.println("Invalid price.");
                    continue;
                }

                subtotal += itemPrice;
            }

            // Calculate tax
            double taxAmount = subtotal * taxRate / 100;

            // Calculate final total
            double finalTotal = subtotal + taxAmount;

            System.out.println("\n--- Final Bill ---");
            System.out.printf("Subtotal: %.2f%n", subtotal);
            System.out.printf("Tax: %.2f%n", taxAmount);
            System.out.printf("Final Total: %.2f%n", finalTotal);

            scanner.close();

        } catch (NumberFormatException e) {
            System.out.println("Invalid command-line configuration.");

        } catch (Exception e) {
            System.out.println("Invalid input entered.");
        }
    }
}
