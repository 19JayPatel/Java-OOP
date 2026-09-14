
public class Calculator {

    public static void main(String[] args) {

        if (args.length < 3) {
            System.out.println("Please enter two numbers and an operator.");
            System.out.println("Example: java Calculator 10 + 5");
            return;
        }

        double number1 = Double.parseDouble(args[0]);
        String operator = args[1];
        double number2 = Double.parseDouble(args[2]);

        double result;

        switch (operator) {

            case "+":
                result = number1 + number2;
                System.out.println("Result: " + result);
                break;

            case "-":
                result = number1 - number2;
                System.out.println("Result: " + result);
                break;

            case "*":
                result = number1 * number2;
                System.out.println("Result: " + result);
                break;

            case "/":
                if (number2 == 0) {
                    System.out.println("Cannot divide by zero.");
                } else {
                    result = number1 / number2;
                    System.out.println("Result: " + result);
                }
                break;

            default:
                System.out.println("Invalid operator.");

        }

    }
}
