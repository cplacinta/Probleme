import java.util.Scanner;

public class Prob_58 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please give a number of elements : ");
        int n = in.nextInt();
        int[] a = new int[n];
        int[] b = new int[4];

        for (int i = 0; i < n; i++) {
            int aux = in.nextInt();

            while (aux >= 9999) {
                System.out.println("Error");
                aux = in.nextInt();
            }

            a[i] = aux;
        }

        for (int i = 0, k = 0, reverse = 0; i < n; i++, reverse = 0) {

            while (a[i] % 10 > 0) {
                b[k] = a[i] % 10;
                a[i] /= 10;
                k++;
            }

            int j = 0;
            while (k > 0) {
                reverse += b[j] * Math.pow(10, k - 1);
                j++;
                k--;
            }

            System.out.println(reverse);
        }
    }
}
