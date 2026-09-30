
// import java.util.Scanner;
// public class Q2 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter first string: ");
//         String nm = sc.nextLine();
//         System.out.print("Enter second string: ");
//         String nm1 = sc.nextLine();
//         System.out.println("\n--- String Methods ---");
//         // 1. length()
//         System.out.println("Length: " + nm.length());
//         // 2. toUpperCase()
//         System.out.println("Uppercase: " + nm.toUpperCase());
//         // 3. toLowerCase()
//         System.out.println("Lowercase: " + nm.toLowerCase());
//         // 4. equals()
//         System.out.println("Equals: " + nm.equals(nm1));
//         // 5. charAt()
//         System.out.println("Character at index 0: " + nm.charAt(0));
//         // 6. substring()
//         if (nm.length() >= 3) {
//             System.out.println("Substring: " + nm.substring(1, 3));
//         } else {
//             System.out.println("Substring: String is too short");
//         }
//         // 7. contains()
//         System.out.println("Contains 'a': " + nm.contains("a"));
//         // 8. replace()
//         System.out.println("Replace 'a' with 'x': " + nm.replace("a", "x"));
//         // == comparison
//         if (nm == nm1) {
//             System.out.println("== Comparison: True");
//         } else {
//             System.out.println("== Comparison: False");
//         }
//         sc.close();
//     }
// }
import java.util.Scanner;

public class Q2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        System.out.println("\n--- Comparison ---");

        System.out.println("Using equals(): " + str1.equals(str2));

        if (str1 == str2) {
            System.out.println("Using == : True");
        } else {
            System.out.println("Using == : False");
        }

        sc.close();
    }
}
