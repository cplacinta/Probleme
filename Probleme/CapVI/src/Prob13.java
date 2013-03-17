import java.io.IOException;
import java.util.Scanner;

public class Prob13 {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduceti sirul: ");
        String str;
        str = in.nextLine();

        boolean strCompare = true;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {

            }
        }
        int i = 0;
        int k = 0;
        while (str.charAt(i) != '.'){
            if (str.charAt(i) != ' ') {
                k++;
            }
            i++;

        }

    }
}

