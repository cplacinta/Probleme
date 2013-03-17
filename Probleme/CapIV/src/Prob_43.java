import java.util.Scanner;

public class Prob_43 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please give a number of elements : ");
        int n = in.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }

        int k = 0;
        int maxZero = 0;

        for (int i = 0; i < n; i++) {
            while (a[i] == 0) {
                k++;
                i++;
            }

            if (maxZero < k) {
                maxZero = k;
                k = 0;
            }
        }

        System.out.print(maxZero);
    }
}

