import java.util.Scanner;

public class Prob_59 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please give a number of lines : ");
        int n = in.nextInt();

        int[][] a = new int[n][n];
        int[] b = new int[n];

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = in.nextInt();
                if (i == j && max < a[i][j]) {
                    max = a[i][j];
                    b[0] = i;
                    b[1] = j;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = b[1]; j < n - 1; j++) {
                a[i][j] = a[i][j + 1];
            }
        }

        for (int j = 0; j < n - 1; j++) {
            for (int i = b[1]; i < n - 1; i++) {
                a[i][j] = a[i + 1][j];
            }
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}

