import java.util.Scanner;

public class Prob_67 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please give a number of elements : ");
        int n = in.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = in.nextInt();
        }

        int k;
        for (int i = 0; i < n; i++) {
            k=a[i];
            a[i] = a[i] + b[i];
            b[i] = k * b[i];

            System.out.print(a[i]+ " \n");
        }

        for (int i = 0; i < n; i++) {
            System.out.print(b[i]+ " ");
        }
    }
}

