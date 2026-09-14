
public class CurrencyConverter {

    public static void main(String[] args) {

        // Default configuration
        final String DEFAULT_SOURCE = "USD";
        final String DEFAULT_TARGET = "EUR";
        final double DEFAULT_AMOUNT = 100.0;

        String sourceCurrency;
        String targetCurrency;
        double amount;

        // Use defaults when fewer than 3 arguments are supplied
        if (args.length < 3) {

            System.out.println(
                    "Warning: Missing parameters. Using default configuration."
            );

            sourceCurrency = DEFAULT_SOURCE;
            targetCurrency = DEFAULT_TARGET;
            amount = DEFAULT_AMOUNT;

        } else {

            sourceCurrency = args[0];
            targetCurrency = args[1];

            try {
                amount = Double.parseDouble(args[2]);

            } catch (NumberFormatException e) {
                System.out.println(
                        "Invalid amount. Using default amount: "
                        + DEFAULT_AMOUNT
                );

                amount = DEFAULT_AMOUNT;
            }
        }

        // Sample exchange rate for demonstration
        double exchangeRate;

        if (sourceCurrency.equalsIgnoreCase("USD")
                && targetCurrency.equalsIgnoreCase("EUR")) {

            exchangeRate = 0.92;

        } else {
            System.out.println(
                    "Exchange rate not configured for this currency pair."
            );
            return;
        }

        double convertedAmount = amount * exchangeRate;

        System.out.println("\n--- Currency Conversion ---");
        System.out.println("Source Currency: " + sourceCurrency);
        System.out.println("Target Currency: " + targetCurrency);
        System.out.printf("Amount: %.2f%n", amount);
        System.out.printf("Converted Amount: %.2f%n", convertedAmount);
    }
}
