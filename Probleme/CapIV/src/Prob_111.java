import java.util.Scanner;

public class Prob_111 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please give a number of elements : ");
        int n = in.nextInt();
        double[] a = new double[n];
        double sum = 0;

        for (int i = 0; i < n; i++) {
            a[i] = in.nextDouble();
            sum += a[i];
        }

        System.out.println("Cantitatea medie de precipitatii: " + sum / (n - 1));

        for (int i = 0; i < n; i++) {
            System.out.printf("%6.2f", a[i]);
            a[i] = Math.abs(a[i] - sum / (n - 1));
        }

        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.printf("%6.2f", a[i]);
        }
    }
}

