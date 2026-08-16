// The Number Pattern
// 4444444
// 4333334
// 4322234
// 4321234
// 4322234
// 4333334
// 4444444

import java.util.Scanner;

public class Pattern22 {
        static void NumPatt(int n) {

            int i;
            int j;
            int size = 2 * n - 1;
            for( i = 0; i < size; i++) {
                for(j = 0; j < size; j++) {
                    int top = i;
                    int left = j;
                    int bottom = size - 1 - i;
                    int down = size - 1 - j;

                    int minDistance = Math.min(Math.min(top, bottom),
                                      Math.min(left, down));

                    System.out.print(n - minDistance);
                }
                System.out.println();
            }

        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a Number: ");
            if(sc.hasNextInt()) {
                int n = sc.nextInt();
                NumPatt(n);
            }
            sc.close();
        }
}
