
public class DataTypes {

    static byte byteValue;
    static short shortValue;
    static int intValue;
    static long longValue;
    static float floatValue;
    static double doubleValue;
    static char charValue;
    static boolean booleanValue;

    public static void main(String[] args) {

        System.out.println("----- Primitive Data Types -----");

        System.out.println("byte");
        System.out.println("Default Value: " + byteValue);
        System.out.println("Memory Size: " + Byte.SIZE + " bits");

        System.out.println();

        System.out.println("short");
        System.out.println("Default Value: " + shortValue);
        System.out.println("Memory Size: " + Short.SIZE + " bits");

        System.out.println();

        System.out.println("int");
        System.out.println("Default Value: " + intValue);
        System.out.println("Memory Size: " + Integer.SIZE + " bits");

        System.out.println();

        System.out.println("long");
        System.out.println("Default Value: " + longValue);
        System.out.println("Memory Size: " + Long.SIZE + " bits");

        System.out.println();

        System.out.println("float");
        System.out.println("Default Value: " + floatValue);
        System.out.println("Memory Size: " + Float.SIZE + " bits");

        System.out.println();

        System.out.println("double");
        System.out.println("Default Value: " + doubleValue);
        System.out.println("Memory Size: " + Double.SIZE + " bits");

        System.out.println();

        System.out.println("char");
        System.out.println("Default Value: " + (int) charValue);
        System.out.println("Memory Size: " + Character.SIZE + " bits");

        System.out.println();

        System.out.println("boolean");
        System.out.println("Default Value: " + booleanValue);
        System.out.println("Memory Size: JVM dependent");

    }
}
