
public class IntegerOverflow {

    public static void main(String[] args) {

        System.out.println("----- Integer Overflow -----");

        int intValue = Integer.MAX_VALUE;
        System.out.println("Integer MAX_VALUE: " + intValue);
        System.out.println("After adding 1: " + (intValue + 1));

        System.out.println();

        byte byteValue = Byte.MAX_VALUE;
        System.out.println("Byte MAX_VALUE: " + byteValue);
        System.out.println("After adding 1: " + (byte) (byteValue + 1));

        System.out.println();

        short shortValue = Short.MAX_VALUE;
        System.out.println("Short MAX_VALUE: " + shortValue);
        System.out.println("After adding 1: " + (short) (shortValue + 1));

    }
}
