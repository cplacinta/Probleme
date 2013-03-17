import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: Cristi
 * Date: 10/16/12
 * Time: 10:13 PM
 * To change this template use File | Settings | File Templates.
 */
public class Prob_88 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please give a number of elements : ");
        int n = in.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
            b[n-i-1]= a[i];
        }

        for (int i = 0; i < n; i++) {
            System.out.print(b[i] + " ");
        }

    }
}

