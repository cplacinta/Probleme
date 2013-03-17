import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: Cristi
 * Date: 10/16/12
 * Time: 10:13 PM
 * To change this template use File | Settings | File Templates.
 */
public class Prob_46 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        int w = in.nextInt();
        double max = 1;
        double min = q > w ? w : q;

        for (int i = 1; i <= min; i++) {

            if ((w % i == 0) && (q % i == 0) && i > max) {
                max = i;
            }
        }
        System.out.println(max);
    }
}
