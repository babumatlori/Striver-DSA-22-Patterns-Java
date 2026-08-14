// Same Letter Pattern 16

// A
// BB
// CCC
// DDDD
import java.util.Scanner;

public class Pattern16 {
    static void SameLetter(int n) {
        int i;
        int j;

        for(i = 1; i <= n; i++) {
            for(j = 1; j <= i; j++) {
                System.out.print((char)('A' + i - 1));
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            SameLetter(n);
        }
        sc.close();
    }
}
