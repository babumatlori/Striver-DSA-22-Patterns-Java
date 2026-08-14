// Alpha half trangle
// A
// AB
// ABC
// ABCD

import java.util.Scanner;

public class Pattern14 {
    static void AlpHalfTra( int n) {
        int i;
        int j;

        for(i = 1; i <= n; i++) {
            for( j = 1; j <= i; j++) {
                System.out.print((char)('A' + j - 1));
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            AlpHalfTra(n);
        }
        sc.close();
    }
}
