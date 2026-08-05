
// Reverse Right Half Pyramid Pattern 04

// *****
// ****
// ***
// **
// *
public class Pattern05 {
    public static void reverseTrangle( int n) {
        int i;
        int j;

        for(i = n; i>=1; i--) {
            for( j = 1; j <= i; j++) {
                System.out.print("*");
            }
                System.out.println();
        }
    }
    public static void main(String[] args) {
        int n = 5;
        reverseTrangle(n);

    }
}
