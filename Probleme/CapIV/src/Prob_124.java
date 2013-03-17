import java.util.Scanner;

public class Prob_124 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please give a number of elements : ");
        int n = in.nextInt();
        int[] a = new int[8];
        int[] b = new int[] {500, 200, 100, 50, 20, 10, 5, 1};

        System.out.printf("Suma %d contine\n", n);
        int i = 0;
        while (n > 0) {
            if (n >= b[i] ) {
                a[i] = n / b[i];
                n %= b[i];
                System.out.printf("%d bancnote de %d\n", a[i], b[i]);
            }
            i++;
        }
    }
}