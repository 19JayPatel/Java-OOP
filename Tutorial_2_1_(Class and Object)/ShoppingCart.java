
import java.util.Scanner;

class Product {

    int product_id;
    String product_name;
    double price;
    String category;

    Product(int id, String name, double p, String c) {
        product_id = id;
        product_name = name;
        price = p;
        category = c;
    }

    void display() {
        System.out.println("Product ID: " + product_id);
        System.out.println("Product Name: " + product_name);
        System.out.println("Price: " + price);
        System.out.println("Category: " + category);
    }
}

public class ShoppingCart {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        if (args.length == 0) {
            System.out.println("Please pass Product Category through command-line argument.");
            return;
        }

        String search_category = args[0];

        Product p1 = new Product(101, "Laptop", 50000, "Electronics");
        Product p2 = new Product(102, "Mobile", 20000, "Electronics");
        Product p3 = new Product(103, "Shirt", 1200, "Clothing");

        System.out.println("----- Matching Products -----");

        if (p1.category.equalsIgnoreCase(search_category)) {
            p1.display();
            System.out.println();
        }

        if (p2.category.equalsIgnoreCase(search_category)) {
            p2.display();
            System.out.println();
        }

        if (p3.category.equalsIgnoreCase(search_category)) {
            p3.display();
            System.out.println();
        }

        System.out.print("Enter quantity of Laptop: ");
        int q1 = sc.nextInt();

        System.out.print("Enter quantity of Mobile: ");
        int q2 = sc.nextInt();

        System.out.print("Enter quantity of Shirt: ");
        int q3 = sc.nextInt();

        double total = (p1.price * q1)
                + (p2.price * q2)
                + (p3.price * q3);

        double discount = 0;

        // Apply discount according to total amount
        if (total >= 50000) {
            discount = total * 0.10;
        } else if (total >= 20000) {
            discount = total * 0.05;
        }

        double amount_after_discount = total - discount;

        double gst = amount_after_discount * 0.18;

        double final_amount = amount_after_discount + gst;

        System.out.println("\n----- Shopping Cart Bill -----");
        System.out.println("Total Cart Amount: " + total);
        System.out.println("Discount: " + discount);
        System.out.println("Amount After Discount: " + amount_after_discount);
        System.out.println("GST 18%: " + gst);
        System.out.println("Final Payable Amount: " + final_amount);

        sc.close();
    }
}
