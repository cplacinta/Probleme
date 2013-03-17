import java.util.Scanner;

public class Prob2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please give a number of lines : ");
        int n = in.nextInt();
        System.out.print("Please give a number of columns : ");
        int m = in.nextInt();
        double [][] a = new double[n][m];
        double sum=0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = in.nextInt();
                sum+=a[i][j];
            }
        }
        System.out.printf("Avg is : %2.2f\n", sum / (n*m));
        System.out.println("Numbers greater than avg are: ");
        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < m ; j++) {
                if (a[i][j] > sum/ (n*m)){
                    System.out.println(a[i][j] + " ");
                }

            }
        }

    }
}

