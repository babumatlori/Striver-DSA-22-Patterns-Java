import java.util.Scanner;

public class Pattern10 {
    static void halfFullPyramid(int n) {
        int i;
        int j;

        for(i= 0; i<n; i++) {
            for(j = 0; j<i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }

        for(i=n; i >= 1; i--) {
            for(j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a No.: ");
        if(sc.hasNextInt()){
            int n = sc.nextInt();
            halfFullPyramid(n);
        }
    }
}
