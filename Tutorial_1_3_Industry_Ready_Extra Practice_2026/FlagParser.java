
public class FlagParser {

    public static void main(String[] args) {

        String username = null;
        int port = -1;
        boolean verboseMode = false;

        for (int i = 0; i < args.length; i++) {

            // Username flag
            if (args[i].equals("-u")) {

                // Check that a value exists after -u
                if (i + 1 < args.length) {
                    username = args[i + 1];
                    i++; // Skip the username value
                } else {
                    System.out.println("Missing username after -u.");
                    return;
                }
            } // Port flag
            else if (args[i].equals("-p")) {

                // Check that a value exists after -p
                if (i + 1 < args.length) {

                    try {
                        port = Integer.parseInt(args[i + 1]);
                        i++; // Skip the port value

                    } catch (NumberFormatException e) {
                        System.out.println("Port must be a number.");
                        return;
                    }

                } else {
                    System.out.println("Missing port after -p.");
                    return;
                }
            } // Verbose flag
            else if (args[i].equals("-v")) {
                verboseMode = true;
            } // Unknown flag
            else {
                System.out.println("Unknown flag: " + args[i]);
            }
        }

        System.out.println("\n--- Command-Line Configuration ---");
        System.out.println("Username: " + username);
        System.out.println("Port: " + port);
        System.out.println("Verbose Mode: " + verboseMode);
    }
}
