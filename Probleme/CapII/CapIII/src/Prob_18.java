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

        System.out.println("f(x)= 2x^2+7x");
        for (double x = -2; x <= 8; x++) {
            System.out.println("f(" + x + ")=" + (2 * Math.pow(x, 2) + 7 * x));
        }

        for (double x = -2; x <= 8; x += 0.5) {
            System.out.println("f(" + x + ")=" + (2 * Math.pow(x, 2) + 7 * x));
        }
    }
}
