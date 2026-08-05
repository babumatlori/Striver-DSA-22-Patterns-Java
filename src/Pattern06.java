// Reverse number pattern 06
// 12345
// 1234
// 123
// 12
// 1
public class Pattern06 {
    public static void ReverseNumPatter(int n) {
        int i;
        int j;

        for( i = n ; i>=1; i--) {
            for( j = 1; j <=i; j++) {
                System.out.print(j+ "");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 5;
        ReverseNumPatter(n);
    }
}
