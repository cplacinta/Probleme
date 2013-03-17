import java.util.Scanner;

public class Prob_104 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please give a number of elements : ");
        int n = in.nextInt();
        double[] a = new double[n];
        double[] b = new double[2 * n];

        for (int i = 0; i < n; i++) {
            a[i] = in.nextDouble();
            b[i * 2] = a[i];
        }

        for (int i = 1; i < n * 2 - 1; i += 2) {
            b[i] = (b[i + 1] + b[i - 1]) / 2;
            System.out.print(b[i - 1] + " " + b[i] + " ");
        }
        System.out.print(b[n * 2 - 2]);

    }
}

