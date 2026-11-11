import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        // Specify the file name (duomenys.txt as requested)
        File file = new File("data.txt");

        try (Scanner scanner = new Scanner(file)) {
            // Check if the file has content and read n
            if (!scanner.hasNextInt()) {
                System.out.println("The file is empty or formatted incorrectly.");
                return;
            }

            int n = scanner.nextInt();
            int negativeCount = 0;

            // Read the n temperature values
            for (int i = 0; i < n; i++) {
                if (scanner.hasNextInt()) {
                    int temp = scanner.nextInt();
                    // Count if the temperature is negative (below 0°C)
                    if (temp < 0) {
                        negativeCount++;
                    }
                }
            }

            // Print the final result according to the conditions
            if (negativeCount == 0) {
                System.out.println("No negative temperatures recorded");
            } else {
                System.out.println("Number of days with negative temperatures: " + negativeCount);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Error: Could not find the file 'data.txt'. Please ensure it exists in the project directory.");
        }
    }
}