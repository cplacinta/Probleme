import java.io.IOException;
import java.util.Scanner;

public class Prob26 {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduceti sirul: ");
        String str;
        str = in.nextLine();
        char[] charArray = str.toCharArray();

        int k = 0;
        for (int i = 0; i < str.length(); i++) {
                if ((int)(charArray[i]) >= 49 && (int)(charArray[i]) <= 57) {
                    System.out.print("Prima cifra din sir se afla pe pozitia " + (i + 1));
                    break;
                }
            }

    }
}

