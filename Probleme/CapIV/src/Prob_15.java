import java.util.Scanner;

public class Prob_15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please give a number of elements : ");
        int n = in.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        int counter = 0;
        boolean isSmaller = false;
        for (int i = 0; i < n - 1; i++, isSmaller = false) {
            for (int j = 0; j < i + 1; j++) {
                if (a[i + 1] < a[j]) {
                    isSmaller = true;
                    break;
                }
            }
            if (!isSmaller) {
                counter++;
            }
        }

        System.out.println(counter);
    }
}
