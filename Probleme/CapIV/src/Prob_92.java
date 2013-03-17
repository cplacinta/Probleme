import java.util.Scanner;

public class Prob_92 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please give a number of elements : ");
        int n = in.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        int[] c = new int[2 * n];

        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = in.nextInt();
        }

        for (int i = 0; i < n ; i++){
            if (i % 2 ==1){
                c[i]=a[i];
            } else {
                c[i]=b[i];
            }
        }

        for (int i = 0; i < 2*n; i++) {
            System.out.print(c[i] + " ");
        }

    }
}

