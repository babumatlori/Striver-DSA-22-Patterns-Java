// Symmetric-Void Pattern
// ***** *****
// ****   ****
// ***     ***
// **       **
// *         *
// *         *
// **       **
// ***     ***
// ****   ****
// ***** *****

import java.util.Scanner;

public class Pattern19 {
    static void SymVoidPatt(int n) {
        int i;
        int j;
        int space = 0;

        for( i = 1; i <= n; i++) {
            // Star
            for(j = 0; j <= n - i; j++ ){
                System.out.print("*");
            }
            // space
            for(j = 0; j <= space; j++) {
                System.out.print(" ");
            }
            // star
            for(j = 0; j <= n-i; j++) {
                System.out.print("*");
            }
            space+=2;
            System.out.println();
        }

         space = 8;
        for(i = 1; i <= n; i++) {
            for(j = 1; j <= i; j++) {
                System.out.print("*");
            }

            for( j = 0; j <= space; j++){
                System.out.print(" ");
            }

            for( j = 1; j <= i; j++){
                System.out.print("*");
            }
            space -= 2;
            System.out.println();
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num: ");
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            SymVoidPatt(n);
        }
        sc.close();
    }
}
