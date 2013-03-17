import java.util.Scanner;

public class Prob_25 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please give a number of lines : ");
        int n = in.nextInt();
        int[][] a = new int[n][n];

        int horizontalBorder = n - 1;
        int verticalBorder = n - 1;
        int i = 0;
        int j = 0;
        boolean isLine = true;
        boolean forwardLine = true;
        boolean forwardColumn = true;

        for (int value = 1; value <= n * n; value++) {
            if (isLine) {
                boolean finishedProcessingLine = !forwardLine && n - horizontalBorder - 1 == j;
                if (horizontalBorder == j && forwardLine || finishedProcessingLine) {
                    if (finishedProcessingLine) {
                        horizontalBorder--;
                    }
                    isLine = false;
                    forwardLine = !forwardLine;
                    value--;
                } else {
                    a[i][j] = value;
                    j = forwardLine ? j + 1 : j - 1;
                }
            } else {
                boolean finishedProcessingColumn = !forwardColumn && n - verticalBorder == i;
                if (verticalBorder == i && forwardColumn || finishedProcessingColumn) {
                    if (finishedProcessingColumn) {
                        verticalBorder--;
                    }

                    isLine = true;
                    forwardColumn = !forwardColumn;
                    value--;
                } else {
                    a[i][j] = value;
                    i = forwardColumn ? i + 1 : i - 1;
                }
            }
        }


        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                System.out.printf("%5d", a[i][j]);
            }
            System.out.println();
        }
    }
}

