// Hellow Traingle Pattern 21
// *****
// *   *
// *   *
// *   *
// *****
import java.util.Scanner;

public class Pattern21 {
    static void HellTrPatt(int n) {
        int i;
        int j;

        for(i = 0; i < n; i++) {
            for( j = 0; j < n; j++){
                if (i == 0 || j == 0 || i == n-1 ||j == n-1) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num: ");
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            HellTrPatt(n);
        }
        sc.close();
    }
}
