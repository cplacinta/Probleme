import java.util.Scanner;

public class Prob_121 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please give a number of elements : ");
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        int k = 0;
        int k1 = 0;
        int max = Math.abs(a[1] - a[0]);
        for (int i = 2; i < n; i++) {
            int difference = a[i] - a[i - 1];
            if (difference > max)   {
                max = difference;
                k = a[i-1];
                k1 = a[i];
            }
        }

        System.out.println("Perioada cea mai lunga dintre 2 seisme este de: " + max);
        System.out.println("Si perioada a fost intre anii " + k + " - " +k1);

    }
}

