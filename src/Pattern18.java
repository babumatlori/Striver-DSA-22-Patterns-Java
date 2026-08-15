// Alpha Triangle\
// E
// D E
// C D E
// B C D E 
// A B C D E

import java.util.Scanner;

public class Pattern18 {
    static void AlpTra(int n) {
        int i;
        int j;

        for( i = 0; i < n; i++) {
         char start = (char) ('A' + n - 1 - i);
            for(char ch = start; ch <= 'A' + n - 1; ch++) {
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
            AlpTra(n);
        }
        sc.close();
    }
}
