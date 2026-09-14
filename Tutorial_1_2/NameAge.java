
public class NameAge {

    public static void main(String[] args) {

        if (args.length < 2) {
            System.out.println("Please enter name and age.");
            System.out.println("Example: java NameAge Jay 22");
            return;
        }

        String name = args[0];
        int age = Integer.parseInt(args[1]);

        System.out.println("Hello " + name + "!");
        System.out.println("Your age is " + age);

    }
}
