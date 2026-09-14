
public class FileStandardizer {

    public static void main(String[] args) {

        // First argument must be the timestamp
        if (args.length < 2) {
            System.out.println(
                    "Usage: java FileStandardizer <timestamp> <file1> <file2> ..."
            );
            return;
        }

        try {
            // Convert first argument to long
            long timestamp = Long.parseLong(args[0]);

            System.out.println("--- Standardized File Keys ---");

            // Process all filenames after the timestamp
            for (int i = 1; i < args.length; i++) {

                String fileName = args[i];

                // Remove leading and trailing spaces
                fileName = fileName.trim();

                // Remove special characters
                fileName = fileName.replaceAll("[^a-zA-Z0-9]", "");

                // Convert filename to uppercase
                fileName = fileName.toUpperCase();

                // Create database key
                String databaseKey = timestamp + "_" + fileName;

                System.out.println(databaseKey);
            }

        } catch (NumberFormatException e) {
            System.out.println("Invalid timestamp.");
        }
    }
}
