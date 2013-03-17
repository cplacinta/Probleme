import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: Cristi
 * Date: 10/16/12
 * Time: 8:20 PM
 * To change this template use File | Settings | File Templates.
 */
public class Prob2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please give a number of date : ");
        int x = in.nextInt();
        int b =in.nextInt();
        double result = 0;
        String dayString = in.next();
        /*switch (x) {
            case 1:  dayString = "Monday";
                break;
            case 2:  dayString = "Tuesday";
                break;
            case 3:  dayString = "Thursday";
                break;
            case 4:  dayString = "Wensday";
                break;
            case 5:  dayString = "Friday";
                break;
            case 6:  dayString = "Saturdat";
                break;
            case 7:  dayString = "Sunnday";
                break;
            default: dayString = "Invalid Day";
                break;
        }*/
        switch (dayString) {
            case "+":  result = x+b ;
                break;
            case "-":  result = x-b;
                break;
            case "*":  result = x*b;
                break;
            case "/":  result = x/b;
                break;
            default: System.out.println("Error!");
                return;
        }

        System.out.println(""+ result);
    }

}
