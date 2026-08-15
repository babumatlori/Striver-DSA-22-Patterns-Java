// Letter Daimond Pattern
//    A
//   ABC
//  ABCDE
// ABCDEFG

import java.util.Scanner;

public class Pattern17 {
        static void LetDaiPatt(int n) {
            int i;
            int j;
            for(i = 1; i <= n; i++) {
                for(j = 1; j <= n-i; j++){
                    System.out.print(" ");
                }

                 for (char ch = 'A'; ch <= 'A' + i - 1; ch++) {
                System.out.print(ch + " ");
            }

                for (char ch = (char) ('A' + i - 2); ch >= 'A'; ch--) {
                System.out.print(ch + " ");
            }
                System.out.println();
            }
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a num: ");
            if (sc.hasNextInt()) {
                int n = sc.nextInt();
                LetDaiPatt(n);
            }
            sc.close();
        }
}

