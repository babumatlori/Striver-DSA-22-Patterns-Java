
// 1
// 22
// 333
// 4444
// 55555
public class Pattern04 {
    public static void Pattern4 (int n) {
        int i;
        int j;

        for( i = 1; i <= n; i++) {
            for( j = 1; j <= i; j++) {
                System.out.print(i + "");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 5;
        Pattern4(n);
    }
}
