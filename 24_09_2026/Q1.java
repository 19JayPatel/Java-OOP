
public class Q1 {

    public static void main(String[] args) {
        String nm = "abc";
        String nm1 = "abc";

        System.out.println(nm.length());
        System.out.println(nm.toUpperCase());
        System.out.println(nm.toLowerCase());
        System.out.println(nm.equals(nm1));

        if (nm == nm1) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        
    }
}
