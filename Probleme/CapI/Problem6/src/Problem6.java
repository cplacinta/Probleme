import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: Cristi
 * Date: 10/15/12
 * Time: 10:21 PM
 * To change this template use File | Settings | File Templates.
 */
public class Problem6 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
    System.out.print("Please a real number : ");
    double x = in.nextDouble();

    System.out.println("1-2x +3X^2 - 4X^3= " + calculate(x));
    System.out.println("1+2x +3X^2 + 4X^3= " + calculate2(x));
}

    private static double calculate(double x) {
        return 1 - 2 * x + 3 * Math.pow(x, 2) - 4 * Math.pow(x, 3);
    }

    private static double calculate2(double x) {
        return 1 + 2 * x + 3 * Math.pow(x, 2) + 4 * Math.pow(x, 3);
    }


}