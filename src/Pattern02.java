public class Pattern02 {

    public static void halfRightpyramid( int n) {

        int i;
        int j;

        for(i = 0; i < n ; i++) {
            for( j = 0; j < i; j++) {
                System.out.print("*");
            }
                System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 7;
        halfRightpyramid(n);
    }

}
