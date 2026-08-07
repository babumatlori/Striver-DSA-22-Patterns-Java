import java.util.Scanner;

public class Pattern08 {

    // Method to print reverse triangle pattern
    static void ReverseTrainglePatt(int n) {
        int i;
        int j;

        // Outer loop: controls the number of rows
        for (i = n; i >= 0; i--) {

            // First inner loop: prints spaces before stars
            for (j = n - i; j > 1; j--) {
                System.out.print(" ");
            }

            // Second inner loop: prints stars with a space after each
            for (j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            // Move to the next line after each row
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create Scanner object

        System.out.println("Enter the n0:"); // Prompt user

        // Input validation: check if user entered an integer
        if (sc.hasNextInt()) {
            int n = sc.nextInt(); // Read integer
            ReverseTrainglePatt(n); // Call pattern method
        }

        sc.close(); // Close scanner to avoid resource leak
    }
}
