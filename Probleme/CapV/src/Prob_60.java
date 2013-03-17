import java.util.Scanner;

public class Prob_60 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please give a number of lines : ");
        int n = in.nextInt();
        int[] a = new int[n];
        int[][] b = new int[n][n];

        int t = 1;
        for (int i = 0; i < n; i++) {
            a[i] = t++;
        }

        for (int i = 0; i < n; i++) {
            for (int l = 0; l < i; l++) {
                b[i][l] = a[n - i + l];
                System.out.print(b[i][l] + " ");
            }
            for (int j = i; j < n; j++) {
                b[i][j] = a[j - i];
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }
    }
}

