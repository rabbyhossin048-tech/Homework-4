import java.util.Scanner;

public class  task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int evenCount = 0;
        int oddCount = 0;

        System.out.println("Enter integer numbers one by one (enter 0 to stop):");

        while (true) {
            int number = scanner.nextInt();

            // Check if the input is 0 to terminate the loop
            if (number == 0) {
                break;
            }

            // Check if the number is even or odd
            if (number % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        // Output results
        System.out.println("Even numbers: " + evenCount);
        System.out.println("Odd numbers: " + oddCount);

        scanner.close();
    }
}