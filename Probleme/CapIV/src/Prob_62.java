import java.util.Scanner;

public class Prob_62 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please give a number of elements : ");
        int n = in.nextInt();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int k = 0;
        int k1 = 0;
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();

            if (a[i] > max) {
                max = a[i];
                k = i;
            }

            if (a[i] < min) {
                min = a[i];
                k1 = i;
            }
        }

        a[k] = min;
        a[k1] = max;

        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }
    }
}
