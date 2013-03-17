import java.util.Scanner;

public class Prob_71 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please give a number of elements : ");
        int n = in.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        int position = in.nextInt() % n;

        for (int i = 0; i < position; i++) {
            b[i] = a[i];
        }

        for (int i = 0; i < n - position; i++) {
            a[i] = a[position + i];
        }

        for (int i = 0; i < position; i++) {
            a[n - position + i] = b[i];
        }

        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}

