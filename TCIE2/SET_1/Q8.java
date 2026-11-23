
public class Q8 {

    public static void main(String args[]) {

        String s1 = "RK University";
        String s2 = "Rajkot";

        String s3 = s1.substring(0, 2);
        String s4 = s1.concat(" " + s2);

        IO.println("String 1 is: " + s1);
        IO.println("String 2 is: " + s2);
        IO.println("Sub string 3 is: " + s3);
        IO.println("Combined string 4 is: " + s4);
    }
}
