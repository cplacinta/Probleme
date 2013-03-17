import java.io.IOException;
import java.util.Scanner;

public class Prob32 {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduceti sirul X: ");
        String x;
        x = in.nextLine();
        char[] charArraySubString = x.toCharArray();
        System.out.println("Introduceti sirul Y: ");
        String y;
        y = in.nextLine();
        char[] charArrayString = y.toCharArray();

        int k = 0;
        if (x.length() > y.length()) {
            System.out.println("Sirul X nu este subsir a sirului Y!");
        } else {
            for (int i = 0; i < x.length(); i++) {
                if (charArraySubString[0] == charArrayString[i]) {
                    int g = 0;
                    int l = i;
                    k = 0;
                    while ((charArraySubString[g] == charArrayString[l])) {
                        g++;
                        l++;
                        k++;
                        if (k == x.length()) {
                            break;
                        }
                    }
                }
                if (k == x.length()) {
                    break;
                }
            }

            System.out.println(k != x.length() ? "Sirul X nu este subsir a sirului Y!" : "Sirul X este subsir a sirului Y!");
        }
    }
}

