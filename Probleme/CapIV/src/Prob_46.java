import java.util.Scanner;

class Prob_46 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please give a number of elements : ");
        int n = in.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        int[] c = new int[n];
        int k = 0;

        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();

            boolean found = false;
            for (int j = 0; j < k; j++) {
                if (b[j] == a[i]) {
                    c[j]++;
                    found = true;
                    break;
                }
            }

            if (!found) {
                b[k] = a[i];
                c[k] = 1;
                k++;
            }
        }

        int max = c[0];
        int j = 0;

        for (int i = 1; i < k; i++) {
            if (c[i] > max) {
                max = c[i];
                j = i;
            }
        }

        System.out.printf("Numarul %d se intilneste de %d ori\n", b[j], max);
    }
}

