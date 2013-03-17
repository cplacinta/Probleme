import java.util.Scanner;

public class Prob_28ggg {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please give the number of a month : ");
        int[][] a = new int[5][7];


        int t = 1;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 7; j++) {
                    a[i][j] = t++;
                System.out.print(a[i][j] + " ");
                if (a[i][j] > 30) {
                    break;
                }
            }
            System.out.println();
        }
    }
}

