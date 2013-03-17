import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: Cristi
 * Date: 10/16/12
 * Time: 10:13 PM
 * To change this template use File | Settings | File Templates.
 */
public class Prob_15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please give a number of date : ");
        int n = in.nextInt();
        int counter = 10 ;

        switch (n) {
            case 1:
                break;
            case 2:  counter = counter+15;
                break;
            case 3:  counter = counter+15*2;
                break;
            case 4:  counter = counter+15*3;
                break;
            case 5:  counter = counter+15*4;
                break;
            case 6:  counter = counter+15*5;
                break;
            case 7:  counter = counter+15*6;
                break;
            default: System.out.println("Error!");
                return;

        }
        System.out.print(counter);
    }
}
