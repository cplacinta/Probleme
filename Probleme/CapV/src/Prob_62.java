import java.util.Scanner;

public class Prob_62 {
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

        int sumUnderDiag = 0;
        int sumAboveDiag = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < m; j++) {
                sumUnderDiag += a[j][i];
                sumAboveDiag += a[i][j];
            }
        }

        System.out.print("Elementele mai sus de diagonala principala si cu cele mai jos de ea"
                + (sumAboveDiag == sumUnderDiag ? "" : " NU") + " sunt egale");
    }
}

