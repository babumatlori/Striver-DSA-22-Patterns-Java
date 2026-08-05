

// 1
// 22
// 333
// 4444
// 55555
// 666666
// Number-Increasing Pyramid Pattern
public class Pattern03 {

    public static void NumberIncPyrPattern(int n) {
         int i;
         int j;

         for( i = 1; i <= n; i++ ) {
            for(j = 1; j <= i ; j++ ) {
                System.out.print(j + "");
            }
            System.out.println();
         }

    }

    public static void main(String[] args) {
        int n = 6;
        NumberIncPyrPattern(n);
    }

}
