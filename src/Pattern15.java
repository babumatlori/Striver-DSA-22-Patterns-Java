// Reverse Increaing Letter

// ABCDE
// ABCD
// ABC
// AB
// A


import java.util.Scanner;

public class Pattern15 {
    static void ReverIncLett( int n) {
        int i;
        int j;

        for(i = 1; i <= n; i++) {
            for( j = 1; j <= n - i + 1; j++) {
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
            ReverIncLett(n);
        }
        sc.close();
    }
}
