import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: Cristi
 * Date: 10/16/12
 * Time: 10:13 PM
 * To change this template use File | Settings | File Templates.
 */
public class Prob_22 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please give a number of date : ");
        int n = in.nextInt();

        double sum4 = 1;
        for (double i=1; i<=n;){
            sum4+=i/++i;
        }
        System.out.print(String.format("%.3f",sum4));
    }
}
