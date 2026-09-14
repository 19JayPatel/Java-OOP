
public class Sentence {

    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Please enter a sentence.");
            return;
        }

        System.out.print("Sentence: ");

        for (int i = 0; i < args.length; i++) {
            System.out.print(args[i] + " ");
        }

        System.out.println();

    }
}
