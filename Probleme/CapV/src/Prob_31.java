import java.util.Scanner;

public class Prob_31 {
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

        boolean identifier = true;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (a[i][j] != a[j][i]) {
                    identifier = false;
                    break;
                }
            }
        }

        System.out.println("Tabloul" + (!identifier ? " nu" : "") + " este identic fata de diagonala principala");
    }
}