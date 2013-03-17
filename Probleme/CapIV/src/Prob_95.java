import java.util.Scanner;

public class Prob_95 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please give a number of elements : ");
        int n = in.nextInt();
        int[] a = new int[n];
        int nDiv2 = (int) Math.round((double) n / 2);
        int[] b = new int[nDiv2];

        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }

        for (int i = 0; i < nDiv2; i++) {
            b[i] = a[i] + a[n - i - 1];
        }

        if (n % 2 == 1) {
            b[(n / 2)] = a[n / 2];
        }

        for (int i = 0; i < nDiv2; i++) {
            System.out.print(b[i] + " ");
        }
    }
}

