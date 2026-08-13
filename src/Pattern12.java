// Number Crown Pattern 12

// 1      1
// 12    21
// 123  321
// 12344321

import java.util.Scanner;

public class Pattern12 {
    static void CrownPatt( int n)  {
        int i ;
        int j ;
        int space = 2 * (n - 1) + 1;

        for( i = 1; i <= n; i++) {
            // numbers
            for(j = 1; j <= i; j++) {
                System.out.print(j);
            }

            // space
            for( j = 1; j < space; j++) {
                System.out.print(" ");
            }

            // numbers
            for( j = i; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
            space -= 2;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        if(sc.hasNextInt()) {
            int n = sc.nextInt();
            CrownPatt(n);
        }
        sc.close();
    }

}
