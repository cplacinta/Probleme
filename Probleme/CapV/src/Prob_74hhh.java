import java.util.Scanner;

public class Prob_74hhh {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please give a number of lines : ");
        int n = in.nextInt();
        int[][] a = new int[n][n];
        int[] b = new int[10];

        int magicNum = 0;
        int magicNum1 = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = in.nextInt();
                if (i == j)
                    magicNum += a[i][j];
            }
        }
        for (int i = 0; i < n; i++) {
            magicNum1 += a[n - i - 1][n - i - 1];
        }
        if (magicNum != magicNum1) {
            System.out.print("Nu e un patrat magic!");
        }
        boolean aux = true;
        int i1 = 0;
        int j1 = 0;
        for (int i = 0; i < n; i++) {
            while (i1 != n) {
                b[i] += a[i1][j1];
                i1++;
            }
            i1 = 0;
            j1++;
            if (magicNum != b[i]) {
                System.out.print("Nu e un patrat magic!");
                aux = false;
                break;
            }
            b[i] = 0;
            for (int j = 0; j < n; j++) {
                b[i] += a[i][j];

            }
            if (magicNum != b[i]) {
                System.out.print("Nu e un patrat magic!");
                aux = false;
                break;
            }
        }
        if (aux) {
            System.out.print("Tabloul dat e un patrat magic!");
        }
    }
}

