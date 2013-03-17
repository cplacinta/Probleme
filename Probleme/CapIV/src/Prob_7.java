import java.util.Scanner;

public class Prob_7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please give a number of elements : ");
        int n = in.nextInt();
        int k = 0;
        int[] a = new int[n];
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
            if (a[i] < min) {
                min = a[i];
            }
        }

        for (int i = 0; i < n; i++) {
            if (a[i] == min) {
                k++;
            }
        }
        System.out.println(k);
    }
}
