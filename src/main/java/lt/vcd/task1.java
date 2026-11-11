import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input values
        System.out.print("Enter laptop price (p): ");
        int p = scanner.nextInt();

        System.out.print("Enter current savings (s): ");
        int s = scanner.nextInt();

        System.out.print("Enter weekly savings (m): ");
        int m = scanner.nextInt();

        int k = 0;
        int totalSavings = s;

        // Calculate weeks needed until savings are equal to or greater than the price
        while (totalSavings < p) {
            totalSavings += m;
            k++;
        }

        // Output result
        System.out.println("k = " + k);

        scanner.close();
    }
}