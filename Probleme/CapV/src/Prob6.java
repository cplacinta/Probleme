import java.util.Scanner;

public class Prob6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please give a number of lines : ");
        int n = in.nextInt();
        int m = n;
        int [][] a = new int[n][m];
        int maxElPrin=0;
        int maxElSecun=0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = in.nextInt();
                if (j == i && a[i][j] > maxElPrin) {
                    maxElPrin = a[i][j];
                }
                if (j == m - i - 1 && a[i][j] > maxElSecun) {
                    maxElSecun = a[i][j];
                }
            }
        }

         System.out.println("Elementul maxim de pe diagonala principala este: " + maxElPrin);
         System.out.println("Elementul maxim de pe diagonala secundara este: " + maxElSecun);
    }
}

