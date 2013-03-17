import java.util.Scanner;

public class Prob_10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please give a number of lines : ");
        int n = in.nextInt();
        int[][] a = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = in.nextInt();
            }
        }

        int t;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                t = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = t;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

    }
}

