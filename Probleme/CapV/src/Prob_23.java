import java.util.Scanner;

public class Prob_23 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please give a number of lines : ");
        int n = in.nextInt();
        System.out.print("Please give a number of columns : ");
        int m = in.nextInt();
        int[][] a = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = in.nextInt();
            }
        }

        int t;
        for (int j = 0; j < m; j++) {
            for (int i = 0; i < n; i++) {
                if (i == j) {
                    t = a[i][j];
                    a[i][j] = a[i][n - j - 1];
                    a[i][n - j - 1] = t;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}

