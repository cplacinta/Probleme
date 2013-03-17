import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: Cristi
 * Date: 10/15/12
 * Time: 11:10 PM
 * To change this template use File | Settings | File Templates.
 */
public class Problem7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please give 3 int numbers : ");
        int a = 2;
        int b = -4;
        int c = 0;

        if ((a + b) > 0) {
            printAscending(a, b, c);
        } else if (b > c) {
            System.out.println(b + " ; " + c);
        } else {
            System.out.println(c + " ; " + b);
        }

        double x1 = (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
        double x2 = (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
        System.out.println("x1= " + x1 + "; x2= " + x2);

        int x = in.nextInt();
        int y = in.nextInt();
        int z = in.nextInt();
        int p = x + y + z;

        if ((x >= y + z) || (y >= x + z) || (z >= y + x)) {
            System.out.println("Error!");
        } else {
            if (x == y && x == z) {
                System.out.println("Triunghi Echilateral");
            } else {
                System.out.println("Triunghi nu e Echilateral");
                if ((x == y) || (x == z) || (y == z)) {
                    System.out.println("Triunghi Isoscel");
                } else {
                    System.out.println("Triunghi Scalen");
                }
            }
            System.out.println("Perimeter: " + p);
        }
    }


    private static void printAscending(int a, int b, int c) {
        if (a > b && a > c) {
            if (b > c) {
                System.out.println(a + " ; " + b + " ; " + c);
            } else {
                System.out.println(a + " ; " + c + " ; " + b);
            }
        } else if (a < b && a < c) {
            if (b > c) {
                System.out.println(b + " ; " + c + " ; " + a);
            } else {
                System.out.println(c + " ; " + b + " ; " + a);
            }
        } else {
            if (b > a) {
                System.out.println(b + " ; " + a + " ; " + c);
            } else {
                System.out.println(c + " ; " + a + " ; " + b);
            }
        }
    }


}
