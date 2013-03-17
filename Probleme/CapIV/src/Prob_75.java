import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: Cristi
 * Date: 10/16/12
 * Time: 10:13 PM
 * To change this template use File | Settings | File Templates.
 */
public class Prob_75 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please give a number of elements : ");
        int n = in.nextInt();
        double[] a = new double[n];
        double[] b = new double[n];
        double medAritA;
        double medAritB;
        int sumA = 0;
        int sumB = 0;

        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
            sumA += a[i];
        }
        for (int i = 0; i < n; i++) {
            b[i] = in.nextInt();
            sumB += b[i];
        }

        medAritA = sumA / n;
        medAritB = sumB / n;

        for (int i = 0; i < n; i++) {
            if (a[i] < 0 && b[i] < 0) {
                a[i] += 0.5;
                b[i] += 0.5;
            } else if (a[i] < 0) {
                a[i] = a[i] * a[i];
            } else if (b[i] < 0) {
                b[i] = b[i] * b[i];
            } else {
                a[i] = medAritA;
                b[i] = medAritB;
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.print(b[i] + " ");
        }
    }
}

