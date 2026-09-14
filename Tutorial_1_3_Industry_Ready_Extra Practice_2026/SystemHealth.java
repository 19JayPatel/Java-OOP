
public class SystemHealth {

    public static void main(String[] args) {

        // Check whether all three required arguments are provided
        if (args.length < 3) {
            System.out.println(
                    "Usage: java SystemHealth <memoryMB> <maxConnections> <debug>"
            );
            return;
        }

        try {
            // Convert command-line strings into required data types
            int allocatedMemoryMb = Integer.parseInt(args[0]);
            int maxConnections = Integer.parseInt(args[1]);
            boolean debugEnabled = Boolean.parseBoolean(args[2]);

            System.out.println("\n--- Server Health Summary ---");
            System.out.println("Allocated Memory: "
                    + allocatedMemoryMb + " MB");
            System.out.println("Maximum Connections: "
                    + maxConnections);
            System.out.println("Debug Mode: "
                    + debugEnabled);

        } catch (NumberFormatException e) {
            System.out.println("Invalid numeric argument.");
        }
    }
}
