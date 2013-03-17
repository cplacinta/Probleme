import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: Cristi
 * Date: 10/16/12
 * Time: 10:13 PM
 * To change this template use File | Settings | File Templates.
 */
public class Prob_31 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please give a number of date : ");
        int pos = 0, neg = 0;
        int t;
        while (true) {
            t = in.nextInt();
            if (t == 0) {
                break;
            }
            if (t > 0) {
                pos++;
            } else {
                neg++;
            }

        }
        System.out.println("Pos= " + pos + "; Neg= " + neg);
    }
}



