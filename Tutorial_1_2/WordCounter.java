
import java.util.Scanner;

public class WordCounter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int totalWords = 0;

        System.out.println("Enter text line by line.");
        System.out.println("Type 'exit' to stop.");

        while (true) {

            String line = sc.nextLine();

            if (line.equalsIgnoreCase("exit")) {
                break;
            }

            if (!line.trim().isEmpty()) {
                String[] words = line.trim().split("\\s+");
                totalWords = totalWords + words.length;
            }
        }

        System.out.println("Total Words: " + totalWords);
    }
}
