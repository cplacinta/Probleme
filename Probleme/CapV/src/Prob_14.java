public class Prob_14 {
    public static void main(String[] args) {
        int n = 8;
        int m = 8;
        int[][] a = new int[][]{
                new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, 10, 9, 16, 13, Integer.MAX_VALUE,},
                new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE,
                        29, 7, Integer.MAX_VALUE},
                new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, 19,
                        Integer.MAX_VALUE, Integer.MAX_VALUE, 19},
                new int[]{10, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, 10, Integer.MAX_VALUE, 20,
                        Integer.MAX_VALUE},
                new int[]{9, Integer.MAX_VALUE, 19, 10, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, 27},
                new int[]{16, 29, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, 26, 6},
                new int[]{13, 7, Integer.MAX_VALUE, 20, Integer.MAX_VALUE, 26, Integer.MAX_VALUE, Integer.MAX_VALUE},
                new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE, 19, Integer.MAX_VALUE, 27, 6, Integer.MAX_VALUE,
                        Integer.MAX_VALUE,}};


        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (i != j
                        && a[i][k] != Integer.MAX_VALUE && a[k][j] != Integer.MAX_VALUE
                        && a[i][k] + a[k][j] < a[i][j]) {
                            a[i][j] = a[i][k] + a[k][j];
                    }
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (a[i][j] == Integer.MAX_VALUE) {
                    System.out.print("*   ");
                } else {
                    System.out.printf("%-4d", a[i][j]);
                }
            }
            System.out.println();
        }

    }
}

