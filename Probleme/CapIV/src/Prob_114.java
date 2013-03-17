import java.util.Scanner;

public class Prob_114 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please give a number of elements : ");
        int n = in.nextInt();
        int[] a = new int[9];
        int x = 0;
        while (n > 0) {
            a[x] = n % 10;
            n /= 10;
            x++;
        }
        int t;

        for (int i = 0; i < x; i++) {
            for (int j = 1; j < x - i; j++) {
                if (a[j - 1] > a[j]) {
                    t = a[j - 1];
                    a[j - 1] = a[j];
                    a[j] = t;
                }
            }
        }

        for (int i = 0; i < x; i++) {
            System.out.print(a[i]);
        }

    }
}