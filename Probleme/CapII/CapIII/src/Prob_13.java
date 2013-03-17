import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: Cristi
 * Date: 10/16/12
 * Time: 10:13 PM
 * To change this template use File | Settings | File Templates.
 */
public class Prob_13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please give a number of date : ");
        int n = in.nextInt();

        int sum2 = 0, sum3 = 0, k = 0, k2 = 0;
        for (int i = 1; i <= n; i++) {
            int t = in.nextInt();
            if (t > 0) {
                sum2 = sum2 + t;
                k++;
            } else {
                sum3 = sum3 + t;
                k2++;
            }
        }
        System.out.print("Pos " + sum2 / k + "; Negative " + sum3 / k2);

    }
}
