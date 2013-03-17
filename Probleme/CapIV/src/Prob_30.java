import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: Cristi
 * Date: 10/16/12
 * Time: 10:13 PM
 * To change this template use File | Settings | File Templates.
 */
public class Prob_30 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please give a number of elements : ");
        int n = in.nextInt();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int maxPosition = 0;
        int minPosition = 0;
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
            if (a[i] > max) {
                max = a[i];
                maxPosition = i;
            }
            if (a[i] < min) {
                min = a[i];
                minPosition = i;
            }
        }
        if ((maxPosition - minPosition == 1) || (minPosition - maxPosition == 1)) {
            System.out.println("sum = 0");
            return;
        }
        int startIndex = Math.min(minPosition, maxPosition);
        int endIndex = Math.max(minPosition, maxPosition);
        int sum = 0;
        for (int i = startIndex + 1; i < endIndex; i++) {
            sum += a[i];
        }

        System.out.println(sum);
    }
}
