import java.util.Scanner;

public class Prob_70 {
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

        int min = Integer.MAX_VALUE;
        int minRow = 0;
        int minColumn = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                for (int k = i; k < n; k++) {
                    for (int l = k > i ? 0 : j; l < m; l++) {
                        if (a[k][l] < min) {
                            min = a[k][l];
                            minRow = k;
                            minColumn = l;
                        }
                    }
                }

                int aux = a[i][j];
                a[i][j] = a[minRow][minColumn];
                a[minRow][minColumn] = aux;
                min = Integer.MAX_VALUE;
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}

