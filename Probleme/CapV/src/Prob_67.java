import java.util.Scanner;

public class Prob_67 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please give a number of lines : ");
        int n = in.nextInt();
        System.out.print("Please give a number of columns : ");
        int m = in.nextInt();
        int[][] a = new int[n][m];

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = in.nextInt();
                if (a[i][j] > max) {
                    max = a[i][j];
                }
            }
        }

        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (max == a[i][j]) {
                    for (int t = 0; t < m; t++) {
                        sum += a[i][t];
                    }
                    a[i][j] = sum;
                    sum = 0;
                }
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}

