import java.util.Scanner;

public class Pattern11 {
    static void BinaryNumPat(int n) {
        int i;
        int j;
        int start = 1;

        for(i = 0; i < n; i++ ) {
            if (i%2==0) {

                start = 1;
            }else{
                start = 0;
            }
            for(j = 0; j< i; j++) {
                System.out.print(start + "");
                start = 1 - start;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no. : ");
        if (sc.hasNextInt()) {
           int n = sc.nextInt();
            BinaryNumPat(n);
        }
        sc.close();
    }
}
