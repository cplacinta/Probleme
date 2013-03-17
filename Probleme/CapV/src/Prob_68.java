import java.util.Scanner;

public class Prob_68 {
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

        int aux;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m ; j++) {
                for (int k = 0; k < m - 1; k++) {
                    if (a[i][k] > a[i][k + 1]) {
                        aux = a[i][k];
                        a[i][k] = a[i][k + 1];
                        a[i][k + 1] = aux;
                    }
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

