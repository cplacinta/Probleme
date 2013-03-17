import java.util.Scanner;

public class Prob_40 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please give a number of lines : ");
        int n = in.nextInt();
        System.out.print("Please give a number of columns : ");
        int m = in.nextInt();
        int[][] a = new int[n][m];

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = in.nextInt();
                if (min > a[i][j]) {
                    min = a[i][j];
                }
            }
        }

        System.out.print("Elementul minim se gaseste pe uramtoarele rinduri:\n");
        int t ;
        for (int j = 0; j < m; j++) {
            for (int i = 0; i < n; i++) {
                if (a[i][j] == min) {
                    t = i+1;
                    System.out.print(t + " ");
                }
            }
        }
    }
}

