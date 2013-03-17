import java.util.Scanner;

public class Prob_61 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please give a number of lines : ");
        int n = in.nextInt();
        int[][] a = new int[n][n];
        a[0][0] = 1;
        System.out.printf("%4d\n", a[0][0] );


        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                if (j == 0 || j == i + 1) {
                    a[i][j] = 1;
                } else {
                    a[i][j] = a[i - 1][j] + a[i - 1][j - 1];
                }
                System.out.printf("%4d", a[i][j] );
            }
            System.out.println();
        }
    }
}

