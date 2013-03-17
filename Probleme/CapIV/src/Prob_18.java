import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: Cristi
 * Date: 10/16/12
 * Time: 10:13 PM
 * To change this template use File | Settings | File Templates.
 */
public class Prob_18 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please give a number of elements : ");
        int n = in.nextInt();
        int k = 0;
        int[] a = new int[n];
        a[0] = in.nextInt();

        for (int i = 1; i < n; i++) {
            a[i] = in.nextInt();
            if (a[i] * a[i - 1] < 0) {
                k++;
            }
        }

        System.out.println(k);
    }
}
