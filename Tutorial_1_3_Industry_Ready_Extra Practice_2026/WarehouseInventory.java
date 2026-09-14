
import java.util.Scanner;

public class WarehouseInventory {

    public static void main(String[] args) {

        // Warehouse location must be provided through CLI
        if (args.length < 1) {
            System.out.println(
                    "Usage: java WarehouseInventory <warehouseLocation>"
            );
            return;
        }

        String warehouseLocation = args[0];

        Scanner scanner = new Scanner(System.in);

        double totalInventoryValue = 0;

        // Sample reorder threshold
        final int REORDER_THRESHOLD = 10;

        System.out.println("--- Warehouse Inventory Audit ---");
        System.out.println("Warehouse: " + warehouseLocation);

        System.out.println(
                "\nEnter inventory details."
        );
        System.out.println(
                "Enter 'STOP' as SKU when finished."
        );

        while (true) {

            System.out.print("\nEnter SKU: ");
            String sku = scanner.next();

            // Stop the loop when STOP is entered
            if (sku.equalsIgnoreCase("STOP")) {
                break;
            }

            System.out.print("Enter unit count: ");
            int unitCount = scanner.nextInt();

            System.out.print("Enter unit cost: ");
            double unitCost = scanner.nextDouble();

            System.out.print("Reorder required? (true/false): ");
            boolean reorderFlag = scanner.nextBoolean();

            // Calculate value of current item
            double itemValue = unitCount * unitCost;

            // Add it to total inventory value
            totalInventoryValue += itemValue;

            System.out.println("\n--- Item Information ---");
            System.out.println("SKU: " + sku);
            System.out.println("Quantity: " + unitCount);
            System.out.printf("Unit Cost: %.2f%n", unitCost);
            System.out.printf("Item Value: %.2f%n", itemValue);

            // Check reorder condition
            if (unitCount < REORDER_THRESHOLD || reorderFlag) {
                System.out.println("REORDER ALERT: Stock needs attention.");
            } else {
                System.out.println("Stock level is okay.");
            }
        }

        System.out.println("\n--- Inventory Summary ---");
        System.out.printf(
                "Current Inventory Valuation: %.2f%n",
                totalInventoryValue
        );

        scanner.close();
    }
}
