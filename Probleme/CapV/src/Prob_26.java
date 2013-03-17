public class Prob_26 {
    public static void main(String[] args) {
        int[][] a = new int[10][10];

        int t = 1;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                a[i][j] += t;
                t++;
                System.out.printf("%4d", a[i][j]);
            }
            System.out.println();
        }
    }
}

