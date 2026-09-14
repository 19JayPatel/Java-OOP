
public class TypeCasting {

    public static void main(String[] args) {

        // Implicit type casting
        int number = 100;
        double doubleNumber = number;

        System.out.println("----- Implicit Type Casting -----");
        System.out.println("Integer Value: " + number);
        System.out.println("Double Value: " + doubleNumber);

        // Explicit type casting
        double price = 99.99;
        int newPrice = (int) price;

        System.out.println();
        System.out.println("----- Explicit Type Casting -----");
        System.out.println("Double Value: " + price);
        System.out.println("Integer Value: " + newPrice);

        System.out.println();
        System.out.println("Data Loss: " + (price - newPrice));

    }
}
