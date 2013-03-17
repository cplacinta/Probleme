import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: Cristi
 * Date: 10/16/12
 * Time: 10:13 PM
 * To change this template use File | Settings | File Templates.
 */
public class Prob_10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please give a number of date : ");
        int n = in.nextInt();

        int sum=0;
        int product=0;
        int i=1;
        while (i <= n) {
            if (n % i == 0) {
                sum = sum + i;
                product = product * i;
                System.out.print(i + "; ");
            }
            i++;
        }
        System.out.print("Sum= " + sum + "; Product= " + product);



    }
}
