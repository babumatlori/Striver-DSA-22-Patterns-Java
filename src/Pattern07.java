// Triangle Star Pattern

import java.util.Scanner;

public class Pattern07 {

    static void TrianglePattern(int n) {
        int i;
        int j;

        for( i = 0; i < n; i++) {
            // space
            for(j = n- i; j>1; j--  ) {
                System.out.print(" ");
            }
                for( j = 0; j<=i; j++){
                    System.out.print("* ");
                }
                System.out.println();

        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n0:");

        if(sc.hasNextInt()) {
            int n= sc.nextInt();
            TrianglePattern(n);
        }

        sc.close();
    }

}
