import java.util.Scanner;

public class Prob_21 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please give a number of lines : ");
        int n = in.nextInt();
        System.out.print("Please give a number of columns : ");
        int m = in.nextInt();
        int[][] a = new int[n][m];
        int[] b = new int[m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (b[j] == 0){
                    b[j] = 1;
                }

                a[i][j] = in.nextInt();
                b[j] *= a[i][j];
            }
        }

        for (int j = 0; j < m; j++) {
            System.out.print(b[j] + " ");
        }
    }
}

