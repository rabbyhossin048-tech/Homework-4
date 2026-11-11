import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        File file = new File("duomenys.txt");

        try (Scanner scanner = new Scanner(file)) {
            // Check if the file is empty
            if (!scanner.hasNextInt()) {
                System.out.println(0);
                return;
            }

            int count = 0;

            // Read the very first number to act as the initial left neighbor
            int prev = scanner.nextInt();

            // Read through the rest of the file until the end
            while (scanner.hasNextInt()) {
                int curr = scanner.nextInt();

                // Check if the current number is smaller than its left neighbor
                if (curr < prev) {
                    count++;
                }

                // Update prev for the next comparison
                prev = curr;
            }

            // Print the total count
            System.out.println(count);

        } catch (FileNotFoundException e) {
            System.out.println("Error: Could not find the file 'duomenys.txt'.");
        }
    }
}