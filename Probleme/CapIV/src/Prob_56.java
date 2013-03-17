import java.util.Scanner;

public class Prob_56 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please give a number of elements : ");
        int n = in.nextInt();
        int[] a = new int[n];
        int[] b = new int[100];

        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }

        int k = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 2; j <= a[i]; j++) {
                if (a[i] % j == 0) {
                    b[k] = j;
                    k++;
                }
            }

            System.out.print(a[i] + " -> 1, ");
            for (int t = 0; t < k; t++) {
                System.out.print(b[t] + ", ");
            }

            k = 0;
            System.out.println();
        }
    }
}
