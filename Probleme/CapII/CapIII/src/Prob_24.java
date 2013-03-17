import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: Cristi
 * Date: 10/16/12
 * Time: 10:13 PM
 * To change this template use File | Settings | File Templates.
 */
public class Prob_24 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please give a number of date : ");

        double sum4 = 1;
        double i=1;
        while (sum4 / (sum4 + 1) <= 0.999) {
            sum4 += i / (i + 1);
            i++;
        }
        System.out.println(sum4);

    }
}
