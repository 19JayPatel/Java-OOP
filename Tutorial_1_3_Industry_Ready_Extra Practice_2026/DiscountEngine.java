
public class DiscountEngine {

    public static void main(String[] args) {

        // Need at least one product price and one discount
        if (args.length < 2) {
            System.out.println(
                    "Usage: java DiscountEngine <price1> <price2> ... <discount>"
            );
            return;
        }

        try {
            // Last argument is the discount percentage
            double discountPercentage
                    = Double.parseDouble(args[args.length - 1]);

            double totalAmount = 0;

            System.out.println("--- Itemized Bill ---");

            // Process every argument except the last one
            for (int i = 0; i < args.length - 1; i++) {

                double originalPrice = Double.parseDouble(args[i]);

                double discountAmount
                        = originalPrice * discountPercentage / 100;

                double finalPrice
                        = originalPrice - discountAmount;

                totalAmount += finalPrice;

                System.out.printf(
                        "Item %d: Original = %.2f, Final = %.2f%n",
                        i + 1,
                        originalPrice,
                        finalPrice
                );
            }

            System.out.printf(
                    "Total Amount: %.2f%n",
                    totalAmount
            );

        } catch (NumberFormatException e) {
            System.out.println("Invalid price or discount value.");
        }
    }
}
