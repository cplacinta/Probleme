import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: Cristi
 * Date: 10/16/12
 * Time: 10:13 PM
 * To change this template use File | Settings | File Templates.
 */
public class Prob_32 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please give a number of elements : ");
        int n = in.nextInt();
        int result = 1;
        int[] a = new int[n];
        int[] b = new int[n];

        System.out.println("Give " + n + " elements: \n");
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }

        System.out.println("Give another " + n + " elements: \n");
        for (int i = 0; i < n; i++) {
            b[i] = in.nextInt();
        }

        for (int i = 0; i < n; i++) {
            result *= a[i]+ b[n-1-i];
        }

        System.out.println(result);
    }
}
