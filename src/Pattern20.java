// Butter fly wings Pattern 20
// *        *
// **      **
// ***    ***
// ****  ****
// **********
// ****  ****
// ***    ***
// **      **
// *        *

import java.util.Scanner;

public class Pattern20 {
    static void ButFlyPatt( int n) {
        int i;
        int j;
        int space = 2*n-2;
        for(i = 1; i <= 2* n-1; i++) {
            int star = i;
            if (i>n) star = 2*n-i;
            // star
            for(j = 1; j <= star; j++){
                System.out.print("*");
            }
            // space
            for(j = 1; j <= space; j++ ){
                System.out.print(" ");
            }
            // star
            for(j = 1; j <= star; j++) {
                System.out.print("*");
            }
            System.out.println();
            if (i<n) space -=2;
            else space +=2;
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num: ");
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            ButFlyPatt(n);
        }
        sc.close();
    }
}
