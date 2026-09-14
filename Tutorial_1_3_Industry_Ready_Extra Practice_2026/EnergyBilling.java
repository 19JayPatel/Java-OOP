
import java.util.Scanner;

public class EnergyBilling {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter monthly power consumption (kWh): ");
        long powerConsumption = scanner.nextLong();

        System.out.print("Enter tariff tier (A/B/C): ");
        char tariffTier = scanner.next().toUpperCase().charAt(0);

        System.out.print("Enter surcharge multiplier: ");
        float surchargeMultiplier = scanner.nextFloat();

        // Sample tariff rates
        double tariffRate;

        switch (tariffTier) {
            case 'A':
                tariffRate = 5.00;
                break;

            case 'B':
                tariffRate = 7.00;
                break;

            case 'C':
                tariffRate = 10.00;
                break;

            default:
                System.out.println("Invalid tariff tier.");
                scanner.close();
                return;
        }

        // Calculate basic bill
        double basicBill = powerConsumption * tariffRate;

        // Apply surcharge multiplier
        double totalBill = basicBill * surchargeMultiplier;

        System.out.println("\n--- Energy Bill ---");
        System.out.println("Consumption: " + powerConsumption + " kWh");
        System.out.println("Tariff Tier: " + tariffTier);
        System.out.printf("Rate: %.2f%n", tariffRate);
        System.out.printf("Basic Bill: %.2f%n", basicBill);
        System.out.printf("Total Bill: %.2f%n", totalBill);

        scanner.close();
    }
}
